package com.company;

import com.company.ShoesStore.FRShoesStore;
import com.company.ShoesStore.JPShoesStore;
import com.company.ShoesStore.ShoesStore;

public class Main {

    public static void main(String[] args) {
        ShoesStore jpStore = new JPShoesStore();
        jpStore.orderShoes("blackShoes");

        ShoesStore frStore = new FRShoesStore();
        frStore.orderShoes("redShoes");
    }
}
