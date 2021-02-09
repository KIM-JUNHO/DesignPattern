package com.company;

public class Main {

    public static void main(String[] args) {
        JPShoesStore jpStore = new JPShoesStore();
        jpStore.orderShoes("blackShoes");

        FRShoesStore frStore = new FRShoesStore();
        frStore.orderShoes("redShoes");
    }
}
