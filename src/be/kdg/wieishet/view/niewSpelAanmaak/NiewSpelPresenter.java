package be.kdg.wieishet.view.niewSpelAanmaak;
import be.kdg.wieishet.Main;
import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.Welcomescreen.WelcomePresenter;
import be.kdg.wieishet.view.Welcomescreen.WelcomeView;
import be.kdg.wieishet.view.niewSpelAanmaak.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class NiewSpelPresenter {


    private WieishetModel model;
    private NieuwSpelView view;

    public NiewSpelPresenter(WieishetModel model, NieuwSpelView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        // Koppelt event handlers (anon. inner klassen)
        // aan de controls uit de view.
        // Event handlers: roepen methodes aan uit het
        // model en zorgen voor een update van de view.

        view.getBtnBack().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                WelcomeView Welcomeview = new WelcomeView();
                WelcomePresenter Welcomepresenter = new WelcomePresenter(model, Welcomeview);
                Scene Homescreen = new Scene(Welcomeview);
                Main.window.setScene(Homescreen);
                Main.window.setTitle("Hoofdmenu");
                Main.window.show();
            }
        });
        view.getStartButton().setOnAction(event -> {
            // Get the player name entered by the user
            String playerName = view.getPlayerName();
            // Do something with the player name
            // ...
        });

        view.getCharacterGrid().getChildren().forEach(node -> {
            if (node instanceof Button) {
                ((Button) node).setOnAction(event -> {
                    // Handle character selection
                    // ...
                });
            }
        });
    }

    private void updateView() {
        // Vult de view met data uit model
        // You can update the view here with data from the model
        // ...
    }

    public void addWindowEventHandlers() {
        // Window event handlers (anon. inner klassen)
        // Koppeling via view.getScene().getWindow()
        view.getScene().getWindow().setOnCloseRequest(event -> {
            // Handle window close event
            // ...
        });
    }
}