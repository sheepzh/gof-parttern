package behaviour.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 抽象目标类
 * 温度
 *
 * @author zhyyy 2019/11/25
 **/
public abstract class AbstractTemperature {
    protected int t = 0;
    protected List<TemperatureObserver> temperatureObservers = new LinkedList<>();

    public void add(TemperatureObserver temperatureObserver) {
        temperatureObservers.add(temperatureObserver);
    }

    public void remove(TemperatureObserver temperatureObserver) {
        temperatureObservers.remove(temperatureObserver);
    }

    /**
     * 温度改变
     *
     * @param delta 改变数值
     */
    public abstract void change(int delta);

    protected void change0(int delta) {
        this.t += delta;
    }
}
