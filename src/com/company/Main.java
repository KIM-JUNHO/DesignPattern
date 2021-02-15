package com.company;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.creator.concretecreator.VendorIDCupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.creator.IceMakerFactory;
import com.company.icemaker.creator.concrecreator.VendorIDIceMakerFactory;
import com.company.icemaker.product.IceMaker;
import com.company.store.Store;
import com.company.store.StoreFactoryFactory;

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

        System.out.println(StoreFactoryFactory.getStoreFactory(VendorID.SAMSUNG).createCupDispenser().getName());
        System.out.println(StoreFactoryFactory.getStoreFactory(VendorID.SAMSUNG).createIceMaker().getName());

        Store samsungStore = new Store(VendorID.SAMSUNG);
        System.out.println(samsungStore.iceMaker.getName());
        System.out.println(samsungStore.cupDispenser.getName());

    }
}
