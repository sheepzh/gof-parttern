package structure.decorater;

/**
 * 抽象装饰
 *
 * @author zhyyy 2019/11/8
 **/
public abstract class Teenager implements Student {

    private Student student;

    public Teenager(Student student) {
        this.student = student;
    }

    @Override
    public void learn() {
        student.learn();
    }
}
