package behaviour.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * 中介者单例
 *
 * @author zhyyy 2019/11/25
 **/
public class Mediator {
    private static Mediator instance;

    private List<AbstractColleague> colleagueList;

    private Mediator() {
        colleagueList = new LinkedList<>();
    }

    public static Mediator getInstance() {
        if (instance == null) {
            synchronized (Mediator.class) {
                if (instance == null) {
                    instance = new Mediator();
                }
            }
        }
        return instance;
    }

    public void register(AbstractColleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleagueList.add(colleague);
        }
    }

    public void relay(AbstractColleague from, String msg) {
        colleagueList.forEach(c -> {
            if (c != from) {
                c.receive(from, msg);
            }
        });
    }
}
