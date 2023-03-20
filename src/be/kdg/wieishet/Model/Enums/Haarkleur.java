package be.kdg.wieishet.Model.Enums;

public enum Haarkleur {
    blond,
    zwart,
    grijs,
    ros,

    bruin;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
