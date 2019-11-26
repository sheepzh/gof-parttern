package creater.factorymethod;

import creater.factorymethod.abstracts.DigitalProduct;
import creater.factorymethod.abstracts.Factory;

/**
 * 工厂方法模式
 * 定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。扩展时，只需要实现需要增加的产品及其工厂类。
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {
    public static void main(String[] a) {
        // 声明工厂
        Factory konka = new KonkaFactory();
        Factory huawei = new HuaweiFactory();

        // 生产产品
        DigitalProduct product1 = konka.produce();
        DigitalProduct product2 = huawei.produce();

        System.out.println(String.format("%s生产出了%s", konka.name(), product1.name()));
        System.out.println(String.format("%s生产出了%s", huawei.name(), product2.name()));
    }
}
