package behaviour.observer.observer;

import behaviour.observer.TemperatureObserver;

/**
 * @author zhyyy 2019/11/25
 **/
public class ClothObserver implements TemperatureObserver {
    @Override
    public void response(int temperature) {
        String cloth;
        if (temperature > 25) {
            cloth = "t-shirt";
        } else if (temperature > 10) {
            cloth = "coat";
        } else {
            cloth = "sweater";
        }
        System.out.println("Wear " + cloth);
    }
}
