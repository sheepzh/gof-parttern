package structure.brigde.shoe;


/**
 * @author zhyyy 2019/11/8
 **/
public class WandaShoe extends AbstractShoe {
    @Override
    public void purchase() {
        String result = "万达专柜卖出一双鞋：";
        if (branch != null) {
            result += branch.name() + "牌 ";
        }
        if (color != null) {
            result += color.name();
        }
        System.out.println(result);
    }
}
