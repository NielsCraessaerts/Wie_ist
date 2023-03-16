package be.kdg.wieishet.view.highScores;

import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.HighScores.HighScoresView;
import be.kdg.wieishet.Model.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

import java.util.List;
import java.util.TreeSet;

public class HighScoresPresenter {
    private WieishetModel model;
    private HighScoresView view; //Pas het type van de view aan naar de view die samenhangt met deze presenter

    public HighScoresPresenter(WieishetModel model, HighScoresView view) { //Pas het type van de view aan naar de view die samenhangt met deze presenter
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();

    }

    private void addEventHandlers() {
        //Voeg hier uw event handlers toe
        //Binnen een eventhandler ga je normaal slechts 2 zaken doen:
        //1. Nieuwe visualisaties openen (nieuwe schermen openen) of zaken die niet moeten worden onthouden (in het model) rechtstreeks aanpassen (bijvoorbeeld in het geval dat je een tekstfield rood wilt maken omdat er een niet-valide emailadres in werd geschreven
        //2. Data in het model aanpassen. Je krijgt toegang tot het model via het model-attribuut
        //Als je het model hebt geupdate en hetzelfde scherm blijft zichtbaar op het scherm, dan zou je normaal de hieronderstaande updateView methode aanroepen
        view.getBtnRead().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                //Pane aanmaken en nodes daaraan toevoegen
                //Het type van pane bepaalt waar de node op het scherm geplaatst wordt
                //mijnGridPane = new GridPane();
                updateView();
            }
        });

        view.getBtnWrite().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Highscores nieuweHighscore = new Highscores(view.getTxtSpelernaam().getText(), Integer.parseInt(view.getTxtAantalBeurten().getText()));
                model.addHighscore(nieuweHighscore);
                updateView();
            }
        });
    }

    private void updateView() {
        //Deze methode wist alle informatie die op de view zichtbaar is (maakt bijvoorbeeld textfields leeg) en herschrijft de informatie uit het model opnieuw op het scherm.
        view.getMijnGridPane().getChildren().clear();
        view.getMijnGridPane().add(view.getLblPlaats(), 0, 0);
        view.getMijnGridPane().add(view.getLblSpelernaam(), 1, 0);
        view.getMijnGridPane().add(view.getLblAantalBeurten(), 2, 0);

        view.getMijnGridPane().setGridLinesVisible(true);

        List<Highscores> spelersinformatie = model.readHighscore();
        TreeSet<Highscores> gesorteerdeHigscores = new TreeSet<>();
        gesorteerdeHigscores.addAll(spelersinformatie);
        int positie = 1;
        for (Highscores huidigeHighscore : gesorteerdeHigscores) {
            Label lblPositieContent = new Label(Integer.toString(positie));
            //lblPositieContent.setPadding(new Insets(20,20,20,20));
            view.getMijnGridPane().add(lblPositieContent, 0, positie);
            view.getMijnGridPane().add(new Label(huidigeHighscore.getSpelernaam()), 1, positie);
            view.getMijnGridPane().add(new Label(Integer.toString(huidigeHighscore.getAantalbeurten())), 2, positie);
            positie++;
        }
    }

    public void addWindowEventHandlers() {

    }
}
