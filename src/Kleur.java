public enum Kleur {
    Blond,
    Zwart,
    Grijs,
    Ros,
    Groen,
    Bruin,
    Blauw;

    public boolean isGelijkAan(String question) {
        return question.contains(name().toLowerCase());
    }
}
