package items;
import enums.Adjectives;
import interfece.Discrable;

public class Fluff implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.SWAN.toString() + " " + "пух" + " ";
        return vod;
    }
}
