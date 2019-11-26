package creater.factorymethod;

import creater.factorymethod.abstracts.Factory;
import creater.factorymethod.abstracts.DigitalProduct;

/**
 * @author zhyyy 2019/11/7
 **/
public class HuaweiFactory implements Factory {
    @Override
    public DigitalProduct produce() {
        return new Phone();
    }

    @Override
    public String name() {
        return "华为";
    }
}
