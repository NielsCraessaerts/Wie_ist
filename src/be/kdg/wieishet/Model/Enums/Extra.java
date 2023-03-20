package be.kdg.wieishet.Model.Enums;


public enum Extra {
    rimpels,
    sproeten,
    makeup,
    bril,
    niets;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }

}
