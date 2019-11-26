package creater.abstractfactory;

import creater.abstractfactory.abstracts.DigitalProduct;

/**
 * @author zhyyy 2019/11/7
 **/
public class Tv implements DigitalProduct {
    @Override
    public String name() {
        return "电视机";
    }
}
