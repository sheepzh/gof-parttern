package behaviour.observer;

import java.util.Observer;

/**
 * 抽象观察者
 *
 * @author zhyyy 2019/11/25
 **/
public interface TemperatureObserver extends Observer {
    /**
     * 相应方法
     *
     * @param temperature 当前温度
     */
    void response(int temperature);
}
