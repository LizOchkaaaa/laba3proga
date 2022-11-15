package com.main;

import interfece.Actiondress;
import interfece.Discrable;

import static enums.ranks.*;

public class Dress extends AbstractClass implements Discrable, Actiondress {
    private boolean be = true;

    public Dress(String name) {
        super(name);
    }
    @Override
    public String describe() {
        String vod = "";
        if (be) vod = "Платья" + "," + " " + EVERYWHERE.toString() + " " + "платья" + " ";
        return vod;
    }
    @Override
    public void hung() {
        System.out.print("висели" + " ");
    }

    @Override
    public void hung1(boolean a) {
        if (a)
            System.out.print(ENDKESS.toString() +  " " + FIRST.toString() + " " +  "за" + " " + SECOND.toString() + ":");
        else System.out.print(" ");
    }
    @Override
    public void rustle() {
        System.out.print("\n" + "Платья" + " " + "шуршали" + " ");
    }

    @Override
    public void smell() {
        System.out.print(" " + "пахли пылью и духами");
    }

    @Override
    public void envelop() {
        System.out.print(" " + "окутывали мягкими складками" + "\n");
    }
}
