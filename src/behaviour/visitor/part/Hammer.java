package behaviour.visitor.part;

import behaviour.visitor.Part;
import behaviour.visitor.Worker;

/**
 * 具体元素  锤子
 *
 * @author zhyyy 2019/11/26
 **/
public class Hammer implements Part {
    private int num;

    public Hammer(int num) {
        this.num = num;
    }

    @Override
    public void accept(Worker worker) {
        if (worker.fetch(this)) {
            num--;
        }
        System.out.println("当前锤子数量：" + num + "把");
    }
}
