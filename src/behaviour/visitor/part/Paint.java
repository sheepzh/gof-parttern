package behaviour.visitor.part;

import behaviour.visitor.Part;
import behaviour.visitor.Worker;

/**
 * 具体元素 油漆
 *
 * @author zhyyy 2019/11/26
 **/
public class Paint implements Part {
    private int num;

    public Paint(int num) {
        this.num = num;
    }

    @Override
    public void accept(Worker worker) {
        if (worker.fetch(this)) {
            num--;
        }
        System.out.println("当前油漆数量：" + num + "桶");
    }
}
