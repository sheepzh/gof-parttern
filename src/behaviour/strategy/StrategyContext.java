package behaviour.strategy;

import java.util.List;
import java.util.Objects;

/**
 * 环境类，供客户端进行调用
 *
 * @author zhyyy 2019/11/23
 **/
public class StrategyContext {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public StrategyContext setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public double calculate(List<Integer> heights) {
        Objects.requireNonNull(strategy);
        Objects.requireNonNull(heights);
        if (heights.isEmpty()) {
            return 0;
        }
        return strategy.calculateTypical(heights);
    }

}
