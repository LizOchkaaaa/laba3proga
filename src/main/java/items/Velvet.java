package items;
import enums.Adjectives;
import interfece.Discrable;

public class Velvet implements Discrable {
    @Override
    public String describe() {
        String vod = Adjectives.BLACK.toString() + " " + "бархат" + " ";
        return vod;
    }
}
