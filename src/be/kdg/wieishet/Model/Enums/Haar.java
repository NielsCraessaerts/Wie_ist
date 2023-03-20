package be.kdg.wieishet.Model.Enums;

public enum Haar {
    kaal, lang, kort;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
