package structure.brigde.shoe;

import structure.brigde.branch.Branch;
import structure.brigde.color.Color;

/**
 * 鞋子，抽象化角色
 *
 * @author zhyyy 2019/11/8
 **/
public abstract class AbstractShoe {

    /**
     * 品牌
     */
    protected Branch branch;

    /**
     * 颜色
     */
    protected Color color;

    public abstract void purchase();

    public AbstractShoe setBranch(Branch branch) {
        this.branch = branch;
        return this;
    }

    public AbstractShoe setColor(Color color) {
        this.color = color;
        return this;
    }
}
