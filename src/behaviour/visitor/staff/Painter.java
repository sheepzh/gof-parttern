package behaviour.visitor.staff;

import behaviour.visitor.Worker;
import behaviour.visitor.part.Hammer;
import behaviour.visitor.part.Paint;

/**
 * 具体访问者角色  油漆工
 *
 * @author zhyyy 2019/11/26
 **/
public class Painter implements Worker {
    @Override
    public boolean fetch(Paint paint) {
        System.out.println("油漆工拿走了一桶油漆");
        return true;
    }

    @Override
    public boolean fetch(Hammer hammer) {
        System.out.println("油漆工不需要锤子");
        return false;
    }
}
