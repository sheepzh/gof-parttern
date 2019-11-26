package behaviour.visitor;

/**
 * 零件  抽象元素角色
 *
 * @author zhyyy 2019/11/26
 **/
public interface Part {
    /**
     * 访问方法
     *
     * @param worker 工人  抽象访问者角色
     */
    void accept(Worker worker);
}
