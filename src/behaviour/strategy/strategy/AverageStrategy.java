package behaviour.strategy.strategy;

import behaviour.strategy.Strategy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 平均数策略实现类
 *
 * @author zhyyy 2019/11/23
 **/
public class AverageStrategy implements Strategy {
    @Override
    public double calculateTypical(List<Integer> heights) {
        return heights.stream().collect(Collectors.averagingInt(a -> (int) a));
    }
}
