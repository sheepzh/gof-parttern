package creater.factorymethod;

import creater.factorymethod.abstracts.Factory;
import creater.factorymethod.abstracts.DigitalProduct;

/**
 * @author zhyyy 2019/11/7
 **/
public class KonkaFactory implements Factory {
    @Override
    public DigitalProduct produce() {
        return new Tv();
    }

    @Override
    public String name() {
        return "康佳";
    }
}
