package behaviour.mediator.colleague;

import behaviour.mediator.AbstractColleague;

/**
 * @author zhyyy 2019/11/25
 **/
public class Staff extends AbstractColleague {
    public Staff(String name) {
        super(name);
    }

    @Override
    protected void receive(AbstractColleague from, String msg) {
        System.out.println("员工收到了来自" + from.getName() + "的消息：" + msg);
    }
}
