package be.kdg.wieishet.view.HighScores;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class HighScoresView extends VBox {

    private Label lblPlaats;
    private Label lblSpelernaam;
    private Label lblAantalBeurten;
    private Button btnRead;
    private Button btnWrite;
    private Button btnBack;
    private TextField txtSpelernaam;
    private TextField txtAantalBeurten;
    private GridPane mijnGridPane;

    public HighScoresView(){
        this.initialiseNodes();
        this.layoutNodes();
    }


    private void initialiseNodes() {
        lblPlaats = new Label("Positie");
        lblSpelernaam = new Label("Spelernaam");
        lblAantalBeurten = new Label("Score");
        btnRead = new Button("Lezen");
        btnWrite = new Button("Schrijven");
        txtSpelernaam = new TextField();
        txtAantalBeurten = new TextField();
        mijnGridPane = new GridPane();
        btnBack = new Button("Cancel");
    }

    private void layoutNodes() {
        this.getChildren().add(mijnGridPane);
        this.getChildren().add(btnBack);
        this.setAlignment(Pos.CENTER_RIGHT);
        this.getChildren().add(btnRead);
        this.getChildren().add(txtSpelernaam);
        this.getChildren().add(txtAantalBeurten);
        this.getChildren().add(btnWrite);
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
