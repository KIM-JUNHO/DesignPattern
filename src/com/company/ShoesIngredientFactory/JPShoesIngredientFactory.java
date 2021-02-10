package com.company.ShoesIngredientFactory;

import com.company.Bottom.Bottom;
import com.company.Leather.Leather;
import com.company.Leather.LeatherOfCows;
import com.company.Bottom.RubberBottom;

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
