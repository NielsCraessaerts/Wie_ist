package be.kdg.wieishet.Model;

import be.kdg.wieishet.Model.Enums.Spelerskleur;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class WieishetModel {
    private Speler speler1;
    private Speler speler2;
    private Speler huidigeSpeler;
    private Persoon[] characters;
    private boolean soundEnabled;
    private boolean musicEnabled;



    public WieishetModel(Speler speler1, Speler speler2, Speler huidigeSpeler) {
        this.speler1 = speler1;
        this.speler2 = speler2;
        this.huidigeSpeler = huidigeSpeler;
        characters = new Persoon[24];

    }

    public WieishetModel() {
        soundEnabled = true;
        musicEnabled = true;
        try{
        characters = new Persoon[24];
        String Filepath = "C:\\1.KDG ACTIVITEITEN\\PROGRAMMEREN\\Ik begin dees muug te worde\\getfucked2\\.idea\\Inventory\\txtfiles\\KarakterAanmaak.txt";
        BufferedReader ConfigReader = new BufferedReader(new FileReader(Filepath));
        String Line = ConfigReader.readLine();
         int counter = 0;

            while (Line != null) {

                Persoon p   = new Persoon(Line);
                characters[counter] = p;
                counter++;
                Line = ConfigReader.readLine();

            }

        }
        catch(IOException e){System.out.println(e.getMessage());}

        speler1 = new Speler();
        speler2 = new Speler();

    }
       public Persoon getCharacter(String naam){
        for (int i = 0; i < characters.length;i++){
            if(characters[i].Naam == naam){
                return characters[i];
            }
        }
        return null;
    }
    public Persoon getCharacter(int id){
            System.out.println("In getKarakter +" +id);
            System.out.println(characters.length);
                return characters[id];



    }

    public Speler getSpeler1() {
        return speler1;
    }

    public void setSpeler1(String spelersnaam, Persoon teRadenPersoon, Spelbord spelbord, int aantalBeurten, Spelerskleur spelerskleur) {
        if (speler1 == null) {
            speler1 = new Speler(spelersnaam,teRadenPersoon, spelbord, aantalBeurten,spelerskleur);
        }
        speler1.setSpelersnaam(spelersnaam);
        speler1.setTeRadenPersoon(teRadenPersoon);
        speler1.setSpelbord(spelbord);
        speler1.setAantalBeurten(aantalBeurten);
        speler1.setSpelerskleur(spelerskleur);
    }
    public void  setSpeler1(Speler Aspeler) {
        speler1 = Aspeler;
    }

    public void setSpeler2(String spelersnaam, Persoon teRadenPersoon, Spelbord spelbord, int aantalBeurten, Spelerskleur spelerskleur) {
        if (speler2 == null) {
            speler2 = new Speler(spelersnaam,teRadenPersoon, spelbord, aantalBeurten,spelerskleur);
        }
        speler2.setSpelersnaam(spelersnaam);
        speler2.setTeRadenPersoon(teRadenPersoon);
        speler2.setSpelbord(spelbord);
        speler2.setAantalBeurten(aantalBeurten);
        speler2.setSpelerskleur(spelerskleur);
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

    public Persoon[] getCharacters() {
        return characters;
    }

    public void addHighscore(Highscores toAddHighscores) {
        File Highscores = new File(".idea\\Inventory\\Highscores.csv");
        String newHighscore = toAddHighscores.getSpelernaam() + ";" + toAddHighscores.getAantalbeurten();

        try {
            if (!Highscores.exists()) {
                Highscores.createNewFile();
            }

            FileWriter writer = new FileWriter(Highscores, true);
            writer.write(newHighscore + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Highscores> readHighscore(){
        //CSV bestand uitlezen
        List<Highscores> spelersinformatie = new ArrayList<Highscores>();
        File Highscores = new File(".idea\\Inventory\\Highscores.csv");
        try {
            List<String> CurrentHighscores = Files.readAllLines(Highscores.toPath());
            for (String huidigeHighscoreLijn : CurrentHighscores) {
                String[] mijnHighscoreOnderdelen = huidigeHighscoreLijn.split(";");

                String spelernaam = mijnHighscoreOnderdelen[0];
                int score = 0;
                if (mijnHighscoreOnderdelen[1].matches("\\d+")) {
                    score = Integer.parseInt(mijnHighscoreOnderdelen[1]);
                }else {
                    System.out.println("tis kapoet");
                }

                Highscores mijnUitgelezenHighscore = new Highscores(spelernaam, score);
                spelersinformatie.add(mijnUitgelezenHighscore);

//                String foef = mijnHighscoreOnderdelen[0];
//                String scoreStr = mijnHighscoreOnderdelen[1];
//                System.out.println(foef + scoreStr);
//                System.out.println(Highscores.getAbsolutePath());
//                int foef2 = Integer.parseInt(scoreStr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spelersinformatie;
    }



    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    public boolean isMusicEnabled() {
        return musicEnabled;
    }

    public void setMusicEnabled(boolean musicEnabled) {
        this.musicEnabled = musicEnabled;
    }



}
