package be.kdg.wieishet;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import be.kdg.wieishet.Model.*;
import be.kdg.wieishet.view.Welcomescreen.*;
import be.kdg.wieishet.view.spelbord.*;


import java.io.FileNotFoundException;

public class Main extends Application{
    public static Stage window;
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage mijnStage) throws FileNotFoundException {

//        Main.window = mijnStage;
//        WieishetModel model = new WieishetModel();
//        SpelbordView view = new SpelbordView();
//        SpelbordPresenter presenter = new SpelbordPresenter(model, view);
//        window.setScene(new Scene(view));
//        presenter.addWindowEventHandlers();
//        window.show();


        Main.window = mijnStage;
        WieishetModel model = new WieishetModel();
        WelcomeView view = new WelcomeView();
        WelcomePresenter presenter = new WelcomePresenter(model, view);
        window.setScene(new Scene(view));
        presenter.addWindowEventHandlers();
        window.show();

    }
}