package com.company;

public class JPShoesIngredientFactory implements ShoesIngredientFactory {
    @Override
    public Bottom makeBottom() {
        // TODO Auto-generated method stub
        return new RubberBottom();
    }

    @Override
    public Leather makeLeather() {
        // TODO Auto-generated method stub
        return new LeatherOfCows();
    }

    @Override
    public boolean hasPattern() {
        // TODO Auto-generated method stub
        return false;
    }

}
