package com.company;

public class Main {

    public static void main(String[] args) {
        MicrowaveFacade microwave = new MicrowaveFacade(Mode.FAST);
        microwave.on();

        try {
            Thread.sleep(2000);
            microwave.off();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
