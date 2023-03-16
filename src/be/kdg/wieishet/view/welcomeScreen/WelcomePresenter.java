package be.kdg.wieishet.view.welcomeScreen;
import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.HighScores.*;
import be.kdg.wieishet.view.HighScores.*;
import be.kdg.wieishet.view.welcomeScreen.*;
import be.kdg.wieishet.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;



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
        view.getBtnHighscore().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                updateView();

            }
        });
    }
    private void updateView() {
        HighScoresView HighScoresView = new HighScoresView();
        HighScoresPresenter HighScoresPresenter = new HighScoresPresenter(model,HighScoresView);
        Scene Highscores = new Scene(HighScoresView);
        Main.window.setScene(Highscores);
        Main.window.setTitle("Highscores");
        Main.window.show();


// Vult de view met data uit model
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }
}
