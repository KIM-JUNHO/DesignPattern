package com.company.store.abstractfactory.concretefactory;

import com.company.cupdispenser.product.CupDispenser;
import com.company.cupdispenser.product.concreteproduct.SamsungCupDispenser;
import com.company.icemaker.product.IceMaker;
import com.company.icemaker.product.concreteproduct.SamsungIceMaker;
import com.company.store.abstractfactory.StoreFactory;

public class SamsungStoreFactory extends StoreFactory {
    private static final SamsungStoreFactory samsungStoreFactory = new SamsungStoreFactory();

    public static SamsungStoreFactory getInstance() {
        return samsungStoreFactory;
    }

    @Override
    public IceMaker createIceMaker() {
        return new SamsungIceMaker();
    }

    @Override
    public CupDispenser createCupDispenser() {
        return new SamsungCupDispenser();
    }
}
