package behaviour.mediator;

/**
 * 抽象同事类
 *
 * @author zhyyy 2019/11/25
 **/
public abstract class AbstractColleague {
    private String name;

    public AbstractColleague(String name) {
        this.name = name;
        Mediator.getInstance().register(this);
    }

    /**
     * 接受请求
     *
     * @param msg  请求
     * @param from 发送人
     */
    protected abstract void receive(AbstractColleague from, String msg);

    /**
     * 发送消息，通过中介者进行转发
     *
     * @param msg 消息
     */
    public void send(String msg) {
        Mediator.getInstance().relay(this, msg);
    }

    public String getName() {
        return this.name;
    }
}
