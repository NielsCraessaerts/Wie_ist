package be.kdg.wieishet.view.SpelOpties;

import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.SpelOpties.SpelOptiesView;

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
    }

    public void addWindowEventHandlers() {
        // Add window event handlers for the view
        view.getScene().getWindow().setOnCloseRequest(event -> {
            // Code to handle the window close event
        });
    }
}
