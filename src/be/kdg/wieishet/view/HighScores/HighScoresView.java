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
    private Button btnBack;
    private TextField txtSpelernaam;
    private TextField txtAantalBeurten;
    private GridPane mijnGridPane;

    private Image backgroundImage;
    private BackgroundSize backgroundSize;
    private BackgroundImage backgroundImg;
    private Background background;


    public HighScoresView(){
        this.initialiseNodes();
        this.layoutNodes();
    }


    private void initialiseNodes() {
        lblPlaats = new Label("Positie");

        lblNaaminvoer = new Label("Naam");
        lblAantalbeurtenInvoer = new Label("Aantal gespeelde beurten");
        lblSpelernaam = new Label("Spelernaam");
        lblAantalBeurten = new Label("Score");
        lblAantalBeurten = new Label("Aantal Beurten");
        btnRead = new Button("Lezen");
        btnWrite = new Button("Schrijven");
        btnWrite = new Button("Toevoegen");
        txtSpelernaam = new TextField();
        txtAantalBeurten = new TextField();
        mijnGridPane = new GridPane();
        btnBack = new Button("Cancel");
        this.backgroundImage = new Image("/achtergrond.png");
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
    }

    private void layoutNodes() {

        backgroundSize = new BackgroundSize(100,100,true,true, true, false);
        backgroundImg = new BackgroundImage(backgroundImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
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
        this.setPrefSize(800,800);
    }


    public Label getLblPlaats() {
        return lblPlaats;

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
    public Button getBtnBack() {
        return btnBack;
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
}