public enum Haar {
    Kaal, Lang, Kort, Corny;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
