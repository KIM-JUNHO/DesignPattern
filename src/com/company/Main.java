package com.company;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.creator.concretecreator.VendorIDCupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.icemaker.creator.IceMakerFactory;
import com.company.icemaker.creator.concrecreator.VendorIDIceMakerFactory;
import com.company.icemaker.product.IceMaker;

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
    }
}
