package structure.facade;

/**
 * 外观模式
 * 是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不
 * 用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 * <p>
 * 外观模式是“迪米特法则”的典型应用，它有以下主要优点:
 * 1.降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 * 2.对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 * 3.降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响
 * 外观对象。
 * <p>
 * 主要缺点:
 * 1.不能很好地限制客户使用子系统类。
 * 2.增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。该缺点在本例中将使用抽象外观类来杜绝修改外观类的代码，
 * 但仍旧需要修改客户端代码。
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String[] a) {
        // 选择代缴费服务
        PaymentAgent agent = new AlipayAgent();
        // 进行代缴费
        agent.pay();

        // 系统修改代缴费服务商，此处模拟修改了客户端代码
        agent = new WechatAgent();
        agent.pay();
    }
}