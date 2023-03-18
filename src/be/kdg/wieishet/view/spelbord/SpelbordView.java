package be.kdg.wieishet.view.spelbord;


import be.kdg.wieishet.Model.Enums.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class SpelbordView extends VBox {
private GridPane SpelbordGrid;
private Accordion KeuzesAccordion;
private VBox buttonContainterGeslacht;
private Button mijnbutton;
private TitledPane geslacht;
private ToggleButton[] characterButtons;

public SpelbordView() {
    this.initialiseNodes();
    this.layoutNodes();
}
    private void initialiseNodes() {
    SpelbordGrid = new GridPane();
    characterButtons = new ToggleButton[24];
        for (int i = 0; i < 24; i++) {
            int p = (i + 1);
           ToggleButton characterButton = new ToggleButton();
           characterButtons[i] = characterButton;


            SpelbordGrid.add(characterButton, i % 6, i / 6);
        }
        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));



//        KeuzesAccordion = new Accordion();
//        VBox buttonContainerGeslacht = new VBox();
//        buttonContainerGeslacht.setAlignment(Pos.CENTER);
//        final String[] zoekcategorie = {""};
//        final String[] zoekterm = {""};
//        final Geslacht[] gevraagdeGeslacht = new Geslacht[1];
//        for (Geslacht huidigGeslacht : Geslacht.values()) {
//            System.out.println(huidigGeslacht.name());
//            Button mijnbutton = new Button(huidigGeslacht.name());
//            mijnbutton.setOnAction(new EventHandler<ActionEvent>() {
//                @Override
//                public void handle(ActionEvent actionEvent) {
//                    zoekterm[0] = mijnbutton.getText();
//                    zoekcategorie[0] = "Geslacht";
//                    gevraagdeGeslacht[0] = huidigGeslacht;
//                }
//            });
//    }
//        buttonContainerGeslacht.getChildren().addAll(mijnbutton);
//        TitledPane geslacht = new TitledPane("Het geslacht : ", buttonContainerGeslacht);


}

        public void setImage(int index,ImageView image) {
            characterButtons[index].setGraphic(image);
        }
    private void layoutNodes() {
//            mijnbutton.setPrefWidth(100);
//            mijnbutton.setStyle("-fx-background-color: #0071C5; -fx-text-fill: white; -fx-border-color: white;-fx-font-weight: bold");




        }
// Layout van de Nodes
// add… methodes (of set…)
// Insets, padding, alignment, …


    public GridPane getSpelbordGrid() {
        return SpelbordGrid;
    }

    public void setSpelbordGrid(GridPane spelbordGrid) {
        SpelbordGrid = spelbordGrid;
    }

    public Accordion getKeuzesAccordion() {
        return KeuzesAccordion;
    }

    public void setKeuzesAccordion(Accordion keuzesAccordion) {
        KeuzesAccordion = keuzesAccordion;
    }

    public VBox getButtonContainterGeslacht() {
        return buttonContainterGeslacht;
    }

    public void setButtonContainterGeslacht(VBox buttonContainterGeslacht) {
        this.buttonContainterGeslacht = buttonContainterGeslacht;
    }

    public Button getMijnbutton() {
        return mijnbutton;
    }

    public void setMijnbutton(Button mijnbutton) {
        this.mijnbutton = mijnbutton;
    }

    public TitledPane getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(TitledPane geslacht) {
        this.geslacht = geslacht;
    }
}
