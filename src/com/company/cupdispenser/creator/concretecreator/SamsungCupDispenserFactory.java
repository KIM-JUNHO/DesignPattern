package com.company.cupdispenser.creator.concretecreator;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;
import com.company.cupdispenser.product.concreteproduct.SamsungCupDispenser;

public class SamsungCupDispenserFactory extends CupDispenserFactory {

    @Override
    public CupDispenser createCupDispenser() {
        return new SamsungCupDispenser();
    }
}
