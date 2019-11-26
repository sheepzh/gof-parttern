package creater.singleton;

/**
 * 单例模式
 * 双重校验锁懒汉式，线程安全
 *
 * @author zhyyy 2019/11/7
 **/
public class LockLazySingleton {
    private volatile static LockLazySingleton instance;
    private static final Object MUTEX = new Object();

    private LockLazySingleton() {
    }

    public static synchronized LockLazySingleton getInstance() {
        if (instance == null) {
            synchronized (MUTEX) {
                if (instance == null) {
                    instance = new LockLazySingleton();
                }
            }
        }
        return instance;
    }
}
