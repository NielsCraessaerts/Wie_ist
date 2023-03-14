package be.kdg.wieishet.Model;

import be.kdg.wieishet.Model.Enums.*;


public class Klep {
    //<editor-fold desc="Personen">
    Persoon Janine = new Persoon("Janine", Geslacht.Vrouwelijk, Kleur.Blond, Haar.Lang, Gezichtsbeharing.Niets, Extra.Hoed,1);
    Persoon Frans = new Persoon("Frans", Geslacht.Mannelijk, Kleur.Blond, Haar.Kort, Gezichtsbeharing.Niets, Extra.Niets,2);
    Persoon Fries = new Persoon("Fries", Geslacht.Noglevend, Kleur.Blond, Haar.Kort, Gezichtsbeharing.Baard, Extra.Hoed,3);
    Persoon Anne = new Persoon("Annel", Geslacht.Vrouwelijk, Kleur.Bruin, Haar.Lang, Gezichtsbeharing.Niets, Extra.Oorbel,4);
    //</editor-fold>

    public Toestand toestand;



public be.kdg.wieishet.Model.Persoon[] characters = new be.kdg.wieishet.Model.Persoon[] {
          Janine,Frans,Fries,Anne
};


    public Klep(Toestand toestand, Persoon[] characters) {
        this.toestand = toestand;
        this.characters = characters;
    }

    public Toestand getToestand() {
        return toestand;
    }

    public be.kdg.wieishet.Model.Persoon[] getCharacters() {
        return characters;
    }
}
