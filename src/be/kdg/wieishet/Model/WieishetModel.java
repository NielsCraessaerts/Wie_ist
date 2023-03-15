package be.kdg.wieishet.Model;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class WieishetModel {
    private Speler speler1;
    private Speler speler2;
    private Speler huidigeSpeler;
    private Persoon[] characters;



    public WieishetModel(Speler speler1, Speler speler2, Speler huidigeSpeler) {
        this.speler1 = speler1;
        this.speler2 = speler2;
        this.huidigeSpeler = huidigeSpeler;
        characters = new Persoon[24];

    }

    public WieishetModel() {
        try{
        characters = new Persoon[24];
        BufferedReader ConfigReader = new BufferedReader(new FileReader("/txt files/KarakterAanmaak.txt"));
        String Line = ConfigReader.readLine();
         int counter = 0;

            while (Line != null) {

                Persoon p   = new Persoon(Line);
                characters[counter] = p;
                counter++;
                Line = ConfigReader.readLine();

            }
        }
        catch(IOException e){}


    }

    public Speler getSpeler1() {
        return speler1;
    }

    public void setSpeler1(Speler speler1) {
        this.speler1 = speler1;
    }

    public Speler getSpeler2() {
        return speler2;
    }

    public void setSpeler2(Speler speler2) {
        this.speler2 = speler2;
    }

    public Speler getHuidigeSpeler() {
        return huidigeSpeler;
    }

    public void setHuidigeSpeler(Speler huidigeSpeler) {
        this.huidigeSpeler = huidigeSpeler;
    }




    public void schrijfHighscoreWeg(Highscores wegTeSchrijvenHigscoreGegevens) {
        File mijnHighscoreBestand = new File(".idea/Inventory/Highscores.csv");
        ArrayList<String> wegTeSchrijvenRegelsTekst = new ArrayList<String>();
        wegTeSchrijvenRegelsTekst.add(wegTeSchrijvenHigscoreGegevens.getSpelernaam() + ";" + wegTeSchrijvenHigscoreGegevens.getAantalbeurten());
        try {
            Files.write(mijnHighscoreBestand.toPath(), wegTeSchrijvenRegelsTekst, StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Highscores> leesHighscoresVanBestand(){
        //CSV bestand uitlezen
        List<Highscores> spelersinformatie = new ArrayList<Highscores>();
        File mijnHighscoreBestand = new File(".idea\\jqsdfhu\\Highscores.csv");
        try {
            List<String> mijnHighscoreLijnenAlsTekst = Files.readAllLines(mijnHighscoreBestand.toPath());
            for (String huidigeHighscoreLijn : mijnHighscoreLijnenAlsTekst) {
                String[] mijnHighscoreOnderdelen = huidigeHighscoreLijn.split(";");

                String spelernaam = mijnHighscoreOnderdelen[0];
                int score = Integer.parseInt(mijnHighscoreOnderdelen[1]);

                Highscores mijnUitgelezenHighscore = new Highscores(spelernaam, score);
                spelersinformatie.add(mijnUitgelezenHighscore);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spelersinformatie;
    }



}
