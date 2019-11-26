package behaviour.strategy;

import java.util.List;

/**
 * 抽象策略类
 *
 * @author zhyyy 2019/11/23
 **/
public interface Strategy {
    /**
     * 计算典型身高
     *
     * @param heights 身高集合
     * @return 典型身高
     */
    double calculateTypical(List<Integer> heights);
}
