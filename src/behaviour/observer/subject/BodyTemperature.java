package behaviour.observer.subject;

import behaviour.observer.AbstractTemperature;

/**
 * @author zhyyy 2019/11/25
 **/
public class BodyTemperature extends AbstractTemperature {
    public BodyTemperature() {
        super.t = 37;
    }

    @Override
    public void change(int delta) {
        super.change0(delta);
        System.out.println("体温升高了" + delta + "摄氏度，当前为" + super.t + "摄氏度");
        super.temperatureObservers.forEach(t -> t.response(super.t));
    }
}
