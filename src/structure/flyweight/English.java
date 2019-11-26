package structure.flyweight;

/**
 * 享元具体角色，英文
 *
 * @author zhyyy 2019/11/8
 **/
public class English implements Course {
    @Override
    public void searchScore(String studentName) {
        System.out.println(studentName + "英语考了" + System.currentTimeMillis() % 100 + "分");
    }
}
