package behaviour.memento;

/**
 * 管理者角色
 *
 * @author zhyyy 2019/11/26
 **/
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public Caretaker setMemento(Memento memento) {
        this.memento = memento;
        return this;
    }
}
