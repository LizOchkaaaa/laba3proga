package items;
import enums.Adjectives;
import interfece.Discrable;

public class Folds implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.SOFT.toString() + " " + "складками" + " ";
        return vod;
    }
}
