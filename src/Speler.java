public class Speler {
    public String Spelersnaam;
    public Persoon TeRadenPersoon;
    public Spelbord spelbord;
    public int AantalBeurten = 0;
    public Spelerskleur spelerskleur;

    public Speler(String spelersnaam, Persoon teRadenPersoon, Spelbord spelbord, int aantalBeurten, Spelerskleur spelerskleur) {
        this.Spelersnaam = spelersnaam;
        this.TeRadenPersoon = teRadenPersoon;
        this.spelbord = spelbord;
        this.AantalBeurten = aantalBeurten;
        this.spelerskleur = spelerskleur;
    }

}
