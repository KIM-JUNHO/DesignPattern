package com.company;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.creator.IceMakerFactory;
import com.company.icemaker.product.IceMaker;

public class Main {
    public static void main(String[] args) {
        CupDispenser samsungCupDispenser = CupDispenserFactory.createCupDispenser(VendorID.SAMSUNG);
        IceMaker samsungIceMaker = IceMakerFactory.createIceMaker(VendorID.SAMSUNG);

        CupDispenser nespressoCupDispenser = CupDispenserFactory.createCupDispenser(VendorID.NESPRESSO);
        IceMaker nespressoIceMaker = IceMakerFactory.createIceMaker(VendorID.NESPRESSO);
    }
}
