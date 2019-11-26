package creater.prototype;

/**
 * @author zhyyy 2019/11/7
 **/
class CloneablePeople implements Cloneable {

    public static final String SEX_MALE = "男";
    public static final String SEX_FEMALE = "女";

    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public CloneablePeople setName(String name) {
        this.name = name;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public CloneablePeople setSex(String sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return String.format("name=%s,sex=%s", name, sex);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
