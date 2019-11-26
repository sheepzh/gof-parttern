package creater.factorymethod;

import creater.factorymethod.abstracts.DigitalProduct;

/**
 * 具体数码产品，手机
 *
 * @author zhyyy 2019/11/7
 **/
public class Phone implements DigitalProduct {
    @Override
    public String name() {
        return "手机";
    }
}
