package creater.builder;

/**
 * 建造者模式
 * 将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示。
 * 主要角色有：
 * 1.产品 Paper
 * ------包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件
 * 2.抽象建造者 AbstractPaperBuilder
 * ------包含创建产品各个子部件的抽象方法的接口，通常还包含一个返回复杂产品的方法build()
 * 3.具体建造者 UpperPaperBuilder LowerPaperBuilder
 * ------实现 Builder 接口，完成复杂产品的各个部件的具体创建方法
 * 4.指挥者 PaperWriter
 * ------它调用建造者对象中的部件构造与装配方法完成复杂对象的创建，在指挥者中不涉及具体产品的信息
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {
    public static void main(String[] a) {
        // director实例
        PaperWriter writer = new PaperWriter();

        // builder实例
        AbstractPaperBuilder builder1 = new UpperPaperBuilder();
        AbstractPaperBuilder builder2 = new LowerPaperBuilder();

        // 开始构造paper
        Paper paper1 = writer.write(builder1);
        System.out.println(builder1.name() + " built one paper:");
        paper1.print();

        Paper paper2 = writer.write(builder2);
        System.out.println(builder2.name() + " built one paper:");
        paper2.print();
    }
}
