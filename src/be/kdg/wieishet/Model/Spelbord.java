package be.kdg.wieishet.Model;

public class Spelbord {
        private Klep[] klep = new Klep[24];

    public Spelbord(Klep[] klep) {
        this.klep = klep;
    }

    public Klep getKlep(int i) {
        return klep[i];
    }

    public Klep[] getKlep() {
        return klep;
    }

    public void setKlep(Klep klep,int positie) {
        this.klep[positie] = klep;
    }

    public Spelbord(){};

}
