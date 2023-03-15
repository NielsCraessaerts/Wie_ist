package be.kdg.wieishet.Model;

public class Highscores implements Comparable<Highscores> {
    private String spelernaam;
    private int aantalbeurten;

    public String getSpelernaam() {
        return spelernaam;
    }

    public void setSpelernaam(String spelernaam) {
        this.spelernaam = spelernaam;
    }

    public int getAantalbeurten() {
        return aantalbeurten;
    }

    public void setAantalbeurten(int aantalbeurten) {
        this.aantalbeurten = aantalbeurten;
    }

    public Highscores(String spelernaam, int aantalbeurten) {
        this.spelernaam = spelernaam;
        this.aantalbeurten = aantalbeurten;
    }

    @Override
    public int compareTo(Highscores o){
        return Integer.compare(o.getAantalbeurten(),this.aantalbeurten);
    }
}
