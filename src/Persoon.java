public class Persoon  {
    public Geslacht geslacht;
    public Kleur kleur;
    public Haar haar;
    public Gezichtsbeharing gezichtsbeharing;
    public Extra extra;
    public String Naam;


    public Persoon(String Naam,Geslacht geslacht, Kleur kleur, Haar haar, Gezichtsbeharing gezichtsbeharing, Extra extra ) {
        this.geslacht = geslacht;
        this.kleur = kleur;
        this.haar = haar;
        this.gezichtsbeharing = gezichtsbeharing;
        this.extra = extra;
        this.Naam = Naam;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public Haar getHaar() {
        return haar;
    }

    public Gezichtsbeharing getGezichtsbeharing() {
        return gezichtsbeharing;
    }

    public Extra getExtra() {
        return extra;
    }

    public String getNaam() {
        return Naam;
    }

    public boolean isGelijkAan(String question) {
        // Gebruik de vraag van de speler om te bepalen of het karakter aan de eigenschap voldoet
        if (question.contains("man") || question.contains("vrouw")) {
            return geslacht.isGelijkAan(question);
        } else if (question.contains("bruin") || question.contains("kaal") || question.contains("rood")|| question.contains("blauw") || question.contains("groen") || question.contains("blond") || question.contains("zwart")) {
            return kleur.isGelijkAan(question);
        } else if (question.contains("bril") || question.contains("pet") || question.contains("oorbel") || question.contains("ketting") || question.contains("geen")  || question.contains("hoed")) {
            return extra.isGelijkAan(question);
        } else if (question.contains("bril") || question.contains("pet") || question.contains("oorbel") || question.contains("ketting") || question.contains("geen")  || question.contains("hoed")) {
            return haar.isGelijkAan(question);
        } else if (question.contains("kort") || question.contains("lang") || question.contains("kaal") || question.contains("middelang")){
            return gezichtsbeharing.isGelijkAan(question);
        }
        return false;

}

    @Override
    public String toString() {
        return "Persoon{" +" Naam=" + Naam +
                ", geslacht=" + geslacht +
                ", kleur=" + kleur +
                ", haar=" + haar +
                ", gezichtsbeharing=" + gezichtsbeharing +
                ", extra=" + extra +
                '\'' +
                '}';
    }
}
