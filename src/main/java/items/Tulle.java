package items;

import enums.Adjectives;
import interfece.Discrable;

public class Tulle implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.EASY.toString() + " " + "облачка тюля" + " ";
        return vod;
    }
}
