package com.main;
import interfece.ActionPerson;
import interfece.Discrable;
import static enums.Adjectives.STUNNED;
import static enums.ranks.LITTLE;
import static enums.ranks.NEAR;

public class Person extends AbstractClass implements ActionPerson, Discrable {
    private boolean yes = true;
    public Person(String name) {
        super(name);
    }
    @Override
    public void go(boolean yes) {
        if (yes)
            System.out.print(" " + "подошла" + " " + NEAR.toString() + ".");
        else
            System.out.print(" " + "не подошла" + " " );
    }

    @Override
    public String describe() {
        String vod = STUNNED.toString() + " ";
        return vod;
    }


    @Override
    public void caress() {
        System.out.print(" " + "ласкала" + " " + "платья");
    }

    @Override
    public void hug() {
        System.out.print(" " + "заключала в объятия");
    }

    @Override
    public void burrow() {
        System.out.print(" " + "зарывалась мордочкой");
    }

    @Override
    public void press() {
        System.out.print(" " + "прижимала к груди");
    }

    @Override
    public void release(Dress dress) {
        System.out.print(" " + "выпустила из лапок");
    }

    @Override
    public void stand() {
            System.out.print(" " + "и" + " " + LITTLE.toString() + " " + "постояла на голове");
    }
}
