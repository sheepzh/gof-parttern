package structure.adapter;

import structure.adapter.clz.AdapterTypeC;

/**
 * 适配器模式
 * 将一个目标接口（MicroUsb）转换成调用者希望的另外一个接口(TypeC)，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
 * 分为类结构型模式和对象结构型模式，主要使用后者，类之间耦合度更低。
 * 两者在适配器（Adapter）以及调用者的实现代码不同
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {
    public static void main(String[] a) {
        // 类结构型模式
        MicroUsb microUsb = new structure.adapter.clz.AdapterTypeC();
        microUsb.charge();
        // 对象结构型模式
        AdapteeTypeC adapteeTypeC = new AdapterTypeC();
        microUsb = new structure.adapter.obj.AdapterTypeC(adapteeTypeC);
        microUsb.charge();
    }
}
