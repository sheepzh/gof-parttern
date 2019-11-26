package creater.abstractfactory;

import creater.abstractfactory.abstracts.Automobile;

/**
 * 面包车产品
 *
 * @author zhyyy 2019/11/7
 **/
public class Minibus implements Automobile {
    @Override
    public int price() {
        return 30000;
    }
}
