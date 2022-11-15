package enums;

public enum ranks {
    ENDKESS ("бесконечными рядами"),
    FIRST ("одно"),
    SECOND ("другим"),
    EVERYWHERE ("всюду"),
    NEAR ("ближе"),
    SUDDENLY ("внезапно"),
    LITTLE ("немного");

    private String attribute;

    ranks(String znach) {
        attribute = znach;
    }

    public String toString() {
        return attribute;
    }
}
