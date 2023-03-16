package be.kdg.wieishet.view.SpelOpties;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class SpelOptiesView extends VBox {

    private CheckBox soundCheckBox;
    private CheckBox musicCheckBox;

    public SpelOptiesView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        // Initialise the nodes
        soundCheckBox = new CheckBox("Enable Sound");
        musicCheckBox = new CheckBox("Enable Music");

    }

    private void layoutNodes() {
        // Layout of the nodes
        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setPadding(new Insets(20));

        Label titleLabel = new Label("Spel Opties");
        this.getChildren().add(titleLabel);
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));

        this.getChildren().addAll(soundCheckBox, musicCheckBox);
    }

    public CheckBox getSoundCheckBox() {
        return soundCheckBox;
    }

    public CheckBox getMusicCheckBox() {
        return musicCheckBox;
    }
}
