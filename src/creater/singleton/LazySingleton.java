package creater.singleton;

/**
 * 单例模式
 * 懒汉式，需要时才生成
 *
 * @author zhyyy 2019/11/7
 **/
public class LazySingleton {
    /**
     * 对象的创建以及复制，并不是原子操作(获取instance引用的地址，创建对象，修改instance引用到对象上)
     * 所以要添加volatile防止重排
     */
    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
