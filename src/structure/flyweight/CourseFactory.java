package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色，课程工厂
 *
 * @author zhyyy 2019/11/8
 **/
public class CourseFactory {
    private static final Map<String, Course> COURSE_MAP = new HashMap<>(16);

    static {
        COURSE_MAP.put("英语", new English());
        COURSE_MAP.put("数学", new Math());
    }

    public Course getCourse(String courseName) {
        return COURSE_MAP.get(courseName);
    }
}
