package behaviour.observer.observer;

import behaviour.observer.TemperatureObserver;

/**
 * @author zhyyy 2019/11/25
 **/
public class PillObserver implements TemperatureObserver {
    @Override
    public void response(int temperature) {
        if (temperature > 37) {
            System.out.println("吃退烧药");
        } else if (temperature < 35) {
            System.out.println("你已经死了");
        }
    }
}
