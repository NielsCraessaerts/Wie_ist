public enum Geslacht  {
    Mannelijk,
    Vrouwelijk,
    Bloempot,
    Noglevend;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}

