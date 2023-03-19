package be.kdg.wieishet.view.spelbord;

import be.kdg.wieishet.Model.*;
import be.kdg.wieishet.view.spelbord.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import be.kdg.wieishet.Model.WieishetModel;

public class SpelbordPresenter {
    private WieishetModel model;
    private SpelbordView view;

    public SpelbordPresenter(WieishetModel model, SpelbordView view){
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
        this.initialize();
    }
    private void addEventHandlers(){


        view.getGeslacht().getChildrenUnmodifiable().forEach(node -> {
            int characterIndex = Integer.parseInt(node.getId());
                            String vraagGeslacht = view.getBtnGeslacht()[characterIndex].getText();
                            System.out.println(vraagGeslacht);
                            if(  model.getHuidigeSpeler().equals(model.getSpeler1())){
                                model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagGeslacht);
                                System.out.println(model.getSpeler2().getTeRadenPersoon().extra);

                                System.out.println("Uw antwoord is "+model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagGeslacht));

                            } else {
                                model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht);
                                System.out.println(model.getSpeler1().getTeRadenPersoon().extra);
                                view.getLblAntwoordVraag().setText( Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht)));
                                System.out.println("Uw antwoord is" +model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht));
                            }
        });


//        view.getKeuzesAccordion().getPanes().forEach(node -> {
//            if (node instanceof TitledPane) {
//                VBox buttonContainer = (VBox) node.getContent();
//                int i = 0;
//                for (Node child : buttonContainer.getChildren()) {
//                    if (child instanceof Button) {
//                        child.setId(String.valueOf(i));
//                        ((Button)child).setOnAction(event -> {
//                            // use the button's id to get the character from the model
//                            int characterIndex = Integer.parseInt(child.getId());
//                            String vraagGeslacht = view.getBtnGeslacht()[characterIndex].getText();
//                            System.out.println(vraagGeslacht);
//                            if(  model.getHuidigeSpeler().equals(model.getSpeler1())){
//                                model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagGeslacht);
//
//                                System.out.println("Uw antwoord is "+model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagGeslacht));
//
//                            } else {
//                                model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht);
//
//                                view.getLblAntwoordVraag().setText( Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht)));
//                                System.out.println("Uw antwoord is" +model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagGeslacht));
//                            }
//
//                            //<editor-fold desc="Extra enum">
//
//                            //</editor-fold>
//                            // ...
//                        });
//                        i++;
//                    }
//                }
//            }
//        });

//        view.getKeuzesAccordion().getPanes().forEach(node -> {
//            if (node instanceof TitledPane) {
//                VBox buttonContainer = (VBox) node.getContent();
//                int i = 0;
//                for (Node child : buttonContainer.getChildren()) {
//                    if (child instanceof Button) {
//                        child.setId(String.valueOf(i));
//                        ((Button)child).setOnAction(event -> {
//                            // use the button's id to get the character from the model
//                            int characterIndex = Integer.parseInt(child.getId());
//                            String vraagextra = view.getBtnExtra()[characterIndex].getText();
//                            System.out.println(vraagextra);
//                            if(  model.getHuidigeSpeler().equals(model.getSpeler1())){
//                                model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagextra);
//                                System.out.println(model.getSpeler2().getTeRadenPersoon().getExtra());
//                                System.out.println("Uw vraag is :"+model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraagextra));
//
//                            } else {
//                                model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagextra);
//                                System.out.println(model.getSpeler1().getTeRadenPersoon().getExtra());
//                                view.getLblAntwoordVraag().setText( Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagextra)));
//                                System.out.println("Uw vraag is :"+model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraagextra));
//                            }
//
//                            //<editor-fold desc="Extra enum">
//
//                            //</editor-fold>
//                            // ...
//                        });
//                        i++;
//                    }
//                }
//            }
//        });

//        view.getBtnVraag().setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                String vraag = view.getBtnVraag().getText();
//                System.out.println(vraag);
//              if(  model.getHuidigeSpeler().equals(model.getSpeler1())){
//                  model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraag);
//                  System.out.println("we zijn er");
//                  System.out.println(model.getSpeler2().getTeRadenPersoon().isGelijkAan(vraag));
//
//              } else {
//                  model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraag);
//                  System.out.println("we zijn er");
//                  view.getLblAntwoordVraag().setText( Boolean.toString(model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraag)));
//                  System.out.println(model.getSpeler1().getTeRadenPersoon().isGelijkAan(vraag));
//              }
//
//
//
//            }
//        });



    }
    private void updateView(){

    }
    public void initialize(){
        for (int i = 0; i < 24; i++) {
        view.setImage(i,model.getCharacters()[i].getKarakter());}
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }

}
