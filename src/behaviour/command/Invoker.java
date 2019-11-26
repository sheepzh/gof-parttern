package behaviour.command;

/**
 * 执行者角色
 *
 * @author zhyyy 2019/11/25
 **/
public class Invoker {
    private Command[] commands;

    public Invoker(Command... commands) {
        this.commands = commands;
    }

    void excuteAll() {
        for (Command c : commands) {
            c.execute();
        }
    }
}
