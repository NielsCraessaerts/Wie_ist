package be.kdg.wieishet.Model;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
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
