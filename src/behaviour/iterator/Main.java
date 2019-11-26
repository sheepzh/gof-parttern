package behaviour.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式：
 * 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示
 * <p>
 * 优点：
 * 访问一个聚合对象的内容而无须暴露它的内部表示。
 * 遍历任务交由迭代器完成，这简化了聚合类。
 * 它支持以不同方式遍历一个聚合，甚至可以自定义迭代器的子类以支持新的遍历。
 * 增加新的聚合类和迭代器类都很方便，无须修改原有代码。
 * 封装性良好，为遍历不同的聚合结构提供一个统一的接口。
 *
 * @author zhyyy 2019/11/25
 **/
public class Main {

    public static void main(String[] a) {
        // java内的聚合对象（collection）全都已经实现迭代器模式
        List<Integer> aggregate = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8);
        Iterator<Integer> iterator = aggregate.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
