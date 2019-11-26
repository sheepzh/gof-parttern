package creater.builder;

/**
 * builder实现类
 *
 * @author zhyyy 2019/11/7
 **/
public class UpperPaperBuilder extends AbstractPaperBuilder {
    @Override
    public String name() {
        return "Upper Builder";
    }

    @Override
    public AbstractPaperBuilder buildTitle(String title) {
        super.paper.setTitle(title.toUpperCase());
        return this;
    }

    @Override
    public AbstractPaperBuilder buildContent(String content) {
        super.paper.setContent(content.toUpperCase());
        return this;
    }

    @Override
    public AbstractPaperBuilder buildSummary(String summary) {
        super.paper.setSummary(summary.toUpperCase());
        return this;
    }

}
