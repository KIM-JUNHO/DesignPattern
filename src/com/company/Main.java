package com.company;

import com.company.cupdispenser.creator.concretecreator.SamsungCupDispenserFactory;
import com.company.cupdispenser.product.CupDispenser;

public class Main {
    public static void main(String[] args) {
        CupDispenser samsungCupDispenser = new SamsungCupDispenserFactory().createCupDispenser();
    }
}
