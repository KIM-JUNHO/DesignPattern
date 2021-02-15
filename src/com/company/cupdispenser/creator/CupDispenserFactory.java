package com.company.cupdispenser.creator;

import com.company.VendorID;
import com.company.cupdispenser.product.CupDispenser;
import com.company.cupdispenser.product.concreteproduct.NespressoCupDispenser;
import com.company.cupdispenser.product.concreteproduct.SamsungCupDispenser;

public class CupDispenserFactory {
    public static CupDispenser createCupDispenser(VendorID vendorID) {
        switch (vendorID) {
            case SAMSUNG:
                return new SamsungCupDispenser();
            case NESPRESSO:
                return new NespressoCupDispenser();
        }
        return null;
    }
}
