package structure.decorater;

/**
 * @author zhyyy 2019/11/8
 **/
public class FresserTeenager extends Teenager {
    public FresserTeenager(Student student) {
        super(student);
    }

    @Override
    public void learn() {
        super.learn();
        eat();
    }

    private void eat() {
        System.out.println("还吃了10对炸鸡翅");
    }
}
