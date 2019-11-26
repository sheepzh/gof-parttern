package creater.abstractfactory;


import creater.abstractfactory.abstracts.Automobile;
import creater.abstractfactory.abstracts.DigitalProduct;
import creater.abstractfactory.abstracts.Factory;

/**
 * @author zhyyy 2019/11/7
 **/
public class KonkaFactory implements Factory {

    @Override
    public Automobile produceAutomobile() {
        return new Car();
    }

    @Override
    public DigitalProduct produceDigital() {
        return new Tv();
    }

    @Override
    public String name() {
        return "康佳";
    }
}
