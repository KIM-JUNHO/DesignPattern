package com.company;

public abstract class Chicken {

    Fried fried;

    public abstract void flavor();
    public abstract void  display();
    public void number() {
        System.out.println("한마리");
    };
    public void cooking() {fried.fried();}

    public void setFried(Fried fried) {
        this.fried = fried;
    }


}