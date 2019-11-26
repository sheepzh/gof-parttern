package behaviour.mediator;

import behaviour.mediator.colleague.Boss;
import behaviour.mediator.colleague.Manager;
import behaviour.mediator.colleague.Staff;

/**
 * 中介者模式：定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
 * 中介者模式又叫调停模式，它是迪米特法则的典型应用。
 * <p>
 * 角色：
 * 抽象中介者（Mediator）角色：它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
 * 具体中介者（ConcreteMediator）角色：实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。
 * 抽象同事类（AbstractColleague）角色：定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。
 * 具体同事类（Concrete AbstractColleague）角色：是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。
 * <p>
 * 优点：
 * 降低了对象之间的耦合性，使得对象易于独立地被复用。
 * 将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。
 * <p>
 * 缺点：
 * 当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。
 * <p>
 * <p>
 * 实际开发中，通常采用以下两种方法来简化中介者模式，使开发变得更简单：
 * 不定义中介者接口，把具体中介者对象实现成为单例。
 * 同事对象不持有中介者，而是在需要的时候直接获取中介者对象并调用。
 *
 * @author zhyyy 2019/11/25
 **/
public class Main {
    public static void main(String[] a) {
        // 采用单例中介者模式
        AbstractColleague boss = new Boss("王董");
        AbstractColleague manager = new Manager("司马总");
        AbstractColleague worker = new Staff("小邓");
        boss.send("大家辛苦了！");
        manager.send("本周天不加班！");
        worker.send("加班必司马！");
    }
}
