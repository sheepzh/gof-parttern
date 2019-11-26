package structure.adapter.clz;

import structure.adapter.AdapteeTypeC;
import structure.adapter.MicroUsb;

/**
 * 类结构模式，耦合度更高
 * TypeC 适配器
 *
 * @author zhyyy 2019/11/7
 **/
public class AdapterTypeC extends AdapteeTypeC implements MicroUsb {
    @Override
    public void charge() {
        super.chargeTransfer();
    }
}
