package be.kdg.wieishet.view.spelbord;

import be.kdg.wieishet.Main;
import be.kdg.wieishet.Model.Highscores;
import be.kdg.wieishet.Model.Klep;
import be.kdg.wieishet.view.Welcomescreen.WelcomePresenter;
import be.kdg.wieishet.view.Welcomescreen.WelcomeView;
import be.kdg.wieishet.view.niewSpelAanmaak.NieuwSpelView;
import be.kdg.wieishet.view.niewSpelAanmaak.NiewSpelPresenter;
import be.kdg.wieishet.view.HighScores.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import be.kdg.wieishet.Model.WieishetModel;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;

public class SpelbordPresenter {
    private WieishetModel model;
    private SpelbordView view;

    public SpelbordPresenter(WieishetModel model, SpelbordView view){
        this.model = model;
        this.view = view;

        model.setHuidigeSpeler(model.getSpeler1());

        this.initialize();
        this.addEventHandlers();


    }


    private void addEventHandlers(){


        view.setPlayername(model.getHuidigeSpeler().getSpelersnaam());
        //<editor-fold desc="ButtonContainers">
        view.getButtonContainerGeslacht().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnGeslacht(new Integer(node.getId())).getText();
                    if(view.getOpDeKnopGetikt() == 0){
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);

                        if (model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);






                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        if (model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);




                    }}
                    else if(view.getOpDeKnopGetikt() == 1){
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                updateView();

                            }

                        }
                        else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                updateView();

                            }
                        }

                    }
                });
            }
        });

        view.getButtonContainerExtra().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnExtra(new Integer(node.getId())).getText();
                    if(view.getOpDeKnopGetikt()==0) {
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {

                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);

                        if (model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                            view.setOpDeKnopGetikt(1);
                    }

                     else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);
                        if (model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                            view.setOpDeKnopGetikt(1);


                    }
                    } else if(view.getOpDeKnopGetikt() == 1){
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                updateView();

                            }

                        }
                        else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                updateView();

                            }
                        }

                    }
                });
            }
        });

        view.getButtonContainerGezichtsbeharing().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnGezichtsbeharing(new Integer(node.getId())).getText();
                    if (view.getOpDeKnopGetikt() == 0){
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);



                        if (model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);
                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);
                        if (model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }

                        view.setOpDeKnopGetikt(1);

                    }}else if(view.getOpDeKnopGetikt() == 1){
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                updateView();

                            }

                        }
                        else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                updateView();

                            }
                        }

                    }
                });
            }
        });
        view.getButtonContainerHaar().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnHaar(new Integer(node.getId())).getText();
                    if (view.getOpDeKnopGetikt() == 0){
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);
                        view.setOpDeKnopGetikt(1);



                        if (model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }

                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        if (model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);



                    }}else if(view.getOpDeKnopGetikt() == 1){
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                updateView();

                            }

                        }
                        else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                this.updateView();

                            }else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                updateView();

                            }
                        }

                    }
                });
            }
        });

        view.getButtonContainerHaarkleur().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnHaarkleur(new Integer(node.getId())).getText();
                    if(view.getOpDeKnopGetikt() == 0){
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);

                        if (model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);



                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);


                        if (model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)){
                            view.getLblAntwoordVraag().setText("Ja");
                        }else {
                            view.getLblAntwoordVraag().setText("Nee");
                        }
                        view.setOpDeKnopGetikt(1);


                    }}else if(view.getOpDeKnopGetikt() == 1){
                        if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler2());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                                updateView();

                            }

                        }
                        else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                            alert.setTitle("U hebt uw beurt al gehad");
                            alert.setHeaderText("U kunt maar 1 keer gokken of een vraag stellen");


                            Optional<ButtonType> result = alert.showAndWait();
                            if (result.isPresent() && result.get() == ButtonType.OK) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                this.updateView();

                            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                                model.setHuidigeSpeler(model.getSpeler1());
                                view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                                updateView();

                            }
                        }

                    }
                });
            }
        });
        //</editor-fold>


        view.getSpelbordGrid().getChildren().forEach(node -> {
            if (node instanceof ToggleButton) {
                ((ToggleButton) node).setOnAction(event -> {
                    if (model.getHuidigeSpeler().getSpelbord().getKlep(new Integer(node.getId()).intValue()).getToestand().equals("Open")){

                    model.getHuidigeSpeler().getSpelbord().getKlep(new Integer(node.getId()).intValue()).setToestand("Toe");

                    this.updateView();}
                    else if(model.getHuidigeSpeler().getSpelbord().getKlep(new Integer(node.getId()).intValue()).getToestand().equals("Toe")){
                        model.getHuidigeSpeler().getSpelbord().getKlep(new Integer(node.getId()).intValue()).setToestand("Open");

                        this.updateView();
                    }

                });
            }
        });

        view.getBtnSpelStoppen().setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Huidig Spel afsluiten");
            alert.setHeaderText("U staat op het punt om het spel af te sluiten.");
            alert.setContentText("Wilt u een nieuw Spel spelen of het spel volledig afsluiten ?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                NieuwSpelView NieuwSpelView = new NieuwSpelView();
                NiewSpelPresenter NieuwspelPresenter = new NiewSpelPresenter(model, NieuwSpelView);
                Scene Nieuwspel = new Scene(NieuwSpelView);
                Main.window.setScene(Nieuwspel);
                Main.window.setTitle("Nieuw Spel");
                Main.window.show();
            } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                WelcomeView Welcomeview = new WelcomeView();
                WelcomePresenter Welcomepresenter = new WelcomePresenter(model, Welcomeview);
                Scene Homescreen = new Scene(Welcomeview);
                Main.window.setScene(Homescreen);
                Main.window.setTitle("Hoofdmenu");
                Main.window.show();
            }
        });




        view.getSpelerwisselen().setOnAction(event -> {


            if (model.getHuidigeSpeler().equals(model.getSpeler1())){
                model.getSpeler1().setAantalBeurten(model.getSpeler1().getAantalBeurten()+1) ;
                model.setHuidigeSpeler(model.getSpeler2());
                view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                this.updateView();
            } else {
                model.getSpeler2().setAantalBeurten(model.getSpeler2().getAantalBeurten()+1) ;
                model.setHuidigeSpeler( model.getSpeler1());
                view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                this.updateView();
            }
            view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
        });



        view.getBtnGokwagen().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String gok = "\"" +view.getTxtGokwagen().getText().toLowerCase() +"\"";

            if(model.getHuidigeSpeler().equals(model.getSpeler1())) {

                if (gok.equals(model.getSpeler2().getTeRadenPersoon().Naam.toLowerCase())) {
                    Highscores nieuweHighscore = new Highscores(model.getSpeler1().getSpelersnaam(),model.getSpeler1().getAantalBeurten());
                    model.addHighscore(nieuweHighscore);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Proficiat, " + model.getSpeler1().getSpelersnaam() + ". U bent gewonnen");
                    alert.setHeaderText("U hebt " + model.getSpeler2().getSpelersnaam() + " verslagen in " + model.getSpeler1().getAantalBeurten() + " Beurten.");
                    alert.setContentText("Wilt u nog is spelen ?");
                    alert.setGraphic(model.getSpeler2().getTeRadenPersoon().getKarakter());
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.isPresent() && result.get() == ButtonType.OK) {
                        NieuwSpelView NieuwSpelView = new NieuwSpelView();
                        NiewSpelPresenter NieuwspelPresenter = new NiewSpelPresenter(model, NieuwSpelView);
                        Scene Nieuwspel = new Scene(NieuwSpelView);
                        Main.window.setScene(Nieuwspel);
                        Main.window.setTitle("Nieuw Spel");
                        Main.window.show();
                    } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                        WelcomeView Welcomeview = new WelcomeView();
                        WelcomePresenter Welcomepresenter = new WelcomePresenter(model, Welcomeview);
                        Scene Homescreen = new Scene(Welcomeview);
                        Main.window.setScene(Homescreen);
                        Main.window.setTitle("Hoofdmenu");
                        Main.window.show();
                    }
                } else {
                    view.getTxtGokwagen().setText("Fout");
                    model.getSpeler1().setAantalBeurten(model.getSpeler1().getAantalBeurten()+1) ;



                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("fout geraden");
                    alert.setHeaderText("Sorry, maar dat was fout!");


                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.isPresent() && result.get() == ButtonType.OK) {
                        model.setHuidigeSpeler(model.getSpeler2());
                        view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                        view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                        updateView();

                    }
                    else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                        model.setHuidigeSpeler(model.getSpeler2());
                        view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                        view.getSpelbordGrid().setStyle("-fx-background-color: blue;-fx-border-color: blue;-fx-border-width: 3px;");
                        updateView();

                    }


                }

            }
            else if (model.getHuidigeSpeler().equals(model.getSpeler2())){
                if (gok.equals(model.getSpeler1().getTeRadenPersoon().Naam.toLowerCase())) {
                    Highscores nieuweHighscore = new Highscores(model.getSpeler2().getSpelersnaam(),model.getSpeler2().getAantalBeurten());
                    model.addHighscore(nieuweHighscore);
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("Proficiat, " + model.getSpeler2().getSpelersnaam() + ". U bent gewonnen");
                    alert.setHeaderText("U hebt " + model.getSpeler1().getSpelersnaam() + " verslagen in " + model.getSpeler2().getAantalBeurten() + " Beurten.");
                    alert.setContentText("Wilt u nog is spelen ?");
                    alert.setGraphic(model.getSpeler1().getTeRadenPersoon().getKarakter());
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.isPresent() && result.get() == ButtonType.OK) {
                        NieuwSpelView NieuwSpelView = new NieuwSpelView();
                        NiewSpelPresenter NieuwspelPresenter = new NiewSpelPresenter(model, NieuwSpelView);
                        Scene Nieuwspel = new Scene(NieuwSpelView);
                        Main.window.setScene(Nieuwspel);
                        Main.window.setTitle("Nieuw Spel");
                        Main.window.show();
                    } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                        WelcomeView Welcomeview = new WelcomeView();
                        WelcomePresenter Welcomepresenter = new WelcomePresenter(model, Welcomeview);
                        Scene Homescreen = new Scene(Welcomeview);
                        Main.window.setScene(Homescreen);
                        Main.window.setTitle("Hoofdmenu");
                        Main.window.show();
                    }
                }
                else {
                    if(view.getOpDeKnopGetikt() == 0){
                        view.getTxtGokwagen().setText("Fout");
                        model.getSpeler1().setAantalBeurten(model.getSpeler1().getAantalBeurten()+1) ;



                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setTitle("fout geraden");
                        alert.setHeaderText("Sorry, maar dat was fout!");


                        Optional<ButtonType> result = alert.showAndWait();
                        if (result.isPresent() && result.get() == ButtonType.OK) {
                            model.setHuidigeSpeler(model.getSpeler1());
                            view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                            view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                            updateView();

                        }
                        else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
                            model.setHuidigeSpeler(model.getSpeler1());
                            view.getHetisDeBeurtAan().setText("Het is de beurt aan : " + model.getHuidigeSpeler().getSpelersnaam());
                            view.getSpelbordGrid().setStyle("-fx-background-color: red;-fx-border-color: red;-fx-border-width: 3px;");
                            updateView();

                        }

                }}
            }}
        });
















    }
    private void updateView(){

        for(int i = 0; i <24;i++){
       if( model.getHuidigeSpeler().getSpelbord().getKlep(i).getToestand().equals("Open")){
                view.setImage(i,model.getCharacters()[i].getKarakter());
                view.setOpDeKnopGetikt(0);
            }
       else if( model.getHuidigeSpeler().getSpelbord().getKlep(i).getToestand().equals("Toe")){
           view.setImage(i,model.getCharacters()[i].getKarakterelim());
           view.setOpDeKnopGetikt(0);
       }

        }





    }

    public void updateHighscore() {
        System.out.println("balls");

    }
    public void initialize(){

        for (int i = 0; i < 24; i++) {

        view.setImage(i,model.getCharacters()[i].getKarakter());
        model.getSpeler1().getSpelbord().setKlep(new Klep("Open",model.getCharacter(i)),i);
        model.getSpeler2().getSpelbord().setKlep(new Klep("Open",model.getCharacter(i)),i);
        }
        view.getHetisDeBeurtAan().setText("Het is nu de beurt aan " + model.getHuidigeSpeler().getSpelersnaam());
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }

}
