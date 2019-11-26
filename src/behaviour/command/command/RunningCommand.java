package behaviour.command.command;

import behaviour.command.Command;
import behaviour.command.Receiver;
import behaviour.command.receiver.Runner;

/**
 * 跑步命令
 *
 * @author zhyyy 2019/11/25
 **/
public class RunningCommand implements Command {
    private Receiver runner = new Runner();

    @Override
    public void execute() {
        runner.doSomething();
    }
}
