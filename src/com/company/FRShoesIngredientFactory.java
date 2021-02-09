package com.company;

public class FRShoesIngredientFactory implements ShoesIngredientFactory {
    @Override
    public Bottom makeBottom() {
        // TODO Auto-generated method stub
        return new PlasticAndRubberBottom();
    }

    @Override
    public Leather makeLeather() {
        // TODO Auto-generated method stub
        return new LeatherOfSheeps();
    }

    @Override
    public boolean hasPattern() {
        // TODO Auto-generated method stub
        return true;
    }
}
