package creater.prototype;

/**
 * 原型模式
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。JAVA内使用clone()方法实现
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {

    public static void main(String[] a) {
        // 原型管理器，用户管理原型实例
        PrototypeManager prototypeManager = new PrototypeManager();

        CloneablePeople female = prototypeManager.getFemale("小邓");
        System.out.println("小邓创建成功：" + female.toString());

        CloneablePeople male1 = prototypeManager.getMale("张三");
        System.out.println("张三创建成功：" + male1.toString());

        CloneablePeople male2 = prototypeManager.getMale("李四");
        System.out.println("李四创建成功：" + male2.toString());

        System.out.println("张三等于李四？" + (male1 == male2));
    }
}
