package be.kdg.wieishet.view.HighScores;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class HighScoresView extends VBox {

    private Label lblPlaats;
    private Label lblNaaminvoer;
    private Label lblAantalbeurtenInvoer;
    private Label lblSpelernaam;
    private Label lblAantalBeurten;
    private Button btnRead;
    private Button btnWrite;
    private Button btnAdd;
    private TextField txtSpelernaam;
    private TextField txtAantalBeurten;
    private GridPane mijnGridPane;

    private Image backgroundImage;
    private BackgroundSize backgroundSize;
    private BackgroundImage backgroundImg;
    private Background background;
    private Button btnBack;


    public HighScoresView() {
        this.initialiseNodes();
        this.layoutNodes();
    }


    private void initialiseNodes() {
        lblPlaats = new Label("Rank");

        lblNaaminvoer = new Label("Name:");
        lblAantalbeurtenInvoer = new Label("Number of guesses:");
        lblSpelernaam = new Label("Player name:");
        lblAantalBeurten = new Label("Score");
        btnRead = new Button("Read");
        btnWrite = new Button("Write");
        btnAdd = new Button("Add");
        txtSpelernaam = new TextField();
        txtAantalBeurten = new TextField();
        mijnGridPane = new GridPane();
        btnBack = new Button("Back");
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
    }

    private void layoutNodes() {


        lblNaaminvoer.setStyle("-fx-text-fill:white;-fx-font-size:14px;-fx-font-weight:bold;");
        txtSpelernaam.setStyle("-fx-text-fill:gray;-fx-font-size:14px;");
        lblAantalbeurtenInvoer.setStyle("-fx-text-fill:white;-fx-font-size:14px;-fx-font-weight:bold;");
        txtAantalBeurten.setStyle("-fx-text-fill:gray;-fx-font-size:14px;");

        this.getChildren().add(mijnGridPane);
        this.getChildren().add(btnBack);
        this.setAlignment(Pos.CENTER_RIGHT);
        this.getChildren().add(btnRead);
        this.getChildren().add(lblNaaminvoer);
        this.getChildren().add(txtSpelernaam);
        this.getChildren().add(lblAantalbeurtenInvoer);
        this.getChildren().add(txtAantalBeurten);
        this.getChildren().add(btnWrite);
        this.setPrefSize(800, 800);
    }

    public Label getLblPlaats() {
        return lblPlaats;
    }

    public Label getLblNaaminvoer() {
        return lblNaaminvoer;
    }

    public Label getLblAantalbeurtenInvoer() {
        return lblAantalbeurtenInvoer;
    }

    public Label getLblSpelernaam() {
        return lblSpelernaam;
    }

    public Label getLblAantalBeurten() {
        return lblAantalBeurten;
    }

    public Button getBtnRead() {
        return btnRead;
    }

    public Button getBtnWrite() {
        return btnWrite;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public TextField getTxtSpelernaam() {
        return txtSpelernaam;
    }

    public TextField getTxtAantalBeurten() {
        return txtAantalBeurten;
    }

    public GridPane getMijnGridPane() {
        return mijnGridPane;
    }



    public Button getBtnBack() {
        return btnBack;
    }
}
