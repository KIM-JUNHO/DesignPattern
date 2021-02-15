package com.company.store;

import com.company.VendorID;
import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.product.IceMaker;

public class Store {
    public IceMaker iceMaker;
    public CupDispenser cupDispenser;

    public Store(VendorID vendorID) {
        iceMaker = StoreFactoryFactory.getStoreFactory(vendorID).createIceMaker();
        cupDispenser = StoreFactoryFactory.getStoreFactory(vendorID).createCupDispenser();
    }
}
