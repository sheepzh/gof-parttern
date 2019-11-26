package structure.decorater;

/**
 * 具体组件
 *
 * @author zhyyy 2019/11/8
 **/
public class ZhangSan implements Student {
    @Override
    public void learn() {
        System.out.println("张三完成了学习");
    }
}
