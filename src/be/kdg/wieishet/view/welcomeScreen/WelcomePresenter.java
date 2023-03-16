package be.kdg.wieishet.view.Welcomescreen;
import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.HighScores.*;
import be.kdg.wieishet.view.HighScores.*;
import be.kdg.wieishet.view.SpelOpties.SpelOptiesPresenter;
import be.kdg.wieishet.view.SpelOpties.SpelOptiesView;

import be.kdg.wieishet.Main;
import be.kdg.wieishet.view.niewSpelAanmaak.NieuwSpelView;
import be.kdg.wieishet.view.niewSpelAanmaak.NiewSpelPresenter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


import java.util.Optional;




public class WelcomePresenter {
    private WieishetModel model;
    private WelcomeView view;
    public WelcomePresenter(WieishetModel model,WelcomeView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }
    private void addEventHandlers() {

        view.getBtnNiewSpel().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                NieuwSpelView NieuwSpelView = new NieuwSpelView();
                NiewSpelPresenter NieuwspelPresenter = new NiewSpelPresenter(model,NieuwSpelView);
                Scene Highscores = new Scene(NieuwSpelView);
                Main.window.setScene(Highscores);
                Main.window.setTitle("Highscores");
                Main.window.show();
            }
        });
        view.getBtnHighscore().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                HighScoresView HighScoresView = new HighScoresView();
                HighScoresPresenter HighScoresPresenter = new HighScoresPresenter(model,HighScoresView);
                Scene Highscores = new Scene(HighScoresView);
                Main.window.setScene(Highscores);
                Main.window.setTitle("Highscores");
                Main.window.show();
            }
        });
        view.getBtnSpelOpties().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                SpelOptiesView SpelOptiesView = new SpelOptiesView();
                SpelOptiesPresenter SpelOptiesPresenter = new SpelOptiesPresenter(model,SpelOptiesView);
                Scene SpelOpties = new Scene(SpelOptiesView);
                Main.window.setScene(SpelOpties);
                Main.window.setTitle("Spel Opties");
                Main.window.show();
            }
        });

        view.getBtnExit().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Spel stoppen");
                alert.setHeaderText("Bent u zeker dat u het spel wilt beëindigen ?");

                Optional<ButtonType> result = alert.showAndWait();
                if (result.isPresent()&& result.get() == ButtonType.OK){
                    System.exit(0);
                }

            }
        });
    }
    private void updateView() {







// Vult de view met data uit model
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }
}
