package structure.proxy;

/**
 * 携程，真实主体
 *
 * @author zhyyy 2019/11/7
 **/
public class Xiecheng implements TicketSeller {
    @Override
    public String name() {
        return "携程";
    }

    @Override
    public void purchase(String targetPlace) {
        System.out.println(String.format("在%s购买了一张前往%s的火车票", name(), targetPlace));
    }

    @Override
    public boolean moreTicket(String targetPlace) {
        return targetPlace != null && targetPlace.length() < 5;
    }
}
