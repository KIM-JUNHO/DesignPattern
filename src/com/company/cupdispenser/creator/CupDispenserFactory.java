package com.company.cupdispenser.creator;

import com.company.VendorID;
import com.company.cupdispenser.product.CupDispenser;

public abstract class CupDispenserFactory {
    public abstract CupDispenser createCupDispenser(VendorID vendorID);
}
