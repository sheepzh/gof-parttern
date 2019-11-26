package creater.abstractfactory;

import creater.abstractfactory.abstracts.DigitalProduct;

/**
 * @author zhyyy 2019/11/7
 **/
public class Phone implements DigitalProduct {
    @Override
    public String name() {
        return "手机";
    }
}
