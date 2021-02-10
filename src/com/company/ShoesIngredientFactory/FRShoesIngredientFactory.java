package com.company.ShoesIngredientFactory;

import com.company.Bottom.Bottom;
import com.company.Leather.Leather;
import com.company.Leather.LeatherOfSheeps;
import com.company.Bottom.PlasticAndRubberBottom;

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
