package behaviour.state;

/**
 * 抽象状态类
 * 表示每日的时间
 *
 * @author zhyyy 2019/11/25
 **/
public interface DateTime {
    /**
     * 每个时间段(状态)的行为
     *
     * @param thisDay 外部环境
     */
    void doSomething(OneDay thisDay);
}
