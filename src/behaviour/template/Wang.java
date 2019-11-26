package behaviour.template;

/**
 * 学生具体类
 * @author zhyyy 2019/11/8
 **/
public class Wang extends AbstractStudent {

    @Override
    String name() {
        return "小王";
    }

    @Override
    boolean afterLiterature() {
        System.out.println("他觉得很开心");
        return true;
    }

    @Override
    boolean afterPhysics() {
        System.out.println("他想去吃炸鸡。");
        return false;
    }

    @Override
    void afterAll() {
        System.out.println("真是个奇迹。");
    }
}
