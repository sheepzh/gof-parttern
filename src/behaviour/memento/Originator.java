package behaviour.memento;

/**
 * 发起人角色
 *
 * @author zhyyy 2019/11/26
 **/
public class Originator {
    private int state;

    public Originator(int state) {
        this.state = state;
    }

    public Memento memento() {
        return new Memento(state);
    }

    public void undo(Memento memento) {
        this.state = memento.getState();
    }

    public int getState() {
        return state;
    }

    public Originator setState(int state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return "当前状态：" + state;
    }
}
