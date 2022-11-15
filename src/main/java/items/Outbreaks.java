package items;

import enums.Adjectives;
import interfece.Discrable;

public class Outbreaks implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.SHORT.toString() + " " + "вспышками" + " ";
        return vod;
    }
}
