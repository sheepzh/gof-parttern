package creater.builder;

/**
 * Builder接口
 *
 * @author zhyyy 2019/11/7
 **/
public abstract class AbstractPaperBuilder {
    protected Paper paper = new Paper();

    /**
     * 构造者名称
     *
     * @return 构造者名称
     */
    public abstract String name();

    public abstract AbstractPaperBuilder buildTitle(String title);

    public abstract AbstractPaperBuilder buildContent(String content);

    public abstract AbstractPaperBuilder buildSummary(String summary);

    public Paper build() {
        return paper;
    }
}
