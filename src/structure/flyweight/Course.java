package structure.flyweight;

/**
 * 享元角色，课程
 *
 * @author zhyyy 2019/11/8
 **/
public interface Course {
    /**
     * 业务操作，查询学生成绩
     *
     * @param studentName 学生名称
     */
    void searchScore(String studentName);
}
