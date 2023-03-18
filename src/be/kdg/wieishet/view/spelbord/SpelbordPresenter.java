package be.kdg.wieishet.view.spelbord;

import be.kdg.wieishet.Model.*;
import be.kdg.wieishet.view.spelbord.*;

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

    }
    private void updateView(){

    }
    public void initialize(){
        view.setImage(1,model.getCharacters()[1].getKarakter());
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }

}
