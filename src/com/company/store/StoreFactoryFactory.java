package com.company.store;

import com.company.VendorID;
import com.company.store.abstractfactory.StoreFactory;
import com.company.store.abstractfactory.concretefactory.NespressoStoreFactory;
import com.company.store.abstractfactory.concretefactory.SamsungStoreFactory;

public class StoreFactoryFactory {
    public static StoreFactory getStoreFactory(VendorID vendorID) {
        switch (vendorID) {
            case SAMSUNG:
                return SamsungStoreFactory.getInstance();
            case NESPRESSO:
                return NespressoStoreFactory.getInstance();
        }
        return null;
    }
}
