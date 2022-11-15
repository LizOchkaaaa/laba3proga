package com.main;
import enums.ranks;
import items.*;

public class Main {
    public static void main(String[] args){
        Person k = new Person("фрекен Снорк");
        Dress d = new Dress("Платья");
        Brocade b = new Brocade();
        Tulle t = new Tulle();
        Fluff f = new Fluff();
        Silk s = new Silk();
        Velvet v = new Velvet();
        Sequins sq = new Sequins();
        Outbreaks o = new Outbreaks();
        Folds fo = new Folds();
        System.out.print(d.describe());
        d.hung();
        d.hung1(true);
        System.out.println(b.describe() + t.describe() + f.describe() + s.describe() + "и" + " " + v.describe());
        System.out.print(sq.describe());
        sq.flicker(true);
        sq.winked(true);
        System.out.println(o.describe());
        System.out.print(k.describe() + k);
        k.go(true);
        System.out.print(k);
        k.caress(); k.hug(); k.burrow(); k.press();
        d.rustle(); d.smell(); d.envelop();
        System.out.print(ranks.SUDDENLY.toString()+ " " + k);
        k.release(d);
        System.out.print(" " + "платья");
        k.stand();
        System.out.print("\n");
        Person chel1 = new Person("Иришка");
        Person chel2 = new Person("Олег");
        System.out.println(chel1.equals(chel2));

        System.out.println(chel1.toString());
        System.out.println(chel2.toString());

        System.out.println(chel1.hashCode());
        System.out.println(chel2.hashCode());

    }
}
