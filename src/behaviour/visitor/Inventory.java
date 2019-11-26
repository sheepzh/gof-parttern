package behaviour.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 仓库 对象结构角色
 *
 * @author zhyyy 2019/11/26
 **/
public class Inventory {
    private List<Part> partList = new LinkedList<>();

    public void add(Part part) {
        if (!partList.contains(part)) {
            partList.add(part);
        }
    }

    public void remove(Part part) {
        partList.remove(part);
    }

    public void accept(Worker worker) {
        partList.forEach(i -> i.accept(worker));
    }
}
