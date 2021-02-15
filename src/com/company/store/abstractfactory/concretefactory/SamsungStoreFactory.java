package com.company.store.abstractfactory.concretefactory;

import com.company.store.abstractfactory.StoreAbstractFactory;
import com.company.store.abstractproduct.Store;
import com.company.store.abstractproduct.concreteproduct.SamsungStore;

public class SamsungStoreFactory implements StoreAbstractFactory {
    @Override
    public Store createStore() {
        return new SamsungStore();
    }
}
