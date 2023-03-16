package be.kdg.wieishet.view.SpelOpties;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class SpelOptiesView extends VBox {

    private CheckBox soundCheckBox;
    private CheckBox musicCheckBox;
    private Button btnBack;
    private Label lblTitel;

    public SpelOptiesView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        // Initialise the nodes
        soundCheckBox = new CheckBox("Enable Sound");
        musicCheckBox = new CheckBox("Enable Music");
        btnBack = new Button("Back");
        lblTitel = new Label("Spel Opties");

    }

    private void layoutNodes() {
        // Layout of the nodes

        this.setAlignment(Pos.CENTER);
        this.setSpacing(10);
        this.setPadding(new Insets(20));
        btnBack.setStyle("-fx-background-color: #c23b22; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-family: Arial; -fx-padding: 10px; -fx-border-radius: 5px;");
        lblTitel.setStyle(" -fx-text-fill: white; -fx-font-size: 50px; -fx-font-family: Arial; -fx-padding: 10px; -fx-border-radius: 5px;-fx-font-weight: bold;");





        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        this.setPrefSize(400,400);
        this.getChildren().addAll(lblTitel,soundCheckBox, musicCheckBox,btnBack);
    }

    public CheckBox getSoundCheckBox() {
        return soundCheckBox;
    }

    public CheckBox getMusicCheckBox() {
        return musicCheckBox;
    }

    public Button getBtnBack() {
        return btnBack;
    }

    public Label getLblTitel() {
        return lblTitel;
    }
}
