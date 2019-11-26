package behaviour.state;

import behaviour.state.state.Evening;
import behaviour.state.state.Morning;
import behaviour.state.state.Noon;

/**
 * 状态模式：
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为。
 * <p>
 * 主要角色：
 * 环境（Context）角色：也称为上下文，它定义了客户感兴趣的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 * 抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为。
 * 具体状态（Concrete State）角色：实现抽象状态所对应的行为。
 * <p>
 * 优点：
 * 将与特定状态相关的行为局部化到一个状态实现类中，并且将不同状态的行为分割开来，满足“单一职责原则”。
 * 减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖。
 * 有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换。
 * <p>
 * 缺点：
 * 状态模式的使用必然会增加系统的类与对象的个数。
 * 状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。
 *
 * @author zhyyy 2019/11/25
 **/
public class Main {

    public static void main(String[] a) {
        // 创建外部环境类
        OneDay thisDay = new OneDay();
        thisDay.setDayString("2019/11/25");

        // 修改状态，并执行相关行为
        thisDay.setDateTime(new Morning());
        thisDay.doSomething();

        thisDay.setDateTime(new Noon());
        thisDay.doSomething();

        thisDay.setDateTime(new Evening());
        thisDay.doSomething();
    }

}
