package be.kdg.wieishet.view.spelbord;

import be.kdg.wieishet.Model.Klep;
import javafx.scene.control.Button;
import be.kdg.wieishet.Model.WieishetModel;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SpelbordPresenter {
    private WieishetModel model;
    private SpelbordView view;

    public SpelbordPresenter(WieishetModel model, SpelbordView view){
        this.model = model;
        this.view = view;
        System.out.println("----------------------------------------constructor started");
        model.setHuidigeSpeler(model.getSpeler1());
        System.out.println(model.getHuidigeSpeler().getSpelersnaam());
        this.initialize();
        this.addEventHandlers();


    }


    private void addEventHandlers(){

        view.setPlayername(model.getHuidigeSpeler().getSpelersnaam());
        view.getButtonContainerGeslacht().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnGeslacht(new Integer(node.getId())).getText();
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);


                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)));
                        System.out.println("Uw antwoord is " + model.getSpeler2().getTeRadenPersoon().isGelijkAan(question));




                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)));
                        System.out.println("Uw antwoord is " + model.getSpeler1().getTeRadenPersoon().isGelijkAan(question));



                    }
                });
            }
        });

        view.getButtonContainerExtra().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnExtra(new Integer(node.getId())).getText();
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);


                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)));




                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)));


                    }
                });
            }
        });

        view.getButtonContainerGezichtsbeharing().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnGezichtsbeharing(new Integer(node.getId())).getText();
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);
                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)));



                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())) {
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)));


                    }
                });
            }
        });
        view.getButtonContainerHaar().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnHaar(new Integer(node.getId())).getText();
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);

                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)));




                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);

                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)));



                    }
                });
            }
        });

        view.getButtonContainerHaarkleur().getChildren().forEach(node -> {
            if (node instanceof Button){
                ((Button) node).setOnAction(event -> {
                    String question = view.getBtnHaarkleur(new Integer(node.getId())).getText();
                    if (model.getHuidigeSpeler().equals(model.getSpeler1())) {
                        model.getSpeler2().getTeRadenPersoon().isGelijkAan(question);



                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler2().getTeRadenPersoon().isGelijkAan(question)));


                    } else if(model.getHuidigeSpeler().equals(model.getSpeler2())){
                        model.getSpeler1().getTeRadenPersoon().isGelijkAan(question);
                        ;


                        view.getLblAntwoordVraag().setText(Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(question)));
                        model.setHuidigeSpeler(model.getSpeler1());


                    }
                });
            }
        });


        view.getSpelbordGrid().getChildren().forEach(node -> {
            if (node instanceof ToggleButton) {
                ((ToggleButton) node).setOnAction(event -> {
                    System.out.println("togglebutton");
                    model.getHuidigeSpeler().getSpelbord().getKlep(new Integer(node.getId()).intValue()).setToestand("Toe");
                    System.out.println(node.getId());
                    System.out.println(new Integer(node.getId()).intValue());
                    this.updateView();

                });
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


















    }
    private void updateView(){

        for(int i = 0; i <24;i++){
       if( model.getHuidigeSpeler().getSpelbord().getKlep(i).getToestand().equals("Open")){
                view.setImage(i,model.getCharacters()[i].getKarakter());
            }
       else if( model.getHuidigeSpeler().getSpelbord().getKlep(i).getToestand().equals("Toe")){
           view.setImage(i,model.getCharacters()[i].getKarakterelim());
       }

        }





    }
    public void initialize(){
        System.out.println("initialize");
        for (int i = 0; i < 24; i++) {
            System.out.println("ello");
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
