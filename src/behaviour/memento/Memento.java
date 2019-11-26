package behaviour.memento;

/**
 * @author zhyyy 2019/11/26
 **/
public class Memento {
    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public Memento setState(int state) {
        this.state = state;
        return this;
    }
}
