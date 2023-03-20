package be.kdg.wieishet.Model.Enums;

public enum Gezichtsbeharing {
    niets,
    baard,
    snor,
    ringbaard;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
