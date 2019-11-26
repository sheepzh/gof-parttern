package creater.abstractfactory;

import creater.abstractfactory.abstracts.Automobile;

/**
 * 轿车产品
 *
 * @author zhyyy 2019/11/7
 **/
public class Car implements Automobile {
    @Override
    public int price() {
        return 5000;
    }
}
