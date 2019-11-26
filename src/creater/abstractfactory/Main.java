package creater.abstractfactory;


import creater.abstractfactory.abstracts.Automobile;
import creater.abstractfactory.abstracts.DigitalProduct;
import creater.abstractfactory.abstracts.Factory;

/**
 * 抽象工厂模式
 * 考虑多级产品的生产，将同一个具体工厂所生产的位于不同等级的一组产品称为一个产品族
 *
 * @author zhyyy 2019/11/7
 **/
public class Main {
    public static void main(String[] a) {
        // 声明工厂
        Factory konka = new KonkaFactory();
        Factory huawei = new HuaweiFactory();

        // 生产数码产品
        DigitalProduct digital1 = konka.produceDigital();
        DigitalProduct digital2 = huawei.produceDigital();
        System.out.println(String.format("%s生产出了%s", konka.name(), digital1.name()));
        System.out.println(String.format("%s生产出了%s", huawei.name(), digital2.name()));

        // 生产汽车
        Automobile automobile1 = konka.produceAutomobile();
        Automobile automobile2 = huawei.produceAutomobile();
        System.out.println(String.format("%s生产的汽车价值%s元", konka.name(), automobile1.price()));
        System.out.println(String.format("%s生产的汽车价值%s元", huawei.name(), automobile2.price()));
    }
}
