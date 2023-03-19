package be.kdg.wieishet.view.niewSpelAanmaak;
import be.kdg.wieishet.Main;
import be.kdg.wieishet.Model.Enums.Spelerskleur;
import be.kdg.wieishet.Model.Persoon;
import be.kdg.wieishet.Model.Spelbord;
import be.kdg.wieishet.Model.Speler;
import be.kdg.wieishet.Model.Persoon.*;
import be.kdg.wieishet.Model.WieishetModel;
import be.kdg.wieishet.view.Welcomescreen.WelcomePresenter;
import be.kdg.wieishet.view.Welcomescreen.WelcomeView;
import be.kdg.wieishet.view.niewSpelAanmaak.*;
import be.kdg.wieishet.view.spelbord.SpelbordPresenter;
import be.kdg.wieishet.view.spelbord.SpelbordView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

import java.util.Map;



public class NiewSpelPresenter {


    private WieishetModel model;
    private NieuwSpelView view;

    public NiewSpelPresenter(WieishetModel model, NieuwSpelView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
        model.setHuidigeSpeler( model.getSpeler1());
    }


    private void addEventHandlers() {
        // Koppelt event handlers (anon. inner klassen)
        // aan de controls uit de view.
        // Event handlers: roepen methodes aan uit het
        // model en zorgen voor een update van de view.

        view.getBtnBack().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                WelcomeView Welcomeview = new WelcomeView();
                WelcomePresenter Welcomepresenter = new WelcomePresenter(model, Welcomeview);
                Scene Homescreen = new Scene(Welcomeview);
                Main.window.setScene(Homescreen);
                Main.window.setTitle("Hoofdmenu");
                Main.window.show();
            }
        });
        view.getSetNaam().setOnAction(event -> {
                    model.getHuidigeSpeler().setSpelersnaam( view.getPlayerNameField().getText());
                });

        view.getStartButton().setOnAction(event -> {



            model.getSpeler1().setSpelerskleur(Spelerskleur.Blauw);
            model.getSpeler2().setSpelerskleur(Spelerskleur.Rood);
            model.getSpeler1().setAantalBeurten(0);
            model.getSpeler2().setAantalBeurten(0);



                SpelbordView SpelbordView = new SpelbordView();
                SpelbordPresenter SpelbordPresenter = new SpelbordPresenter(model, SpelbordView);
                Scene Spelbord = new Scene(SpelbordView);
                Main.window.setScene(Spelbord);
                Main.window.setTitle("Spelbord");
                Main.window.show();


            // Do something with the player name
            // ...
            System.out.println(model.getSpeler1().getSpelersnaam());
        });

        view.getSwitchToPlayer2Button().setOnAction(event -> {
            if (model.getHuidigeSpeler().equals(model.getSpeler1())){
                model.setHuidigeSpeler(model.getSpeler2());
            } else {
                model.setHuidigeSpeler( model.getSpeler1());
            }
        });


        view.getCharacterGrid().getChildren().forEach(node -> {
            System.out.println("view");
            if (node instanceof ToggleButton) {
                System.out.println("start if");
                ((ToggleButton) node).setOnAction(event -> {
                    System.out.println("start getKarakter");
                    model.getSpeler1().setTeRadenPersoon(model.getCharacter(new Integer(node.getId())));
                    System.out.println(model.getCharacter(node.getId()));
                    System.out.println(model.getSpeler1().getTeRadenPersoon());
                    System.out.println(node.getId());


                    // ...
                });
            }
        });
    }


    private void updateView() {
        // Vult de view met data uit model
        // You can update the view here with data from the model
        // ...
    }

    public void addWindowEventHandlers() {
        // Window event handlers (anon. inner klassen)
        // Koppeling via view.getScene().getWindow()
        view.getScene().getWindow().setOnCloseRequest(event -> {
            // Handle window close event
            // ...
        });
    }
}