package structure.facade;

import structure.facade.child.ElectricPayment;
import structure.facade.child.GasPayment;
import structure.facade.child.WaterPayment;

/**
 * @author zhyyy 2019/11/8
 **/
public class AlipayAgent implements PaymentAgent {

    private WaterPayment waterPayment = new WaterPayment();
    private ElectricPayment electricPayment = new ElectricPayment();
    private GasPayment gasPayment = new GasPayment();

    @Override
    public void pay() {
        System.out.println("欢迎使用支付宝水电气费代缴服务：");
        waterPayment.pay();
        electricPayment.pay();
        gasPayment.pay();
    }
}
