package creater.prototype;

import java.util.HashMap;

/**
 * 原型管理器
 *
 * @author zhyyy 2019/11/7
 **/
public class PrototypeManager {

    private HashMap<String, CloneablePeople> templatePool = new HashMap<>();

    public CloneablePeople getMale(String name) {
        CloneablePeople template = null;
        try {
            template = (CloneablePeople) getMale().clone();
            template.setName(name);
        } catch (CloneNotSupportedException e) {
            System.out.println("复制失败");
        }
        return template;
    }

    public CloneablePeople getFemale(String name) {
        CloneablePeople template = null;
        try {
            template = (CloneablePeople) getFemale().clone();
            template.setName(name);
        } catch (CloneNotSupportedException e) {
            System.out.println("复制失败");
        }
        return template;
    }

    private CloneablePeople getMale() {
        CloneablePeople male = templatePool.get("male");
        if (male == null) {
            male = (CloneablePeople) new CloneablePeople().setSex(CloneablePeople.SEX_MALE);
            templatePool.put("male", male);
        }
        return male;
    }

    private CloneablePeople getFemale() {
        CloneablePeople male = templatePool.get("female");
        if (male == null) {
            male = (CloneablePeople) new CloneablePeople().setSex(CloneablePeople.SEX_FEMALE);
            templatePool.put("female", male);
        }
        return male;
    }
}

