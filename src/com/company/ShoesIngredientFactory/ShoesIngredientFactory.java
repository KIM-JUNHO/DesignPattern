package com.company.ShoesIngredientFactory;

import com.company.Bottom.Bottom;
import com.company.Leather.Leather;

public interface ShoesIngredientFactory {
    public Bottom makeBottom();

    public Leather makeLeather();

    public boolean hasPattern();
}
