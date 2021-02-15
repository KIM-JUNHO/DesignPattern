package com.company;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.creator.concretecreator.VendorIDCupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.creator.IceMakerFactory;
import com.company.icemaker.creator.concrecreator.VendorIDIceMakerFactory;
import com.company.icemaker.product.IceMaker;
import com.company.store.abstractfactory.StoreFactory;
import com.company.store.abstractfactory.concretefactory.NespressoStoreFactory;
import com.company.store.abstractfactory.concretefactory.SamsungStoreFactory;
import com.company.store.abstractproduct.Store;

public class Main {
    public static void main(String[] args) {
        CupDispenserFactory cupDispenserFactory = new VendorIDCupDispenserFactory();
        CupDispenser samsungCupDispenser = cupDispenserFactory.createCupDispenser(VendorID.SAMSUNG);
        CupDispenser nespressoCupDispenser = cupDispenserFactory.createCupDispenser(VendorID.NESPRESSO);
        System.out.println(samsungCupDispenser.getName());
        System.out.println(nespressoCupDispenser.getName());

        IceMakerFactory iceMakerFactory = new VendorIDIceMakerFactory();
        IceMaker samsungIceMaker = iceMakerFactory.createIceMaker(VendorID.SAMSUNG);
        IceMaker nespressoIceMaker = iceMakerFactory.createIceMaker(VendorID.NESPRESSO);
        System.out.println(samsungIceMaker.getName());
        System.out.println(nespressoIceMaker.getName());

        Store samsungStore = StoreFactory.getStore(new SamsungStoreFactory());
        System.out.println(samsungStore.iceMaker.getName());
        System.out.println(samsungStore.cupDispenser.getName());

        Store nespressoStore = StoreFactory.getStore(new NespressoStoreFactory());
        System.out.println(nespressoStore.iceMaker.getName());
        System.out.println(nespressoStore.cupDispenser.getName());
    }
}
