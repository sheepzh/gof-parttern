package behaviour.responsibility;

/**
 * 抽象责任执行者
 *
 * @author zhyyy 2019/11/25
 **/
public abstract class AbstractHandler<T> {
    private AbstractHandler<T> next;

    /**
     * 是否支持完成该任务
     *
     * @param task 任务
     * @return true是
     */
    protected abstract boolean supports(T task);

    /**
     * 完成任务
     *
     * @param task 任务
     */
    protected abstract void handle0(T task);

    public void handle(T task) {
        if (this.supports(task)) {
            handle0(task);
        } else if (this.next != null) {
            next.handle(task);
        } else {
            System.out.println("没有人能完成该任务:" + task.toString());
        }
    }

    public AbstractHandler getNext() {
        return next;
    }

    public void setNext(AbstractHandler<T> next) {
        this.next = next;
    }
}
