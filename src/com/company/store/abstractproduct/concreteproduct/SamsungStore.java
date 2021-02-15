package com.company.store.abstractproduct.concreteproduct;

import com.company.VendorID;
import com.company.cupdispenser.creator.concretecreator.VendorIDCupDispenserFactory;
import com.company.icemaker.creator.concrecreator.VendorIDIceMakerFactory;
import com.company.store.abstractproduct.Store;

public class SamsungStore extends Store {
    public SamsungStore() {
        this.cupDispenser = VendorIDCupDispenserFactory.getInstance().createCupDispenser(VendorID.SAMSUNG);
        this.iceMaker = VendorIDIceMakerFactory.getInstance().createIceMaker(VendorID.SAMSUNG);
    }
}
