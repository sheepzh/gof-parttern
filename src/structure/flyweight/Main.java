package structure.flyweight;

/**
 * 享元模式
 * 运用共享技术来有効地支持大量细粒度对象的复用。它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，
 * 从而提高系统资源的利用率。广泛用于缓存池
 * 优点：
 * 1.相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
 * 缺点：
 * 1.为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
 * 2.读取享元模式的外部状态会使得运行时间稍微变长。
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String[] a) {
        CourseFactory courseFactory = new CourseFactory();
        // 100个班
        int classNum = 10;
        // 每个班50人
        int studentNum = 50;
        for (int i = 0; i < classNum; i++) {
            for (int j = 0; j < studentNum; j++) {
                courseFactory.getCourse("英语").searchScore((i + 1) + "班同学" + (j + 1));
                courseFactory.getCourse("数学").searchScore((i + 1) + "班同学" + (j + 1));
            }
        }
    }
}
