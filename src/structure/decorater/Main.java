package structure.decorater;

/**
 * 装饰模式
 * 在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String[] a) {
        // 张三是个学生（AbstractStudent），他每天都会学习（调用learn方法）
        Student zs = new ZhangSan();
        // 同时他也被贴上贪玩的tag
        zs = new PlayfulTeenager(zs);
        // 同时他也被贴上贪吃的tag
        zs = new FresserTeenager(zs);
        // 那么当他学习完成之后....
        zs.learn();
    }
}
