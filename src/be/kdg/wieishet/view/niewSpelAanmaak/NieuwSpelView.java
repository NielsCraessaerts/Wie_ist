package be.kdg.wieishet.view.niewSpelAanmaak;

import be.kdg.wieishet.Model.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class NieuwSpelView extends VBox {
    // Private node attributes (controls)
    private Label playerNameLabel;
    private Button startButton;
    private Button switchToPlayer2Button;
    private GridPane characterGrid;
    private TextField playerNameField;
    private Button btnBack;

    public NieuwSpelView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        // Initialisatie van de Nodes
        playerNameLabel = new Label("Enter player name:");
        playerNameField = new TextField();
        startButton = new Button("Start Game");
        switchToPlayer2Button = new Button("Switch to Player 2");
        btnBack = new Button("Terug naar het hoofdmenu");

        // Create a grid of selectable characters
        characterGrid = new GridPane();
        characterGrid.setPadding(new Insets(10, 10, 10, 10));
        characterGrid.setHgap(10);
        characterGrid.setVgap(10);

        // Add some sample characters to the grid
        for (int i = 0; i < 24; i++) {
            int p = (i + 1);
            Button characterButton = new Button();
            ImageView characterImageView = new ImageView(new Image("/characters/character" + p + ".png"));
            characterButton.setGraphic(characterImageView);
            characterGrid.add(characterButton, i % 6, i / 6);
        }
    }

    private void layoutNodes() {
        // Layout van de Nodes
        // add… methodes (of set…)
        // Insets, padding, alignment, …
        characterGrid.setStyle("-fx-background-color: red;");
        characterGrid.setAlignment(Pos.CENTER);
        this.getChildren().addAll(playerNameLabel, playerNameField, startButton, characterGrid,switchToPlayer2Button,btnBack);
        this.setSpacing(10);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        this.setPrefSize(450,500);
        playerNameLabel.setStyle("-fx-font-family: Arial; -fx-font-size: 20px; -fx-text-fill: white;-fx-font-weight: bold");
        startButton.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;");
        switchToPlayer2Button.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;");
        btnBack.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;");
        switchToPlayer2Button.setAlignment(Pos.BOTTOM_RIGHT);

    }

    // Implementation of the necessary package-private getters
    public Button getStartButton() {
        return startButton;
    }

    public String getPlayerName() {
        return playerNameField.getText();
    }


    public GridPane getCharacterGrid() {
        return characterGrid;
    }

    public Label getPlayerNameLabel() {
        return playerNameLabel;
    }

    public Button getSwitchToPlayer2Button() {
        return switchToPlayer2Button;
    }

    public TextField getPlayerNameField() {
        return playerNameField;
    }

    public Button getBtnBack() {
        return btnBack;
    }
}
