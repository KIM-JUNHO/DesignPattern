package com.company;

public interface ShoesIngredientFactory {
    public Bottom makeBottom();

    public Leather makeLeather();

    public boolean hasPattern();
}
