package creater.factorymethod;

import creater.factorymethod.abstracts.DigitalProduct;

/**
 * 具体数码产品，电视机
 *
 * @author zhyyy 2019/11/7
 **/
public class Tv implements DigitalProduct {
    @Override
    public String name() {
        return "电视机";
    }
}
