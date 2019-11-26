package behaviour.observer.observer;

import behaviour.observer.TemperatureObserver;

/**
 * @author zhyyy 2019/11/25
 **/
public class AirConditionObserver implements TemperatureObserver {
    @Override
    public void response(int temperature) {
        if (temperature > 30) {
            System.out.println("空调制冷");
        } else if (temperature < 16) {
            System.out.println("空调制热");
        } else {
            System.out.println("不开空调");
        }
    }
}
