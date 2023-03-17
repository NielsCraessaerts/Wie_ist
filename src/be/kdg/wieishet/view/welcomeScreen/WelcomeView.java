package be.kdg.wieishet.view.Welcomescreen;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;


public class WelcomeView extends VBox {
    private Label lblTitel;
    private Button btnNiewSpel;
    private Button btnSpelOpties;
    private Button btnHighscore;
    private Button btnExit;
    private VBox VBoxButtons;
    private ImageView imageView;




    public WelcomeView() {
        this.initialoseNodes();
        this.layoutNodes();
    }

    private void initialoseNodes() {
        this.lblTitel = new Label("Wie is't ?");
        this.btnNiewSpel = new Button("Nieuw Spel ");
        this.btnSpelOpties = new Button("Spel Opties ");
        this.btnHighscore = new Button("Highscores ");
        this.btnExit = new Button("Exit");
        this.VBoxButtons = new VBox();
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));
        this.imageView = new ImageView(new Image("/header_logo.png"));

    }

    private void layoutNodes(){
        lblTitel.setFont(new Font("Arial Bold",45));
        lblTitel.setStyle("-fx-text-fill:white;-fx-font-size:75px;-fx-font-weight:bold;");
        this.VBoxButtons.getChildren().addAll(btnNiewSpel,btnSpelOpties,btnHighscore,btnExit);
        for (Node node : VBoxButtons.getChildren()) {
            if (node instanceof Button) {
                Button button = (Button) node;
                button.setStyle("-fx-background-color: #ffcc33; " +
                        "-fx-background-radius: 5; " +
                        "-fx-text-fill: white; " +
                        "-fx-font-size: 25pt; " +
                        "-fx-font-family: Arial; " +
                        "-fx-font-weight: bold; " +
                        "-fx-effect: dropshadow(three-pass-box, #666666, 10, 0, 0, 0);");
            }
        }
        imageView.setFitWidth(200); // Set the width of the image
        imageView.setPreserveRatio(true);

        lblTitel.setAlignment(Pos.TOP_CENTER);
        VBoxButtons.setAlignment(Pos.CENTER_LEFT);


        this.getChildren().addAll(lblTitel, VBoxButtons);
        this.setAlignment(Pos.CENTER);
        this.setPrefSize(800, 800);



        ;


    }

    public Label getLblTitel() {
        return lblTitel;
    }

    public Button getBtnNiewSpel() {
        return btnNiewSpel;
    }

    public Button getBtnSpelOpties() {
        return btnSpelOpties;
    }

    public Button getBtnHighscore() {
        return btnHighscore;
    }

    public Button getBtnExit() {
        return btnExit;
    }

    public VBox getVBoxButtons() {
        return VBoxButtons;
    }

    public ImageView getImageView() {
        return imageView;
    }
}

