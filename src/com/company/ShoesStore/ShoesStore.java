package com.company.ShoesStore;

import com.company.Beverage.Beverage;

public abstract class ShoesStore {

    public Beverage orderShoes(String name) {

        Beverage beverage;

        beverage = makeShoes(name);
        beverage.assembling();
        beverage.prepare();
        beverage.packing();

        return beverage;

    }

    abstract Beverage makeShoes(String name);

}