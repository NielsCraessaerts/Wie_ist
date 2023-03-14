package be.kdg.wieishet.view.Welcomescreen;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.text.Font;


public class WelcomeView extends HBox {
    private Label lblTitel;
    private Button btnNiewSpel;
    private Button btnSpelOpties;
    private Button btnHighscore;
    private Button btnExit;
    private HBox hBoxButtons;
    private Image backgroundImage;
    private BackgroundSize backgroundSize;
    private BackgroundImage backgroundImg;
    private Background background;
    private VBox vboxScherm;

    public WelcomeView() {
        this.initialoseNodes();
        this.layoutNodes();
    }

    private void initialoseNodes() {
        this.lblTitel = new Label();
        this.btnNiewSpel = new Button("Niew Spel ");
        this.btnSpelOpties = new Button("Spel Opties ");
        this.btnHighscore = new Button("Highscores ");
        this.btnExit = new Button("Exit");
        this.hBoxButtons = new HBox();
        this.backgroundImage = new Image("/Welcomescreen/achtergrond.png");
        this.background = new Background(backgroundImg);

    }

    private void layoutNodes(){
        lblTitel.setFont(new Font("Arial Bold",45));
        backgroundSize = new BackgroundSize(100,100,true,true, true, false);
        backgroundImg = new BackgroundImage(backgroundImage,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);


        this.hBoxButtons.getChildren().addAll(btnNiewSpel,btnNiewSpel,btnSpelOpties,btnExit);
        this.vboxScherm.getChildren().add(lblTitel);
        this.vboxScherm.getChildren().add(hBoxButtons);

        this.getChildren().add(vboxScherm);


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

    public HBox gethBoxButtons() {
        return hBoxButtons;
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public BackgroundSize getBackgroundSize() {
        return backgroundSize;
    }

    public BackgroundImage getBackgroundImg() {
        return backgroundImg;
    }



    public VBox getVboxScherm() {
        return vboxScherm;
    }
}

