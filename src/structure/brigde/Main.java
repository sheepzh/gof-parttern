package structure.brigde;

import structure.brigde.branch.Branch;
import structure.brigde.branch.Nike;
import structure.brigde.branch.Onitsuka;
import structure.brigde.color.Black;
import structure.brigde.color.Color;
import structure.brigde.color.Red;
import structure.brigde.shoe.AbstractShoe;
import structure.brigde.shoe.MixcShoe;
import structure.brigde.shoe.WandaShoe;

/**
 * 桥接模式
 * 将抽象化部分与实现化部分分开，取消二者的继承关系，改用组合关系。
 * <p>
 * 桥接模式通常适用于以下场景。
 * 1.当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。
 * 2.当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。
 * 3.当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。
 *
 * @author zhyyy 2019/11/8
 **/
public class Main {
    public static void main(String[] a) {
        // 该栗子存在三个变化的维度：商场、颜色、品牌

        // 颜色维度
        Color red = new Red();
        Color black = new Black();
        // 品牌维度
        Branch nike = new Nike();
        Branch onitsuka = new Onitsuka();

        // 用户选鞋进行购买
        // 在万象城
        AbstractShoe mixc = new MixcShoe();
        mixc.setBranch(nike);
        mixc.purchase();
        mixc.setColor(black);
        mixc.purchase();
        // 在万达
        AbstractShoe wanda = new WandaShoe();
        wanda.setColor(red);
        wanda.purchase();
        wanda.setBranch(onitsuka);
        wanda.purchase();
    }

}
