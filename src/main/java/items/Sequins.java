package items;
import interfece.ActionSequins;
import enums.Adjectives;
import interfece.Discrable;
import static enums.ranks.EVERYWHERE;

public class Sequins implements ActionSequins, Discrable {
    public boolean flick = true;
    public boolean wink = true;

    @Override
    public String describe() {
        String vod = "";
        if (flick) vod = EVERYWHERE.toString() + " " + Adjectives.MULTICOLORED.toString() + " " + "блестки" + " ";
        return vod;
    }

    @Override
    public void flicker(boolean flick) {
        if (flick)
            System.out.print("мерцали" + " ");
        else
            System.out.print("не мерцали" + " ");
    }

    @Override
    public void winked(boolean wink) {
        if (wink)
            System.out.print("перемигивались" + " ");
        else
            System.out.print("не перемигивались" + " ");
    }
}
