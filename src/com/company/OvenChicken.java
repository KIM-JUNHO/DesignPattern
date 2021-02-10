package com.company;

public class OvenChicken extends Chicken {
    public OvenChicken(){
        fried = new CookGrill();
    }

    @Override
    public void flavor() {
        System.out.println("바베큐 향이 가득한 맛");
    }

    @Override
    public void display() {
        System.out.println("격자 무늬로 구워진 자국이 보이는 먹음직 스러운 모습");
    }
}
