package com.company.store.abstractfactory.concretefactory;

import com.company.cupdispenser.product.CupDispenser;
import com.company.cupdispenser.product.concreteproduct.NespressoCupDispenser;
import com.company.icemaker.product.IceMaker;
import com.company.icemaker.product.concreteproduct.NespressoIceMaker;
import com.company.store.abstractfactory.StoreFactory;

public class NespressoStoreFactory extends StoreFactory {
    private static final NespressoStoreFactory nespressoStoreFactory = new NespressoStoreFactory();

    public static NespressoStoreFactory getInstance() {
        return nespressoStoreFactory;
    }

    @Override
    public IceMaker createIceMaker() {
        return new NespressoIceMaker();
    }

    @Override
    public CupDispenser createCupDispenser() {
        return new NespressoCupDispenser();
    }
}
