package structure.decorater;

/**
 * @author zhyyy 2019/11/8
 **/
public class PlayfulTeenager extends Teenager {
    public PlayfulTeenager(Student student) {
        super(student);
    }

    @Override
    public void learn() {
        super.learn();
        play();
    }

    private void play() {
        System.out.println("还玩了五把LOL");
    }
}
