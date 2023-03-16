package be.kdg.wieishet.view.SpelOpties;

import be.kdg.wieishet.Main;
import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.SpelOpties.SpelOptiesView;
import be.kdg.wieishet.view.welcomeScreen.WelcomePresenter;
import be.kdg.wieishet.view.welcomeScreen.WelcomeView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class SpelOptiesPresenter {
    private WieishetModel model;
    private SpelOptiesView view;

    public SpelOptiesPresenter(WieishetModel model, SpelOptiesView view) {
        this.model = model;
        this.view = view;

        this.addEventHandlers();
        this.updateView();
    }

    private void addEventHandlers() {
        // Add event handlers for controls in the view
        view.getBtnBack().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                updateView();
            }
        });

        view.getSoundCheckBox().selectedProperty().addListener((observable, oldValue, newValue) -> {
            // Code to enable/disable sound based on the checkbox value
        });

        view.getMusicCheckBox().selectedProperty().addListener((observable, oldValue, newValue) -> {
            // Code to enable/disable music based on the checkbox value
        });
    }

    private void updateView() {
        // Update the view with data from the model
        view.getSoundCheckBox().setSelected(model.isSoundEnabled());
        view.getMusicCheckBox().setSelected(model.isMusicEnabled());

        WieishetModel model = new WieishetModel();
        WelcomeView view = new WelcomeView();
        WelcomePresenter presenter = new WelcomePresenter(model, view);
        Main.window.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        Main.window.show();
    }

    public void addWindowEventHandlers() {
        // Add window event handlers for the view
        view.getScene().getWindow().setOnCloseRequest(event -> {
            // Code to handle the window close event
        });
    }
}
