package creater.builder;

/**
 * @author zhyyy 2019/11/7
 **/
public class LowerPaperBuilder extends AbstractPaperBuilder {
    @Override
    public String name() {
        return "Lower Builder";
    }

    @Override
    public AbstractPaperBuilder buildTitle(String title) {
        super.paper.setTitle(title.toLowerCase());
        return this;
    }

    @Override
    public AbstractPaperBuilder buildContent(String content) {
        super.paper.setContent(content.toLowerCase());
        return this;
    }

    @Override
    public AbstractPaperBuilder buildSummary(String summary) {
        super.paper.setSummary(summary.toLowerCase());
        return this;
    }


}
