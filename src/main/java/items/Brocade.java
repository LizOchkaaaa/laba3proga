package items;
import enums.Adjectives;
import interfece.Discrable;

public class Brocade implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.HEAVY.toString() + " " + Adjectives.SPARKLING.toString() + " " + "парча" + " ";
        return vod;
    }
}