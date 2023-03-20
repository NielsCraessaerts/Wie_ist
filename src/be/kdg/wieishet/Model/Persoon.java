package be.kdg.wieishet.Model;
import be.kdg.wieishet.Model.Enums.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Persoon  {
    public Geslacht geslacht;
    public Haarkleur haarkleur;
    public Haar haar;
    public Gezichtsbeharing gezichtsbeharing;
    public Extra extra;
    public String Naam;
    public  int karakterid;
    private String config;
    private  ImageView karakter;
    private ImageView karakterelim;



    public Persoon(String Naam, Geslacht geslacht, Haarkleur haarkleur, Haar haar, Gezichtsbeharing gezichtsbeharing, Extra extra, int karakterid) {
        this.geslacht = geslacht;
        this.haarkleur = haarkleur;
        this.haar = haar;
        this.gezichtsbeharing = gezichtsbeharing;
        this.extra = extra;
        this.Naam = Naam;
        this.karakterid = karakterid;
        this.karakter = new ImageView("/characters/character" + karakterid + ".png");

    }



    public Persoon(String config) {
        String[] config2 = config.split(",");

        this.Naam = config2[0];
        this.geslacht = Geslacht.valueOf(config2[1]);
        this.haarkleur = Haarkleur.valueOf(config2[2]);
        this.haar = Haar.valueOf(config2[3]);
        this.gezichtsbeharing = Gezichtsbeharing.valueOf(config2[4]);
        this.extra = Extra.valueOf(config2[5]);
        this.karakterid = Integer.parseInt(config2[6]);
        this.karakter = new ImageView("/characters/character" + karakterid + ".png");
        this.karakterelim = new ImageView("/Elim-character/characterelim" + karakterid +".png");


    }


    public  Image getImage( ) {
     return new Image("/characters/character" + karakterid + ".png");
    }

    public  int getKarakterid() {
        return karakterid;
    }

    public  ImageView getKarakter() {
        return karakter;
    }

    public Geslacht getGeslacht() {
        return geslacht;
    }

    public Haarkleur getKleur() {
        return haarkleur;
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

    public Haarkleur getHaarkleur() {
        return haarkleur;
    }

    public ImageView getKarakterelim() {
        return karakterelim;
    }

    public boolean isGelijkAan(String question) {
        // Gebruik de vraag van de speler om te bepalen of het karakter aan de eigenschap voldoet
        if (question.contains("mannelijk") || question.contains("vrouwelijk")|| question.contains("bloempot")|| question.contains("noglevend")) {
            return geslacht.isGelijkAan(question);
        } else if (question.contains("blond") || question.contains("zwart") || question.contains("grijs")|| question.contains("ros") || question.contains("bruin") ) {
            return haarkleur.isGelijkAan(question);
        } else if (question.equals("rimpels") || question.equals("sproeten") || question.equals("makeup") || question.equals("bril") || question.equals("niets") ) {
            return extra.isGelijkAan(question);
        } else if (question.contains("kaal") || question.contains("lang") || question.contains("kort") ) {
            return haar.isGelijkAan(question);
        } else if (question.contains("niets") || question.contains("baard") || question.contains("snor") ){
            return gezichtsbeharing.isGelijkAan(question);
        }
        return false;

}

    @Override
    public String toString() {
        return "Persoon{" +
                "geslacht=" + geslacht +
                ", haarkleur=" + haarkleur +
                ", haar=" + haar +
                ", gezichtsbeharing=" + gezichtsbeharing +
                ", extra=" + extra +
                ", Naam='" + Naam + '\'' +
                ", karakterid=" + karakterid +
                ", karakter=" + karakter +
                '}';
    }
}
