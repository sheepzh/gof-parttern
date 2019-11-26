package structure.brigde.shoe;

/**
 * 扩展抽象化角色
 *
 * @author zhyyy 2019/11/8
 **/
public class MixcShoe extends AbstractShoe {
    @Override
    public void purchase() {
        if (color == null) {
            System.out.println("万象城专柜需选定颜色");
            return;
        }
        if (branch == null) {
            System.out.println("万象城专柜需选定品牌");
            return;
        }
        System.out.println(String.format("华润万象城专柜卖出一双鞋:%s牌 %s", branch.name(), color.name()));
    }
}
