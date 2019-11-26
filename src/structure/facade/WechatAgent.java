package structure.facade;

import structure.facade.child.GasPayment;
import structure.facade.child.WaterPayment;

/**
 * @author zhyyy 2019/11/8
 **/
public class WechatAgent implements PaymentAgent {

    private GasPayment gasPayment = new GasPayment();
    private WaterPayment waterPayment = new WaterPayment();

    @Override
    public void pay() {
        System.out.println("欢迎使用微信水电气费代缴服务：");
        gasPayment.pay();
        waterPayment.pay();
    }
}
