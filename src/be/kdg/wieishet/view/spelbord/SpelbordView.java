package be.kdg.wieishet.view.spelbord;


import be.kdg.wieishet.Model.Enums.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class SpelbordView extends VBox {
private GridPane SpelbordGrid;
private Accordion KeuzesAccordion;
private VBox buttonContainterGeslacht;
private Button btnVraag;
private TitledPane geslacht;
private TitledPane gezichtsbeharing;
private TitledPane haar;
private TitledPane kleur;
private TitledPane extra;
private ToggleButton[] characterButtons;
private     String zoekterm ;
private Label lblAntwoordVraag;
private HBox accordionenvraag;
private Button[] btnGeslacht;
private Button[] btnGezichtsbeharing;
private Button[] btnHaar;
private Button[] btnKleur;
private Button[] btnExtra;

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
    lblAntwoordVraag = new Label("YES/NO");



        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));





        KeuzesAccordion = new Accordion();
        VBox buttonContainerGeslacht = new VBox();
        buttonContainerGeslacht.setAlignment(Pos.CENTER);

        this.btnGeslacht = new Button[Geslacht.values().length];
        for (int i=0;i< Geslacht.values().length;i++) {
            int b = i;
            System.out.println(Geslacht.values()[i].name());

            this.btnGeslacht[b] = new Button(Geslacht.values()[i].name());
            buttonContainerGeslacht.getChildren().add(this.btnGeslacht[b]);
        }



        VBox buttonContainerGezichtsbeharing = new VBox();
        buttonContainerGezichtsbeharing.setAlignment(Pos.CENTER);

        this.btnGezichtsbeharing = new Button[Gezichtsbeharing.values().length];
        for (int i = 0; i < Gezichtsbeharing.values().length; i++) {
            int b = i;
            System.out.println(Gezichtsbeharing.values()[i].name());

            this.btnGezichtsbeharing[b] = new Button(Gezichtsbeharing.values()[i].name());
            buttonContainerGezichtsbeharing.getChildren().add(this.btnGezichtsbeharing[b]);
        }



// Haar
        VBox buttonContainerHaar = new VBox();
        buttonContainerHaar.setAlignment(Pos.CENTER);

        this.btnHaar = new Button[Haar.values().length];
        for (int i = 0; i < Haar.values().length; i++) {
            int b = i;
            System.out.println(Haar.values()[i].name());

            this.btnHaar[i] = new Button(Haar.values()[i].name());
            buttonContainerHaar.getChildren().addAll(this.btnHaar[i]);
        }



// Kleur
        VBox buttonContainerKleur = new VBox();
        buttonContainerKleur.setAlignment(Pos.CENTER);

        this.btnKleur = new Button[Kleur.values().length];
        for (int i = 0; i < Kleur.values().length; i++) {
            int b = i;
            System.out.println(Kleur.values()[i].name());

            this.btnKleur[i] = new Button(Kleur.values()[i].name());
            buttonContainerKleur.getChildren().addAll(this.btnKleur[i]);
        }



// Extra
        VBox buttonContainerExtra = new VBox();
        buttonContainerExtra.setAlignment(Pos.CENTER);

        this.btnExtra = new Button[Extra.values().length];
        for (int i = 0; i < Extra.values().length; i++) {
            int b = i;
            System.out.println(Extra.values()[i].name());

            this.btnExtra[i] = new Button(Extra.values()[i].name());
            buttonContainerExtra.getChildren().addAll(this.btnExtra[i]);
        }



        haar = new TitledPane("Haar:", buttonContainerHaar);
        extra = new TitledPane("Extra:", buttonContainerExtra);
         geslacht = new TitledPane("Het geslacht : ", buttonContainerGeslacht);
        gezichtsbeharing = new TitledPane("Gezichtsbeharing:", buttonContainerGezichtsbeharing);
        kleur = new TitledPane("Kleur:", buttonContainerKleur);
        KeuzesAccordion.getPanes().addAll(geslacht, gezichtsbeharing, haar, kleur, extra);




        accordionenvraag = new HBox();
        accordionenvraag.setAlignment(Pos.BOTTOM_CENTER);
        accordionenvraag.getChildren().addAll(KeuzesAccordion,lblAntwoordVraag);




}

        public void setImage(int index,ImageView image) {
            characterButtons[index].setGraphic(image);
        }
    private void layoutNodes() {

        KeuzesAccordion.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 2px;");
        KeuzesAccordion.setPrefWidth(300);
        this.getChildren().add(SpelbordGrid);
        this.getChildren().add(accordionenvraag);
        geslacht.getContent().setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        haar.getContent().setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        kleur.getContent().setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        gezichtsbeharing.getContent().setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        extra.getContent().setStyle("-fx-background-color: lightblue; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        this.setPrefSize(800,800);



        }
// Layout van de Nodes
// add… methodes (of set…)
// Insets, padding, alignment, …


    public TitledPane getGezichtsbeharing() {
        return gezichtsbeharing;
    }

    public TitledPane getHaar() {
        return haar;
    }

    public TitledPane getKleur() {
        return kleur;
    }

    public TitledPane getExtra() {
        return extra;
    }

    public HBox getAccordionenvraag() {
        return accordionenvraag;
    }

    public Button[] getBtnGeslacht() {
        return btnGeslacht;
    }

    public Button[] getBtnGezichtsbeharing() {
        return btnGezichtsbeharing;
    }

    public Button[] getBtnHaar() {
        return btnHaar;
    }

    public Button[] getBtnKleur() {
        return btnKleur;
    }

    public Button[] getBtnExtra() {
        return btnExtra;
    }

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

    public Button getBtnVraag() {
        return btnVraag;
    }

    public void setBtnVraag(Button mijnbutton) {
        this.btnVraag = mijnbutton;
    }

    public TitledPane getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(TitledPane geslacht) {
        this.geslacht = geslacht;
    }

    public ToggleButton[] getCharacterButtons() {
        return characterButtons;
    }

    public void setCharacterButtons(ToggleButton[] characterButtons) {
        this.characterButtons = characterButtons;
    }

    public String getZoekterm() {
        return zoekterm;
    }

    public void setZoekterm(String zoekterm) {
        this.zoekterm = zoekterm;
    }

    public Label getLblAntwoordVraag() {
        return lblAntwoordVraag;
    }

    public void setLblAntwoordVraag(Label lblAntwoordVraag) {
        this.lblAntwoordVraag = lblAntwoordVraag;
    }

}
