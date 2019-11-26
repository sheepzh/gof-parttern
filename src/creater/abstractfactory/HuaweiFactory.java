package creater.abstractfactory;


import creater.abstractfactory.abstracts.Automobile;
import creater.abstractfactory.abstracts.DigitalProduct;
import creater.abstractfactory.abstracts.Factory;

/**
 * @author zhyyy 2019/11/7
 **/
public class HuaweiFactory implements Factory {

    @Override
    public Automobile produceAutomobile() {
        return new Minibus();
    }

    @Override
    public DigitalProduct produceDigital() {
        return new Phone();
    }

    @Override
    public String name() {
        return "华为";
    }
}
