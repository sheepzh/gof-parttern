package behaviour.command;

import behaviour.command.command.EatingCommand;
import behaviour.command.command.RunningCommand;

/**
 * 命令模式：
 * 将业务动作封装为一个对象，使业务请求的责任和业务执行的责任分割开，两者之间通过Command对象进行沟通，这样方便将命令对象进行储
 * 存、传递、调用、增加与管理。
 * <p>
 * 包含角色：
 * 抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 handle()。
 * 具体命令角色（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
 * 实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者。
 * 调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者。
 *
 * @author zhyyy 2019/11/25
 **/
public class Main {
    public static void main(String[] a) {
        Command runCmd = new RunningCommand();
        Command eatCmd = new EatingCommand();

        // 先跑再吃
        Invoker runningFirstInvocation = new Invoker(runCmd, eatCmd);
        // 先吃再跑
        Invoker eatingFirstInvocation = new Invoker(eatCmd, runCmd);

        runningFirstInvocation.excuteAll();
        System.out.println("-------------分隔符-------------");
        eatingFirstInvocation.excuteAll();
    }
}
