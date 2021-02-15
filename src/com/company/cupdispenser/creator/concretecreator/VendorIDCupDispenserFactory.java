package com.company.cupdispenser.creator.concretecreator;

import com.company.VendorID;
import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.cupdispenser.product.concreteproduct.NespressoCupDispenser;
import com.company.cupdispenser.product.concreteproduct.SamsungCupDispenser;

public class VendorIDCupDispenserFactory extends CupDispenserFactory {
    private static final VendorIDCupDispenserFactory vendorIDCupDispenserFactory = new VendorIDCupDispenserFactory();
    public static VendorIDCupDispenserFactory getInstance() {
        return vendorIDCupDispenserFactory;
    }

    @Override
    public CupDispenser createCupDispenser(VendorID vendorID) {
        switch (vendorID) {
            case SAMSUNG:
                return new SamsungCupDispenser();
            case NESPRESSO:
                return new NespressoCupDispenser();
        }
        return null;
    }
}