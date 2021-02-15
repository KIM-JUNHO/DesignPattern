package com.company.icemaker.creator;

import com.company.VendorID;
import com.company.icemaker.product.IceMaker;

public abstract class IceMakerFactory {
    public abstract IceMaker createIceMaker(VendorID vendorID);
}
