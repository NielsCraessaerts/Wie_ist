package be.kdg.wieishet.Model;

import be.kdg.wieishet.Model.Enums.*;
import be.kdg.wieishet.Model.*;
import be.kdg.wieishet.Model.WieishetModel;


public class Klep {
    //<editor-fold desc="Personen">
//    Persoon Janine = new Persoon("Janine", Geslacht.Vrouwelijk, Haarkleur.Blond, Haar.Lang, Gezichtsbeharing.Niets, Extra.Hoed,1);
//    Persoon Frans = new Persoon("Frans", Geslacht.Mannelijk, Haarkleur.Blond, Haar.Kort, Gezichtsbeharing.Niets, Extra.Niets,2);
//    Persoon Fries = new Persoon("Fries", Geslacht.Noglevend, Haarkleur.Blond, Haar.Kort, Gezichtsbeharing.Baard, Extra.Hoed,3);
//    Persoon Anne = new Persoon("Annel", Geslacht.Vrouwelijk, Haarkleur.Bruin, Haar.Lang, Gezichtsbeharing.Niets, Extra.Oorbel,4);
    //</editor-fold>

    public Toestand toestand;



 {

};


    public Klep(Toestand toestand, Persoon[] characters) {
        this.toestand = toestand;

    }

    public Toestand getToestand() {
        return toestand;
    }


}
