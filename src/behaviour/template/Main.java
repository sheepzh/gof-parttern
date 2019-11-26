package behaviour.template;

/**
 * 模板模式
 * 定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤
 * 常用于各种钩子方法
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String a[]) {
        AbstractStudent z = new Zhang();
        AbstractStudent w = new Wang();

        z.doHomework();
        w.doHomework();
    }
}
