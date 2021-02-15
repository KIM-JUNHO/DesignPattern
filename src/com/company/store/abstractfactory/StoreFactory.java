package com.company.store.abstractfactory;

import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.product.IceMaker;

public abstract class StoreFactory {
    public abstract IceMaker createIceMaker();
    public abstract CupDispenser createCupDispenser();
}
