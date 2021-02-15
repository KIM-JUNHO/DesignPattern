package com.company.store.abstractfactory;

import com.company.store.abstractproduct.Store;

public class StoreFactory {
    public static Store getStore(StoreAbstractFactory storeAbstractFactory) {
        return storeAbstractFactory.createStore();
    }
}
