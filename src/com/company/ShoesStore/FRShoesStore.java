package com.company.ShoesStore;

import com.company.Beverage.Beverage;
import com.company.Beverage.BlackBeverage;
import com.company.Beverage.BrownBeverage;
import com.company.Beverage.RedBeverage;
import com.company.ShoesIngredientFactory.FRShoesIngredientFactory;
import com.company.ShoesIngredientFactory.ShoesIngredientFactory;

public class FRShoesStore extends ShoesStore {

    @Override
    Beverage makeShoes(String name) {
        // TODO Auto-generated method stub

        Beverage beverage = null;
        ShoesIngredientFactory shoesIngredientFactory = new FRShoesIngredientFactory();
        if (name.equals("blackShoes")) {

            beverage = new BlackBeverage(shoesIngredientFactory);
            beverage.setName("프랑스 스타일의 검은 구두");

        } else if (name.equals("brownShoes")) {

            beverage = new BrownBeverage(shoesIngredientFactory);
            beverage.setName("프랑스 스타일의 갈색 구두");
        } else if (name.equals("redShoes")) {

            beverage = new RedBeverage(shoesIngredientFactory);
            beverage.setName("프랑스 스타일의 빨간 구두");
        }

        return beverage;

    }

}
