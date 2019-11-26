package structure.proxy;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 票务代理
 *
 * @author zhyyy 2019/11/7
 **/
public class TickerSellerProxy implements TicketSeller {

    @Override
    public String name() {
        return "跑得快票务代理";
    }

    @Override
    public void purchase(String targetPlace) {
        for (TicketSeller seller : SELLER_LIST) {
            if (seller.moreTicket(targetPlace)) {
                seller.purchase(targetPlace);
                System.out.println("交易完成，" + name() + "收取手续费5元");
                return;
            }
        }
        System.out.println("暂无余票前往" + targetPlace);
    }

    @Override
    public boolean moreTicket(String targetPlace) {
        return SELLER_LIST.stream().anyMatch(s -> s.moreTicket(targetPlace));
    }

    /**
     * 所有seller的集合
     */
    private static final List<TicketSeller> SELLER_LIST = new ArrayList<>(16);

    // 动态代理获取当前包下的所有seller
    static {
        // 当前包名字
        String packageName = TicketSeller.class.getPackageName();
        // 包名对应的路径名称
        String packageDirName = packageName.replace('.', '/');
        Enumeration<URL> dirs;
        try {
            dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
            while (dirs.hasMoreElements()) {
                URL url = dirs.nextElement();
                String protocol = url.getProtocol();
                if ("file".equals(protocol)) {
                    String filePath = URLDecoder.decode(url.getFile(), StandardCharsets.UTF_8);
                    File dir = new File(filePath);
                    // 在给定的目录下找到所有的文件，并且进行条件过滤
                    File[] dirFiles = dir.listFiles(file -> {
                        // 接受class文件
                        return file.getName().endsWith("class");
                    });
                    if (dirFiles != null) {
                        for (File file : dirFiles) {
                            String className = file.getName().substring(0, file.getName().length() - 6);
                            try {
                                // 加载类
                                Class<? extends TicketSeller> clzTemp =
                                        (Class<TicketSeller>) Thread.currentThread().getContextClassLoader().loadClass(packageName + "." + className);
                                if (clzTemp != TickerSellerProxy.class && clzTemp != TicketSeller.class) {
                                    SELLER_LIST.add(clzTemp.getConstructor().newInstance());
                                }
                            } catch (Exception ignored) {
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
