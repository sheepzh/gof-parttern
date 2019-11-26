package creater.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 单例模式：
 * 1.单例类只有一个实例对象
 * 2.该单例对象必须由单例类自行创建
 * 3.单例类对外提供一个访问该单例的全局访问点，getInstance方法
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {
    public static void main(String[] a) {

        // 普通懒汉
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("懒汉单例创建成功：" + lazySingleton.hashCode());

        // 普通饿汉
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println("饿汉单例创建成功：" + hungrySingleton.hashCode());

        // 模拟并发环境调用双锁饿汉单例，查看是否重复创建
        final int threadNum = 10000;
        final CountDownLatch latch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            // 双校验锁饿汉
            new Thread(new LockLazyInvoker(latch)).start();
            // 单校验锁饿汉
            // new Thread(new LazyInvoker(latch)).start();

            latch.countDown();
        }

    }
}

class LockLazyInvoker implements Runnable {
    private final CountDownLatch latch;

    LockLazyInvoker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // 等待所有线程创建完成
            latch.await();
            LockLazySingleton lockLazySingleton = LockLazySingleton.getInstance();
            System.out.println("双锁饿汉多线程创建成功：" + lockLazySingleton.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class LazyInvoker implements Runnable {
    private final CountDownLatch latch;

    LazyInvoker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // 等待所有线程创建完成
            latch.await();
            LazySingleton lazySingleton = LazySingleton.getInstance();
            System.out.println("无锁饿汉多线程创建成功：" + lazySingleton.hashCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

