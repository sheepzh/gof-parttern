package creater.builder;

/**
 * 论文实体
 *
 * @author zhyyy 2019/11/7
 **/
public class Paper {
    private String title;
    private String content;
    private String summary;

    public String getTitle() {
        return title;
    }

    public Paper setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public Paper setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Paper setContent(String content) {
        this.content = content;
        return this;
    }

    public void print() {
        System.out.println("-----------------------------");
        System.out.println(title);
        System.out.println(content);
        System.out.println(summary);
        System.out.println("-----------------------------");
    }
}
