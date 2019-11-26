package behaviour.strategy.strategy;

import behaviour.strategy.Strategy;

import java.util.Collections;
import java.util.List;

/**
 * 中位数策略实现类
 *
 * @author zhyyy 2019/11/23
 **/
public class MedianStrategy implements Strategy {
    @Override
    public double calculateTypical(List<Integer> heights) {
        Collections.sort(heights);
        int size = heights.size();
        return (size & 1) == 1 ?
                heights.get(size / 2) :
                (heights.get(size / 2) + heights.get(size / 2 - 1)) / 2D;

    }
}
