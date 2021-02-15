package com.company;

import com.company.cupdispenser.creator.CupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;

public class Main {
    public static void main(String[] args) {
        CupDispenser samsungCupDispenser = CupDispenserFactory.createCupDispenser(VendorID.SAMSUNG);
    }
}
