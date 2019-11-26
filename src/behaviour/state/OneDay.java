package behaviour.state;

/**
 * 状态环境类
 *
 * @author zhyyy 2019/11/25
 **/
public class OneDay {
    private DateTime dateTime;
    private String dayString;

    public DateTime getDateTime() {
        return dateTime;
    }

    public OneDay setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public void doSomething() {
        if (dateTime == null) {
            System.out.println("未设置状态");
            return;
        }
        dateTime.doSomething(this);
    }

    public String getDayString() {
        return dayString;
    }

    public OneDay setDayString(String dayString) {
        this.dayString = dayString;
        return this;
    }
}
