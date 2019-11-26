package behaviour.visitor.staff;

import behaviour.visitor.Worker;
import behaviour.visitor.part.Hammer;
import behaviour.visitor.part.Paint;

/**
 * 具体访问者角色  铺路工
 *
 * @author zhyyy 2019/11/26
 **/
public class Paver implements Worker {

    @Override
    public boolean fetch(Paint paint) {
        System.out.println("铺路工拿走了一桶油漆");
        return true;
    }

    @Override
    public boolean fetch(Hammer hammer) {
        System.out.println("铺路工拿走了一把锤子");
        return true;
    }
}
