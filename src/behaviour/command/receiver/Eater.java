package behaviour.command.receiver;

import behaviour.command.Receiver;

/**
 * @author zhyyy 2019/11/25
 **/
public class Eater implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("One eater starts eating...");
    }
}
