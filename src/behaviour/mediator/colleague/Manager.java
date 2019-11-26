package behaviour.mediator.colleague;

import behaviour.mediator.AbstractColleague;

/**
 * @author zhyyy 2019/11/25
 **/
public class Manager extends AbstractColleague {
    public Manager(String name) {
        super(name);
    }

    @Override
    protected void receive(AbstractColleague from, String msg) {
        System.out.println("主管收到了来自" + from.getName() + "的消息：" + msg);
    }
}
