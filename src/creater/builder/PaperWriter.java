package creater.builder;

/**
 * @author zhyyy 2019/11/7
 **/
public class PaperWriter {

    public Paper write(AbstractPaperBuilder builder) {
        String title = "This is title";
        String content = "This is content";
        String summary = "This is summary";

        return builder
                .buildTitle(title)
                .buildContent(content)
                .buildSummary(summary)
                .build();
    }
}
