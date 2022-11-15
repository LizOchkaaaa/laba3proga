package items;

import enums.Adjectives;
import interfece.Discrable;

public class Silk implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.PRINTED.toString() + " "  + Adjectives.MULTICOLORED.toString() + " " + "шелк" + " ";
        return vod;
    }
}
