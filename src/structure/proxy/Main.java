package structure.proxy;

/**
 * 代理模式
 * 某些原因需要给某对象提供一个代理以控制对该对象的访问，此时访问对象不适合或者不能直接引用目标对象。
 * 代理对象作为访问对象和目标对象之间的中介。代理模式主要的指的动态代理模式，比如Spring的AOP代理，静态代理模式应用意义不大。
 * <p>
 * 该栗子使用JAVA反射实现动态代理模式。
 *
 * @author zhyyy 2019/11/7
 * @see TickerSellerProxy
 **/
public class Main {
    public static void main(String[] a) {
        // 创建票务代理
        TickerSellerProxy sellerProxy = new TickerSellerProxy();

        System.out.println("查询有无到深圳的火车票：" + sellerProxy.moreTicket("深圳"));

        // 购票
        sellerProxy.purchase("北京");
        sellerProxy.purchase("哈尔滨");
        sellerProxy.purchase("加利福利亚");
    }
}
