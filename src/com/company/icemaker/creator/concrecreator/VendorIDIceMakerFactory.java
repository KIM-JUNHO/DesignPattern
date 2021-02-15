package com.company.icemaker.creator.concrecreator;

import com.company.VendorID;
import com.company.icemaker.creator.IceMakerFactory;
import com.company.icemaker.product.IceMaker;
import com.company.icemaker.product.concreteproduct.NespressoIceMaker;
import com.company.icemaker.product.concreteproduct.SamsungIceMaker;

public class VendorIDIceMakerFactory extends IceMakerFactory {
    @Override
    public IceMaker createIceMaker(VendorID vendorID) {
        switch (vendorID) {
            case SAMSUNG:
                return new SamsungIceMaker();
            case NESPRESSO:
                return new NespressoIceMaker();
        }
        return null;
    }
}
