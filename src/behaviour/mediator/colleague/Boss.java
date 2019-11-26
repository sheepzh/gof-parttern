package behaviour.mediator.colleague;

import behaviour.mediator.AbstractColleague;

/**
 * @author zhyyy 2019/11/25
 **/
public class Boss extends AbstractColleague {
    public Boss(String name) {
        super(name);
    }

    @Override
    protected void receive(AbstractColleague from, String msg) {
        System.out.println("老板收到了来自" + from.getName() + "的消息：" + msg);
    }
}
