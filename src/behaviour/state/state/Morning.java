package behaviour.state.state;

import behaviour.state.DateTime;
import behaviour.state.OneDay;

/**
 * @author zhyyy 2019/11/25
 **/
public class Morning implements DateTime {
    @Override
    public void doSomething(OneDay thisDay) {
        System.out.println(thisDay.getDayString() + "，开始吃早餐");
    }
}
