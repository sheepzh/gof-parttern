package structure.adapter.obj;

import structure.adapter.AdapteeTypeC;
import structure.adapter.MicroUsb;

/**
 * 对象结构模式，耦合度更低，开发者不用了解具体Adaptee的实现，传什么用什么
 *
 * @author zhyyy 2019/11/7
 **/
public class AdapterTypeC implements MicroUsb {

    private AdapteeTypeC adapteeTypeC;

    public AdapterTypeC(AdapteeTypeC adapteeTypeC) {
        this.adapteeTypeC = adapteeTypeC;
    }

    @Override
    public void charge() {
        adapteeTypeC.chargeTransfer();
    }
}
