package com.company.store.abstractproduct.concreteproduct;

import com.company.VendorID;
import com.company.cupdispenser.creator.concretecreator.VendorIDCupDispenserFactory;
import com.company.icemaker.creator.concrecreator.VendorIDIceMakerFactory;
import com.company.store.abstractproduct.Store;

public class NespressoStore extends Store {
    public NespressoStore() {
        this.cupDispenser = VendorIDCupDispenserFactory.getInstance().createCupDispenser(VendorID.NESPRESSO);
        this.iceMaker = VendorIDIceMakerFactory.getInstance().createIceMaker(VendorID.NESPRESSO);
    }
}
