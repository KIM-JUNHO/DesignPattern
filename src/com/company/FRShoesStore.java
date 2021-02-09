package com.company;

public class FRShoesStore extends ShoesStore {

    @Override
    Shoes makeShoes(String name) {
        // TODO Auto-generated method stub

        Shoes shoes = null;
        ShoesIngredientFactory shoesIngredientFactory = new FRShoesIngredientFactory();
        if (name.equals("blackShoes")) {

            shoes = new BlackShoes(shoesIngredientFactory);
            shoes.setName("프랑스 스타일의 검은 구두");

        } else if (name.equals("brownShoes")) {

            shoes = new BrownShoes(shoesIngredientFactory);
            shoes.setName("프랑스 스타일의 갈색 구두");
        } else if (name.equals("redShoes")) {

            shoes = new RedShoes(shoesIngredientFactory);
            shoes.setName("프랑스 스타일의 빨간 구두");
        }

        return shoes;

    }

}
