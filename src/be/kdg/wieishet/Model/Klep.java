package be.kdg.wieishet.Model;

import be.kdg.wieishet.Model.Enums.*;


public class Klep {


    private String toestand;
    private Persoon karakter;



 {

};


    public Klep(String toestand, Persoon karakter) {
        this.toestand = toestand;
        this.karakter = karakter;

    }

    public Klep(Persoon karakter) {
        this.karakter = karakter;
    }

    public String getToestand() {
        return toestand;
    }

    public void setToestand(String toestand) {
        this.toestand = toestand;
    }

    public Persoon getKarakter() {
        return karakter;
    }

    public void setKarakter(Persoon karakter) {
        this.karakter = karakter;
    }
}
