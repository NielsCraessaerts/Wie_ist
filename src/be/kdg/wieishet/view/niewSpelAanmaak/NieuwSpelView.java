package be.kdg.wieishet.view.niewSpelAanmaak;

import be.kdg.wieishet.Model.*;
import be.kdg.wieishet.Model.Persoon.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.util.HashMap;




public class NieuwSpelView extends VBox {
    // Private node attributes (controls)
    private Label playerNameLabel;
    private Button startButton;
    private Button switchToPlayer2Button;
    private GridPane characterGrid;
    private TextField playerNameField;
    private Button btnBack;
    private int buttonid;
    private ToggleButton characterButton;
    private int selectedButtonID;
    private int b;
    private Button setNaam;
    private HBox BottomButtons;


    public NieuwSpelView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        BottomButtons = new HBox();
        // Initialisatie van de Nodes
        playerNameLabel = new Label("Enter player name:");
        playerNameField = new TextField();
        startButton = new Button("Start Game");
        switchToPlayer2Button = new Button(" wissel naar de volgende speler");
        btnBack = new Button("Terug naar het hoofdmenu");

        // Create a grid of selectable characters
        characterGrid = new GridPane();
        characterGrid.setPadding(new Insets(10, 10, 10, 10));
        characterGrid.setHgap(10);
        characterGrid.setVgap(10);
        setNaam = new Button("Bevestig");

        // Add some sample characters to the grid

        for (int i = 0; i < 24; i++) {

            buttonid = (i + 1);
            characterButton = new ToggleButton();
            characterButton.setId(Integer.toString(i));
            String filepath = "/characters/character" + buttonid + ".png";
            ImageView characterImageView = new ImageView(new Image(filepath));
            int selectedButtonIDForLambda = i;

            characterButton.setGraphic(characterImageView);
            characterGrid.add(characterButton, i % 6, i / 6);
        }
    }

    private void layoutNodes() {
        // Layout van de Nodes
        // add… methodes (of set…)
        // Insets, padding, alignment, …




//        characterGrid.setStyle("-fx-background-color: red;");
        characterGrid.setAlignment(Pos.CENTER);
        BottomButtons.getChildren().addAll(switchToPlayer2Button,setNaam,btnBack);
        this.getChildren().addAll(playerNameLabel, playerNameField, startButton, characterGrid,BottomButtons);
        this.setSpacing(10);
        this.setPadding(new Insets(10, 10, 10, 10));
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        this.setPrefSize(800,800);
        playerNameLabel.setStyle("-fx-font-family: Arial; -fx-font-size: 20px; -fx-text-fill: white;-fx-font-weight: bold");
        startButton.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;");
        switchToPlayer2Button.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white");
        btnBack.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white");
        setNaam.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white");
        switchToPlayer2Button.setAlignment(Pos.BOTTOM_RIGHT);
        characterGrid.setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
    }



    // Implementation of the necessary package-private getters

    public Button getSetNaam() {
        return setNaam;
    }

    public Button getStartButton() {
        return startButton;
    }
    public  void setSelectedButtonID(int buttonID) {
         buttonID = selectedButtonID;
    }

    public int getB() {
        return b;
    }

    public int getSelectedButtonID() {



        return selectedButtonID;
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

    public int getButtonid() {
        return selectedButtonID;
    }

    public ToggleButton getCharacterButton() {
        return characterButton;
    }


}
