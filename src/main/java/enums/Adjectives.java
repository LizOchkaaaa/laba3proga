package enums;

public enum Adjectives {
    BLACK("черный"),
    EASY("легкий"),
    PRINTED("набивной"),
    MULTICOLORED("разноцветный"),
    STUNNED("oшеломленный"),
    SHORT("короткий"),
    SOFT("мягкий"),
    SWAN("лебяжий"),
    HEAVY("тяжелый"),
    SPARKLING("сверкающий");

    private String attribute;

    Adjectives(String mean) {
        this.attribute = mean;
    }

    public String toString() {
        return attribute;
    }
}
