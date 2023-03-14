package be.kdg.wieishet.Model.Enums;


public enum Extra {
    Bril,
    Hoed,
    Ketting,
    Oorbel,
    Niets;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }

}
