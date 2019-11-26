package creater.singleton;

/**
 * 单例模式
 * 饿汉式，初始化生成
 *
 * @author zhyyy 2019/11/7
 **/
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
