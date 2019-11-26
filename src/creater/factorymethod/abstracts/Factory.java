package creater.factorymethod.abstracts;

/**
 * 工厂抽象接口
 *
 * @author zhyyy 2019/11/7
 **/
public interface Factory {
    /**
     * 工厂的生产功能
     *
     * @return 产品
     */
    DigitalProduct produce();

    /**
     * 工厂名称
     *
     * @return 工厂名称
     */
    String name();
}
