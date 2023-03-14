package be.kdg.wieishet.Model.Enums;

public enum Kleur {
    Blond,
    Zwart,
    Grijs,
    Ros,
    Rood,
    Bruin,
    Blauw;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
