import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;


import javax.swing.*;
import java.awt.*;

import static javafx.scene.input.KeyCode.V;

public class Main extends Application{

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage mijnStage) {
        //1 of meerdere Nodes aanmaken aanmaken
        VBox root = new VBox();
        HBox hBox = new HBox();
        GridPane mijnGridPane = new GridPane();
        Label vraag = new Label("Heeft uw persoon :");
        vraag.setStyle("-fx-font-family: Open sans-serif; -fx-font-size: 25;-fx-font-weight:bold; -fx-text-fill: white");

        //<editor-fold desc="achtergrond">
        Image achtergrondje = new Image("/achtergrond.png");
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImg = new BackgroundImage(achtergrondje,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImg);
        root.setBackground(background);
        //</editor-fold>

        //<editor-fold desc="Aanmaak foto's">
        Image character1 = new Image("/characters/character1.png");
        Image character2 = new Image("/characters/character2.png");
        Image character3 = new Image("/characters/character3.png");
        Image character4 = new Image("/characters/character4.png");
        Image character5 = new Image("/characters/character5.png");
        Image character6 = new Image("/characters/character6.png");
        Image character7 = new Image("/characters/character7.png");
        Image character8 = new Image("/characters/character8.png");
        Image character9 = new Image("/characters/character9.png");
        Image character10 = new Image("/characters/character10.png");
        Image character11 = new Image("/characters/character11.png");
        Image character12 = new Image("/characters/character12.png");
        Image character13 = new Image("/characters/character13.png");
        Image character14 = new Image("/characters/character14.png");
        Image character15 = new Image("/characters/character15.png");
        Image character16 = new Image("/characters/character16.png");
        Image character17 = new Image("/characters/character17.png");
        Image character18 = new Image("/characters/character18.png");
        Image character19 = new Image("/characters/character19.png");
        Image character20 = new Image("/characters/character20.png");
        Image character21 = new Image("/characters/character21.png");
        Image character22 = new Image("/characters/character22.png");
        Image character23 = new Image("/characters/character23.png");
        Image character24 = new Image("/characters/character24.png");
        //</editor-fold>

        //<editor-fold desc="Aanmaak Elim foto's">
        Image character1elim = new Image("/Elim-character/characterelim1.png");
        Image character2elim = new Image("/Elim-character/characterelim2.png");
        Image character3elim = new Image("/Elim-character/characterelim3.png");
        Image character4elim = new Image("/Elim-character/characterelim4.png");
        Image character5elim = new Image("/Elim-character/characterelim5.png");
        Image character6elim = new Image("/Elim-character/characterelim6.png");
        Image character7elim = new Image("/Elim-character/characterelim7.png");
        Image character8elim = new Image("/Elim-character/characterelim8.png");
        Image character9elim = new Image("/Elim-character/characterelim9.png");
        Image character10elim = new Image("/Elim-character/characterelim10.png");
        Image character11elim = new Image("/Elim-character/characterelim11.png");
        Image character12elim = new Image("/Elim-character/characterelim12.png");
        Image character13elim = new Image("/Elim-character/characterelim13.png");
        Image character14elim = new Image("/Elim-character/characterelim14.png");
        Image character15elim = new Image("/Elim-character/characterelim15.png");
        Image character16elim = new Image("/Elim-character/characterelim16.png");
        Image character17elim = new Image("/Elim-character/characterelim17.png");
        Image character18elim = new Image("/Elim-character/characterelim18.png");
        Image character19elim = new Image("/Elim-character/characterelim19.png");
        Image character20elim = new Image("/Elim-character/characterelim20.png");
        Image character21elim = new Image("/Elim-character/characterelim21.png");
        Image character22elim = new Image("/Elim-character/characterelim22.png");
        Image character23elim = new Image("/Elim-character/characterelim23.png");
        Image character24elim = new Image("/Elim-character/characterelim24.png");
        //</editor-fold>

        //<editor-fold desc="Aanmaak Imageview">
        ImageView Bordpersoon1 = new ImageView(character1);
        ImageView Bordpersoon2 = new ImageView(character2);
        ImageView Bordpersoon3 = new ImageView(character3);
        ImageView Bordpersoon4 = new ImageView(character4);
        ImageView Bordpersoon5 = new ImageView(character5);
        ImageView Bordpersoon6 = new ImageView(character6);
        ImageView Bordpersoon7 = new ImageView(character7);
        ImageView Bordpersoon8 = new ImageView(character8);
        ImageView Bordpersoon9 = new ImageView(character9);
        ImageView Bordpersoon10 = new ImageView(character10);
        ImageView Bordpersoon11 = new ImageView(character11);
        ImageView Bordpersoon12 = new ImageView(character12);
        ImageView Bordpersoon13 = new ImageView(character13);
        ImageView Bordpersoon14 = new ImageView(character14);
        ImageView Bordpersoon15 = new ImageView(character15);
        ImageView Bordpersoon16 = new ImageView(character16);
        ImageView Bordpersoon17 = new ImageView(character17);
        ImageView Bordpersoon18 = new ImageView(character18);
        ImageView Bordpersoon19 = new ImageView(character19);
        ImageView Bordpersoon20 = new ImageView(character20);
        ImageView Bordpersoon21 = new ImageView(character21);
        ImageView Bordpersoon22 = new ImageView(character22);
        ImageView Bordpersoon23 = new ImageView(character23);
        ImageView Bordpersoon24 = new ImageView(character24);
        //</editor-fold>

        //<editor-fold desc="Aanmaak Imageview elim">
        ImageView elim1 = new ImageView(character1elim);
        ImageView elim2 = new ImageView(character2elim);
        ImageView elim3 = new ImageView(character3elim);
        ImageView elim4 = new ImageView(character4elim);
        ImageView elim5 = new ImageView(character5elim);
        ImageView elim6 = new ImageView(character6elim);
        ImageView elim7 = new ImageView(character7elim);
        ImageView elim8 = new ImageView(character8elim);
        ImageView elim9 = new ImageView(character9elim);
        ImageView elim10 = new ImageView(character10elim);
        ImageView elim11 = new ImageView(character11elim);
        ImageView elim12 = new ImageView(character12elim);
        ImageView elim13 = new ImageView(character13elim);
        ImageView elim14 = new ImageView(character14elim);
        ImageView elim15 = new ImageView(character15elim);
        ImageView elim16 = new ImageView(character16elim);
        ImageView elim17 = new ImageView(character17elim);
        ImageView elim18 = new ImageView(character18elim);
        ImageView elim19 = new ImageView(character19elim);
        ImageView elim20 = new ImageView(character20elim);
        ImageView elim21 = new ImageView(character21elim);
        ImageView elim22 = new ImageView(character22elim);
        ImageView elim23 = new ImageView(character23elim);
        ImageView elim24 = new ImageView(character24elim);
        //</editor-fold>

        //<editor-fold desc="Button aanmaak + elim functie">
        ToggleButton menneke1 = new ToggleButton();
        menneke1.setGraphic(Bordpersoon1);
        menneke1.setSelected(false);
        menneke1.setOnAction((ActionEvent e) -> {
            if (menneke1.isSelected()) {
                menneke1.setGraphic(elim1);
            } else {
                menneke1.setGraphic(Bordpersoon1);
            }
        });

        ToggleButton menneke2 = new ToggleButton();
        menneke2.setGraphic(Bordpersoon2);
        menneke2.setSelected(false);
        menneke2.setOnAction((ActionEvent e) -> {
            if (menneke2.isSelected()) {
                menneke2.setGraphic(elim2);
            } else {
                menneke2.setGraphic(Bordpersoon2);
            }
        });

        ToggleButton menneke3 = new ToggleButton();
        menneke3.setGraphic(Bordpersoon3);
        menneke3.setSelected(false);
        menneke3.setOnAction((ActionEvent e) -> {
            if (menneke3.isSelected()) {
                menneke3.setGraphic(elim3);
            } else {
                menneke3.setGraphic(Bordpersoon3);
            }
        });

        ToggleButton menneke4 = new ToggleButton();
        menneke4.setGraphic(Bordpersoon4);
        menneke4.setSelected(false);
        menneke4.setOnAction((ActionEvent e) -> {
            if (menneke4.isSelected()) {
                menneke4.setGraphic(elim4);
            } else {
                menneke4.setGraphic(Bordpersoon4);
            }
        });

        ToggleButton menneke5 = new ToggleButton();
        menneke5.setGraphic(Bordpersoon5);
        menneke5.setSelected(false);
        menneke5.setOnAction((ActionEvent e) -> {
            if (menneke5.isSelected()) {
                menneke5.setGraphic(elim5);
            } else {
                menneke5.setGraphic(Bordpersoon5);
            }
        });

        ToggleButton menneke6 = new ToggleButton();
        menneke6.setGraphic(Bordpersoon6);
        menneke6.setSelected(false);
        menneke6.setOnAction((ActionEvent e) -> {
            if (menneke6.isSelected()) {
                menneke6.setGraphic(elim6);
            } else {
                menneke6.setGraphic(Bordpersoon6);
            }
        });

        ToggleButton menneke7 = new ToggleButton();
        menneke7.setGraphic(Bordpersoon7);
        menneke7.setSelected(false);
        menneke7.setOnAction((ActionEvent e) -> {
            if (menneke7.isSelected()) {
                menneke7.setGraphic(elim7);
            } else {
                menneke7.setGraphic(Bordpersoon7);
            }
        });

        ToggleButton menneke8 = new ToggleButton();
        menneke8.setGraphic(Bordpersoon8);
        menneke8.setSelected(false);
        menneke8.setOnAction((ActionEvent e) -> {
            if (menneke8.isSelected()) {
                menneke8.setGraphic(elim8);
            } else {
                menneke8.setGraphic(Bordpersoon8);
            }
        });

        ToggleButton menneke9 = new ToggleButton();
        menneke9.setGraphic(Bordpersoon9);
        menneke9.setSelected(false);
        menneke9.setOnAction((ActionEvent e) -> {
            if (menneke9.isSelected()) {
                menneke9.setGraphic(elim9);
            } else {
                menneke9.setGraphic(Bordpersoon9);
            }
        });

        ToggleButton menneke10 = new ToggleButton();
        menneke10.setGraphic(Bordpersoon10);
        menneke10.setSelected(false);
        menneke10.setOnAction((ActionEvent e) -> {
            if (menneke10.isSelected()) {
                menneke10.setGraphic(elim10);
            } else {
                menneke10.setGraphic(Bordpersoon10);
            }
        });

        ToggleButton menneke11 = new ToggleButton();
        menneke11.setGraphic(Bordpersoon11);
        menneke11.setSelected(false);
        menneke11.setOnAction((ActionEvent e) -> {
            if (menneke11.isSelected()) {
                menneke11.setGraphic(elim11);
            } else {
                menneke11.setGraphic(Bordpersoon11);
            }
        });

        ToggleButton menneke12 = new ToggleButton();
        menneke12.setGraphic(Bordpersoon12);
        menneke12.setSelected(false);
        menneke12.setOnAction((ActionEvent e) -> {
            if (menneke12.isSelected()) {
                menneke12.setGraphic(elim12);
            } else {
                menneke12.setGraphic(Bordpersoon12);
            }
        });

        ToggleButton menneke13 = new ToggleButton();
        menneke13.setGraphic(Bordpersoon13);
        menneke13.setSelected(false);
        menneke13.setOnAction((ActionEvent e) -> {
            if (menneke13.isSelected()) {
                menneke13.setGraphic(elim13);
            } else {
                menneke13.setGraphic(Bordpersoon13);
            }
        });




        ToggleButton menneke14 = new ToggleButton();
        menneke14.setGraphic(Bordpersoon14);
        menneke14.setSelected(false);
        menneke14.setOnAction((ActionEvent e) -> {
            if (menneke14.isSelected()) {
                menneke14.setGraphic(elim14);
            } else {
                menneke14.setGraphic(Bordpersoon14);
            }
        });

        ToggleButton menneke15 = new ToggleButton();
        menneke15.setGraphic(Bordpersoon15);
        menneke15.setSelected(false);
        menneke15.setOnAction((ActionEvent e) -> {
            if (menneke15.isSelected()) {
                menneke15.setGraphic(elim15);
            } else {
                menneke15.setGraphic(Bordpersoon15);
            }
        });

        ToggleButton menneke16 = new ToggleButton();
        menneke16.setGraphic(Bordpersoon16);
        menneke16.setSelected(false);
        menneke16.setOnAction((ActionEvent e) -> {
            if (menneke16.isSelected()) {
                menneke16.setGraphic(elim16);
            } else {
                menneke16.setGraphic(Bordpersoon16);
            }
        });

        ToggleButton menneke17 = new ToggleButton();
        menneke17.setGraphic(Bordpersoon17);
        menneke17.setSelected(false);
        menneke17.setOnAction((ActionEvent e) -> {
            if (menneke17.isSelected()) {
                menneke17.setGraphic(elim17);
            } else {
                menneke17.setGraphic(Bordpersoon17);
            }
        });

        ToggleButton menneke18 = new ToggleButton();
        menneke18.setGraphic(Bordpersoon18);
        menneke18.setSelected(false);
        menneke18.setOnAction((ActionEvent e) -> {
            if (menneke18.isSelected()) {
                menneke18.setGraphic(elim18);
            } else {
                menneke18.setGraphic(Bordpersoon18);
            }
        });

        ToggleButton menneke19 = new ToggleButton();
        menneke19.setGraphic(Bordpersoon19);
        menneke19.setSelected(false);
        menneke19.setOnAction((ActionEvent e) -> {
            if (menneke19.isSelected()) {
                menneke19.setGraphic(elim19);
            } else {
            menneke19.setGraphic(Bordpersoon19);}
                });


        ToggleButton menneke20 = new ToggleButton();
        menneke20.setGraphic(Bordpersoon20);
        menneke20.setSelected(false);
        menneke20.setOnAction((ActionEvent e) -> {
            if (menneke20.isSelected()) {
                menneke20.setGraphic(elim20);
            } else {
                menneke20.setGraphic(Bordpersoon20);
            }
        });

        ToggleButton menneke21 = new ToggleButton();
        menneke21.setGraphic(Bordpersoon21);
        menneke21.setSelected(false);
        menneke21.setOnAction((ActionEvent e) -> {
            if (menneke21.isSelected()) {
                menneke21.setGraphic(elim21);
            } else {
                menneke21.setGraphic(Bordpersoon21);
            }
        });

        ToggleButton menneke22 = new ToggleButton();
        menneke22.setGraphic(Bordpersoon22);
        menneke22.setSelected(false);
        menneke22.setOnAction((ActionEvent e) -> {
            if (menneke22.isSelected()) {
                menneke22.setGraphic(elim22);
            } else {
                menneke22.setGraphic(Bordpersoon22);
            }
        });

        ToggleButton menneke23 = new ToggleButton();
        menneke23.setGraphic(Bordpersoon23);
        menneke23.setSelected(false);
        menneke23.setOnAction((ActionEvent e) -> {
            if (menneke23.isSelected()) {
                menneke23.setGraphic(elim23);
            } else {
                menneke23.setGraphic(Bordpersoon23);
            }
        });

        ToggleButton menneke24 = new ToggleButton();
        menneke24.setGraphic(Bordpersoon24);
        menneke24.setSelected(false);
        menneke24.setOnAction((ActionEvent e) -> {
            if (menneke24.isSelected()) {
                menneke24.setGraphic(elim24);
            } else {
                menneke24.setGraphic(Bordpersoon24);
            }
        });

        //</editor-fold>

        //<editor-fold desc="gridpane locaties">
        mijnGridPane.setHgap(10); // set horizontal gap between columns
        mijnGridPane.setVgap(10); // set vertical gap between rows
        mijnGridPane.setPadding(new Insets(10)); // set padding around the grid

        mijnGridPane.add(menneke1, 0, 0);
        mijnGridPane.add(menneke2, 1, 0);
        mijnGridPane.add(menneke3, 2, 0);
        mijnGridPane.add(menneke4, 3, 0);
        mijnGridPane.add(menneke5, 4, 0);
        mijnGridPane.add(menneke6, 5, 0);

        mijnGridPane.add(menneke7, 0, 1);
        mijnGridPane.add(menneke8, 1, 1);
        mijnGridPane.add(menneke9, 2, 1);
        mijnGridPane.add(menneke10, 3, 1);
        mijnGridPane.add(menneke11, 4, 1);
        mijnGridPane.add(menneke12, 5, 1);

        mijnGridPane.add(menneke13, 0, 2);
        mijnGridPane.add(menneke14, 1, 2);
        mijnGridPane.add(menneke15, 2, 2);
        mijnGridPane.add(menneke16, 3, 2);
        mijnGridPane.add(menneke17, 4, 2);
        mijnGridPane.add(menneke18, 5, 2);

        mijnGridPane.add(menneke19, 0, 3);
        mijnGridPane.add(menneke20, 1, 3);
        mijnGridPane.add(menneke21, 2, 3);
        mijnGridPane.add(menneke22, 3, 3);
        mijnGridPane.add(menneke23, 4, 3);
        mijnGridPane.add(menneke24, 5, 3);
        //</editor-fold>

        //<editor-fold desc="buttoncontainer haarkleur">
        VBox buttonContainerHaarkleur = new VBox(); // create a VBox to hold the buttons
        buttonContainerHaarkleur.setAlignment(Pos.CENTER);
        Button kleur1 = new Button("Ros");
        kleur1.setPrefWidth(100);
        Button kleur2 = new Button("Blond");
        kleur2.setPrefWidth(100);
        Button kleur3 = new Button("Zwart");
        kleur3.setPrefWidth(100);
        Button kleur4 = new Button("Grijs");
        kleur4.setPrefWidth(100);
        Button kleur5 = new Button("Bruin");
        kleur5.setPrefWidth(100);

        buttonContainerHaarkleur.getChildren().addAll(kleur1, kleur2, kleur3, kleur4, kleur5); // add the buttons to the container
        TitledPane Haarkleur = new TitledPane("De Haarkleur : ",buttonContainerHaarkleur);
        //</editor-fold>

        //<editor-fold desc="buttoncontainer geslacht">
        VBox buttonContainerGeslacht = new VBox();
        buttonContainerGeslacht.setAlignment(Pos.CENTER);
        Button Geslacht1 = new Button("Mannelijk");
        Geslacht1.setPrefWidth(100);
        Button Geslacht2 = new Button("Vrouwelijk");
        Geslacht2.setPrefWidth(100);
        Button Geslacht3 = new Button("Bloempot");
        Geslacht3.setPrefWidth(100);

        buttonContainerGeslacht.getChildren().addAll(Geslacht1,Geslacht2,Geslacht3);
        TitledPane Geslacht = new TitledPane("Het geslacht : ",buttonContainerGeslacht);
        //</editor-fold>

        //<editor-fold desc="buttoncontainer Gezichtsbeharing">
        VBox buttonContainerGezichtsbeharing = new VBox();
        buttonContainerGezichtsbeharing.setAlignment(Pos.CENTER);
        Button Gezichtsbeharing1 = new Button("Kaal");
        Gezichtsbeharing1.setPrefWidth(100);
        Button Gezichtsbeharing2 = new Button("Baard");
        Gezichtsbeharing2.setPrefWidth(100);
        Button Gezichtsbeharing3 = new Button("Snor");
        Gezichtsbeharing3.setPrefWidth(100);
        Button Gezichtsbeharing4 = new Button("Pornosnor");
        Gezichtsbeharing4.setPrefWidth(100);

        buttonContainerGezichtsbeharing.getChildren().addAll(Gezichtsbeharing1,Gezichtsbeharing2,Gezichtsbeharing3,Gezichtsbeharing4);
        TitledPane Gezichtsbeharing = new TitledPane("De Gezichtsbeharing : ",buttonContainerGezichtsbeharing);
        //</editor-fold>

        //<editor-fold desc="buttoncontainer Haarstijl">
        VBox buttonContainerHaar = new VBox();
        buttonContainerHaar.setAlignment(Pos.CENTER);
        Button Haar1 = new Button("Kale knikker");
        Haar1.setPrefWidth(100);
        Button Haar2 = new Button("Lang");
        Haar2.setPrefWidth(100);
        Button Haar3 = new Button("Kort");
        Haar3.setPrefWidth(100);

        buttonContainerHaar.getChildren().addAll(Haar1,Haar2,Haar3);
        TitledPane Haar = new TitledPane("De haarstijl : ",buttonContainerHaar);
        //</editor-fold>

        //<editor-fold desc="buttoncontainer Extras">
        VBox buttonContainerExtras = new VBox();
        buttonContainerExtras.setAlignment(Pos.CENTER);
        Button Extras1 = new Button("Bril");
        Extras1.setPrefWidth(100);
        Button Extras2 = new Button("Plamuursel");
        Extras2.setPrefWidth(100);

        buttonContainerExtras.getChildren().addAll(Extras1,Extras2);
        TitledPane Extras = new TitledPane("De extra : ",buttonContainerExtras);
        //</editor-fold>

        //<editor-fold desc="accordion">
        Accordion accordion = new Accordion();
        accordion.setStyle("-fx-font-family: Open sans-serif; -fx-font-size: 14;-fx-font-weight:bold; -fx-text-fill: white");
        accordion.getPanes().add(Haarkleur);
        accordion.getPanes().add(Geslacht);
        accordion.getPanes().add(Gezichtsbeharing);
        accordion.getPanes().add(Haar);
        accordion.getPanes().add(Extras);
        //</editor-fold>






        hBox.getChildren().add(vraag);
        hBox.getChildren().add(accordion);
        hBox.setAlignment(Pos.BASELINE_LEFT);
        mijnGridPane.setHalignment(mijnGridPane,HPos.CENTER);
        mijnGridPane.setGridLinesVisible(false);


        root.getChildren().addAll(mijnGridPane, hBox);
        root.setPrefHeight(900);

        //Scene toevoegen en pane daaraan toevoegen
        //Je hebt normaal gezien maar 1 scene
        Scene mijnEersteScene = new Scene(root);



        //Scene toevoegen aan stage die je via parameter binnenkrijgt
        mijnStage.setScene(mijnEersteScene);

        mijnStage.show();
    }
}