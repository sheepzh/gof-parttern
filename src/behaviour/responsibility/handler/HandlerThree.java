package behaviour.responsibility.handler;

import behaviour.responsibility.AbstractHandler;

/**
 * @author zhyyy 2019/11/25
 **/
public class HandlerThree extends AbstractHandler<Integer> {
    @Override
    protected boolean supports(Integer task) {
        return task < 1000;
    }

    @Override
    protected void handle0(Integer task) {
        System.out.println("3号Handler完成了任务:" + task);
    }
}
