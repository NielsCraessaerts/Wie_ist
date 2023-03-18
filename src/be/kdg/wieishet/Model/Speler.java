package be.kdg.wieishet.Model;

import be.kdg.wieishet.Model.Enums.*;

public class Speler {
    private String Spelersnaam;
    private Persoon TeRadenPersoon;
    private Spelbord spelbord;
    private int AantalBeurten = 0;
    private Spelerskleur spelerskleur;

    public Speler(String spelersnaam, Persoon teRadenPersoon, Spelbord spelbord, int aantalBeurten, Spelerskleur spelerskleur) {
        this.Spelersnaam = getSpelersnaam();
        this.TeRadenPersoon = getTeRadenPersoon();
        this.spelbord = spelbord;
        this.AantalBeurten = aantalBeurten;
        this.spelerskleur = spelerskleur;
    }
    public Speler(){

    }

    public String getSpelersnaam() {
        return Spelersnaam;
    }

    public void setSpelersnaam(String spelersnaam) {
        Spelersnaam = spelersnaam;
    }

    public Persoon getTeRadenPersoon() {
        return TeRadenPersoon;
    }

    public void setTeRadenPersoon(Persoon teRadenPersoon) {
        TeRadenPersoon = teRadenPersoon;
    }

    public Spelbord getSpelbord() {
        return spelbord;
    }

    public void setSpelbord(Spelbord spelbord) {
        this.spelbord = spelbord;
    }

    public int getAantalBeurten() {
        return AantalBeurten;
    }

    public void setAantalBeurten(int aantalBeurten) {
        AantalBeurten = aantalBeurten;
    }

    public Spelerskleur getSpelerskleur() {
        return spelerskleur;
    }

    public void setSpelerskleur(Spelerskleur spelerskleur) {
        this.spelerskleur = spelerskleur;
    }

}
