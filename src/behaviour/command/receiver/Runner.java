package behaviour.command.receiver;

import behaviour.command.Receiver;

/**
 * @author zhyyy 2019/11/25
 **/
public class Runner implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("One runner starts running...");
    }
}
