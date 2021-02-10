package com.company;

public class SpicyChicken extends Chicken {
    public SpicyChicken() {
        fried = new CookFried();
    }

    @Override
    public void flavor() {
        System.out.println("매콤하면서 달콤한 맛");
    }

    @Override
    public void display() {
        System.out.println("빨갛고 매워보이는 모습");
    }
}
