package be.kdg.wieishet.Model.Enums;

public enum Gezichtsbeharing {
    Niets,
    Baard,
    Snor,
    Pornosnor,
    Verkeerdgegroeidbalhaar;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
