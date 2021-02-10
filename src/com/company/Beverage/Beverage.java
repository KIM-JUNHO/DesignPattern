package com.company.Beverage;

import com.company.Bottom.Bottom;
import com.company.Leather.Leather;

public abstract class Beverage {
    String name;
    Bottom bottom;
    Leather leather;
    boolean hasPattern;

    public abstract void assembling();

    public void prepare() {

        System.out.println("완성된 신발을 준비 중 입니다..");
    }

    public void packing() {

        System.out.println("신발을 포장 하고 있습니다..");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
