package behaviour.visitor;

import behaviour.visitor.part.Hammer;
import behaviour.visitor.part.Paint;

/**
 * 抽象访问者  职员
 *
 * @author zhyyy 2019/11/26
 **/
public interface Worker {
    /**
     * 拿走油漆（strategy element）
     *
     * @param paint 油漆元素
     * @return 是否成功拿走
     */
    boolean fetch(Paint paint);

    /**
     * 拿走锤子（strategy element）
     *
     * @param hammer 锤子元素
     * @return 是否成功拿走
     */
    boolean fetch(Hammer hammer);
}
