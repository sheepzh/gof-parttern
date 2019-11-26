package behaviour.template;

/**
 * 学生抽象类
 *
 * @author zhyyy 2019/11/8
 **/
public abstract class AbstractStudent {
    public void doHomework() {
        System.out.println("\n\n" + name() + "开始做作业：");
        System.out.println("他做完了语文作业。");
        // 钩子返回false则不再做后面的作业
        if (!afterLiterature()) {
            System.out.println("他不想做剩下的作业了。");
            return;
        }
        System.out.println("他做完了物理作业。");
        if (!afterPhysics()) {
            System.out.println("他不想做剩下的作业了。");
            return;
        }
        System.out.println("他做完了所有的作业。");
        afterAll();
    }

    abstract String name();

    // 以下均为钩子函数

    abstract boolean afterLiterature();

    abstract boolean afterPhysics();

    abstract void afterAll();

}
