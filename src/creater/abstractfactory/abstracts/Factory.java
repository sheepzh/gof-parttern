package creater.abstractfactory.abstracts;

/**
 * 工厂抽象接口
 *
 * @author zhyyy 2019/11/7
 **/
public interface Factory {
    /**
     * 生产汽车
     *
     * @return 汽车
     */
    Automobile produceAutomobile();

    /**
     * 生产数码产品
     *
     * @return 数码产品
     */
    DigitalProduct produceDigital();

    /**
     * 工厂名称
     *
     * @return 工厂名称
     */
    String name();
}
