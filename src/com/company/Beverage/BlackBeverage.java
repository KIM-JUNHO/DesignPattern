package com.company.Beverage;

import com.company.ShoesIngredientFactory.ShoesIngredientFactory;

public class BlackBeverage extends Beverage {
    ShoesIngredientFactory shoesIngredientFactory;

    public BlackBeverage(ShoesIngredientFactory shoesIngredientFactory) {
        this.shoesIngredientFactory = shoesIngredientFactory;
    }

    @Override
    public void assembling() {
        // TODO Auto-generated method stub

        System.out.println("신발을 만들고 있습니다.. " + name);
        leather = shoesIngredientFactory.makeLeather();
        bottom = shoesIngredientFactory.makeBottom();
        System.out.println("신발 정보 : 밑창은 " + bottom.getName() + " 사용 하였으며 가죽은 " + leather.getName() + " 사용하였음");

    }
}
