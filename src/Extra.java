public enum Extra {
    Bril,
    Hoed,
    Ketting,
    Oorbel;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }

}
