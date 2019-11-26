package behaviour.template;

/**
 * 学生具体类
 *
 * @author zhyyy 2019/11/8
 **/
public class Zhang extends AbstractStudent {
    @Override
    String name() {
        return "小张";
    }

    @Override
    boolean afterLiterature() {
        System.out.println("他掏出了下一门功课的作业");
        return true;
    }

    @Override
    boolean afterPhysics() {
        System.out.println("他掏出了下一门功课的作业");
        return true;
    }

    @Override
    void afterAll() {
        System.out.println("他终于可以睡觉了");
    }
}
