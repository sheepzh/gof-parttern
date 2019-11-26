package behaviour.command.command;

import behaviour.command.Command;
import behaviour.command.Receiver;
import behaviour.command.receiver.Eater;


/**
 * 吃饭命令
 *
 * @author zhyyy 2019/11/25
 **/
public class EatingCommand implements Command {
    private Receiver eater = new Eater();

    @Override
    public void execute() {
        eater.doSomething();
    }
}
