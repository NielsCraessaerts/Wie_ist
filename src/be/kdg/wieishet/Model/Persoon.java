package be.kdg.wieishet.Model;
import be.kdg.wieishet.Model.Enums.*;
import javafx.scene.image.Image;

public class Persoon  {
    public Geslacht geslacht;
    public Kleur kleur;
    public Haar haar;
    public Gezichtsbeharing gezichtsbeharing;
    public Extra extra;
    public String Naam;
    private int karakterid;
    private String config;
    private Image karakter;


    public Persoon(String Naam, Geslacht geslacht, Kleur kleur, Haar haar, Gezichtsbeharing gezichtsbeharing, Extra extra, int karakterid) {
        this.geslacht = geslacht;
        this.kleur = kleur;
        this.haar = haar;
        this.gezichtsbeharing = gezichtsbeharing;
        this.extra = extra;
        this.Naam = Naam;
        this.karakterid = karakterid;
        this.karakter = new Image("/characters/character" + karakterid + ".png");
    }

    public Persoon(String config) {

        String[] config2 = config.split(",");


        this.Naam = config2[0];
        this.geslacht = Geslacht.valueOf(config2[1]);
        this.kleur = Kleur.valueOf(config2[2]);
        this.haar = Haar.valueOf(config2[3]);
        this.gezichtsbeharing = Gezichtsbeharing.valueOf(config2[4]);
        this.extra = Extra.valueOf(config2[5]);
        this.karakterid = Integer.parseInt(config2[6]);
        this.karakter = new Image("/characters/character" + karakterid + ".png");


    }

    public Image getImage() {
     return new Image("/characters/character"+this.karakterid+".png");
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
        return "be.kdg.wieishet.Model.Persoon{" +" Naam=" + Naam +
                ", geslacht=" + geslacht +
                ", kleur=" + kleur +
                ", haar=" + haar +
                ", gezichtsbeharing=" + gezichtsbeharing +
                ", extra=" + extra +
                '\'' +
                '}';
    }
}
