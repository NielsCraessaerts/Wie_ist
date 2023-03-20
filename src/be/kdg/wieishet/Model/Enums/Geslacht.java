package be.kdg.wieishet.Model.Enums;

public enum Geslacht  {
    mannelijk,
    vrouwelijk,
    bloempot,
    noglevend;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}

