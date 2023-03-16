package be.kdg.wieishet.view.HighScores;

import javafx.geometry.Insets;
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

    private TextField txtSpelernaam;
    private TextField txtAantalBeurten;
    private GridPane mijnGridPane;

    private Image backgroundImage;
    private BackgroundSize backgroundSize;
    private BackgroundImage backgroundImg;
    private Background background;
    private Button btnBack;
    private HBox buttonbox;
    private VBox inputBox;

    private BorderPane inputpane;


    public HighScoresView() {
        this.initialiseNodes();
        this.layoutNodes();
    }


    private void initialiseNodes() {
        lblPlaats = new Label("Rank");

        lblNaaminvoer = new Label("Naam:");
        lblAantalbeurtenInvoer = new Label("Aantal beurten:");
        lblSpelernaam = new Label("Player name:");
        lblAantalBeurten = new Label("Score");
        btnRead = new Button("Lees");
        btnWrite = new Button("Toevoegen");

        txtSpelernaam = new TextField();
        txtAantalBeurten = new TextField();
        mijnGridPane = new GridPane();
        btnBack = new Button("Terug");
        inputpane = new BorderPane();
        buttonbox = new HBox(20);
        inputBox = new VBox(10);
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
    }

    private void layoutNodes() {

        lblPlaats.setStyle("-fx-text-fill:black;-fx-font-size:14px;-fx-font-weight:bold;");
        lblPlaats.setUnderline(true);
        lblSpelernaam.setStyle("-fx-text-fill:black;-fx-font-size:14px;-fx-font-weight:bold;");
        lblSpelernaam.setUnderline(true);
        lblAantalBeurten.setStyle("-fx-text-fill:black;-fx-font-size:14px;-fx-font-weight:bold;");
        lblAantalBeurten.setUnderline(true);
        lblNaaminvoer.setStyle("-fx-text-fill:black;-fx-font-size:14px;-fx-font-weight:bold;");
        txtSpelernaam.setStyle("-fx-text-fill:gray;-fx-font-size:14px;");
        lblAantalbeurtenInvoer.setStyle("-fx-text-fill:black;-fx-font-size:14px;-fx-font-weight:bold;");
        txtAantalBeurten.setStyle("-fx-text-fill:gray;-fx-font-size:14px;");
        btnRead.setStyle("-fx-font-size:16px;-fx-font-weight:bold;");
        btnWrite.setStyle("-fx-font-size:16px;-fx-font-weight:bold;");
        btnBack.setStyle("-fx-font-size:16px;-fx-font-weight:bold;");


        buttonbox.getChildren().addAll(btnRead, btnWrite,  btnBack);
        buttonbox.setAlignment(Pos.CENTER);

       inputBox.getChildren().addAll(lblNaaminvoer, txtSpelernaam, lblAantalbeurtenInvoer, txtAantalBeurten);
        inputBox.setAlignment(Pos.CENTER);


        inputpane.setCenter(inputBox);
        inputpane.setBottom(buttonbox);
        inputpane.setMaxWidth(400);
        inputpane.setStyle("-fx-background-color: #f5f5f5; -fx-padding: 20px; -fx-border-radius: 10px; -fx-background-radius: 10px; -fx-border-color: red; -fx-border-width: 2px;");

        mijnGridPane.setStyle("-fx-background-color: #f5f5f5; -fx-padding: 20px; -fx-border-radius: 10px; -fx-background-radius: 10px; -fx-border-color: blue; -fx-border-width: 2px;");

        VBox.setMargin(inputpane, new Insets(20));
        VBox.setMargin(mijnGridPane, new Insets(20));
        VBox.setMargin(btnBack, new Insets(20));

        mijnGridPane.setHgap(75);
        mijnGridPane.setVgap(10);

        this.setAlignment(Pos.CENTER);
        this.getChildren().add(mijnGridPane);
        this.getChildren().add(inputpane);

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
