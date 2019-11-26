package behaviour.responsibility.handler;

import behaviour.responsibility.AbstractHandler;

/**
 * @author zhyyy 2019/11/25
 **/
public class HandlerOne extends AbstractHandler<Integer> {

    @Override
    protected boolean supports(Integer task) {
        return task < 10;
    }

    @Override
    protected void handle0(Integer task) {
        System.out.println("1号Handler完成了任务:" + task);
    }
}
