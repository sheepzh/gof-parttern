package behaviour.visitor;

import behaviour.visitor.part.Hammer;
import behaviour.visitor.part.Paint;
import behaviour.visitor.staff.Painter;
import behaviour.visitor.staff.Paver;

/**
 * 访问者模式：
 * 将作用于元素的操作分离出来封装成独立的类
 * <p>
 * 角色：
 * 抽象访问者（Visitor）角色：定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作visit() ，该操作中的参数类型标识了被访问的具体元素。
 * 具体访问者（Concrete Visitor）角色：实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 * 抽象元素（Element）角色：声明一个包含接受操作accept()的接口，被接受的访问者对象作为accept()方法的参数。
 * 具体元素（Concrete Element）角色：实现抽象元素角色提供的accept()操作，其方法体通常都是visitor.visit(this)，另外具体元素中可能还包含本身业务逻辑的相关操作。
 * 对象结构（Object Structure）角色：是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法，通常由 List、Set、Map 等聚合类实现。
 * <p>
 * <p>
 * 优点:
 * 扩展性好。能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能。
 * 复用性好。可以通过访问者来定义整个对象结构通用的功能，从而提高系统的复用程度。
 * 灵活性好。访问者模式将数据结构与作用于结构上的操作解耦，使得操作集合可相对自由地演化而不影响系统的数据结构。
 * 符合单一职责原则。访问者模式把相关的行为封装在一起，构成一个访问者，使每一个访问者的功能都比较单一。
 * <p>
 * 缺点:
 * 增加新的元素类很困难。在访问者模式中，每增加一个新的元素类，都要在每一个具体访问者类中增加相应的具体操作，这违背了“开闭原则”。
 * 破坏封装。访问者模式中具体元素对访问者公布细节，这破坏了对象的封装性。
 * 违反了依赖倒置原则。访问者模式依赖了具体类，而没有依赖抽象类。
 *
 * @author zhyyy 2019/11/25
 **/
public class Main {
    public static void main(String[] a) {
        // 初始化仓库(Object structure)内零件(Element)
        Inventory inventory = new Inventory();
        inventory.add(new Hammer(20));
        inventory.add(new Paint(20));

        // 工人(Concrete Visitor)
        Worker painter = new Painter();
        Worker paver = new Paver();

        inventory.accept(painter);
        inventory.accept(paver);
    }

}
