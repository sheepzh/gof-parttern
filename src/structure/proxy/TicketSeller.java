package structure.proxy;

/**
 * 票务销售方，抽象主体
 *
 * @author zhyyy 2019/11/7
 **/
public interface TicketSeller {
    /**
     * 销售方名称
     *
     * @return 销售方名称
     */
    String name();

    /**
     * 票务交易
     *
     * @param targetPlace 目的地
     */
    void purchase(String targetPlace);

    /**
     * 是否有余票
     *
     * @param targetPlace 目的地
     * @return true 有 false 无
     */
    boolean moreTicket(String targetPlace);
}
