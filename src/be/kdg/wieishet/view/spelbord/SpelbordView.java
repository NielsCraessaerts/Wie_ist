package be.kdg.wieishet.view.spelbord;


import be.kdg.wieishet.Model.Enums.*;
import be.kdg.wieishet.Model.Enums.Haarkleur;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class SpelbordView extends VBox {
private GridPane SpelbordGrid;
private Accordion KeuzesAccordion;
private HBox buttonContainterGeslacht;
private Button btnVraag;
private TitledPane geslacht;
private TitledPane gezichtsbeharing;
private TitledPane haar;
private TitledPane haarkleur;
private TitledPane extra;
private ToggleButton[] characterButtons;
private     String zoekterm ;
private Label lblAntwoordVraag;
private HBox accordionenvraag;
private Button[] btnGeslacht;
private Button[] btnGezichtsbeharing;
private Button[] btnHaar;
private Button[] btnHaarkleur;
private Button[] btnExtra;
private HBox buttonContainerExtra;
private HBox buttonContainerGeslacht;
private HBox buttonContainerGezichtsbeharing;
private HBox buttonContainerHaar;
private HBox buttonContainerHaarkleur;
private HBox BottomButtons;
private Label HetisDeBeurtAan;
private String Playername;
private Button Spelerwisselen;
private Label lblGokwagen;
private TextField txtGokwagen;
private HBox hboxGokwagen;
private Button btnGokwagen;
private Button btnSpelStoppen;
private HBox bovenkant;
private int opDeKnopGetikt;

public SpelbordView() {
    this.initialiseNodes();
    this.layoutNodes();
}
    private void initialiseNodes() {
    bovenkant = new HBox();
    btnGokwagen = new Button("Bevestig");
    btnSpelStoppen = new Button("Spel stoppen");
    hboxGokwagen = new HBox();
    lblGokwagen = new Label("Het geheime karakter is : ")  ;
    txtGokwagen = new TextField();
    Playername = getPlayername();
    HetisDeBeurtAan = new Label("Het is nu de beurt aan " + Playername);
    BottomButtons = new HBox();
    SpelbordGrid = new GridPane();
    characterButtons = new ToggleButton[24];
        for (int i = 0; i < 24; i++) {
            int p = (i + 1);
           ToggleButton characterButton = new ToggleButton();
           characterButtons[i] = characterButton;

            characterButton.setId(Integer.toString(i));
            SpelbordGrid.add(characterButton, i % 6, i / 6);
        }
    lblAntwoordVraag = new Label("TRUE/FALSE");
        Spelerwisselen = new Button("Mijn beurt is gedaan");



        this.setBackground(new Background(new BackgroundImage(new Image("/achtergrond.png"), BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT)));





        KeuzesAccordion = new Accordion();
        buttonContainerGeslacht = new HBox();
        buttonContainerGeslacht.setAlignment(Pos.CENTER);

        this.btnGeslacht = new Button[Geslacht.values().length];
        for (int i = 0; i < Geslacht.values().length; i++) {
            this.btnGeslacht[i] = new Button(Geslacht.values()[i].name());
            this.btnGeslacht[i].setId(Integer.toString(i));
            buttonContainerGeslacht.getChildren().add(this.btnGeslacht[i]);
        }



        buttonContainerGezichtsbeharing = new HBox();
        buttonContainerGezichtsbeharing.setAlignment(Pos.CENTER);

        this.btnGezichtsbeharing = new Button[Gezichtsbeharing.values().length];
        for (int i = 0; i < Gezichtsbeharing.values().length; i++) {
            this.btnGezichtsbeharing[i] = new Button(Gezichtsbeharing.values()[i].name());
            this.btnGezichtsbeharing[i].setId(Integer.toString(i));
            buttonContainerGezichtsbeharing.getChildren().add(this.btnGezichtsbeharing[i]);
        }



// Haar
        buttonContainerHaar = new HBox();
        buttonContainerHaar.setAlignment(Pos.CENTER);

        this.btnHaar = new Button[Haar.values().length];
        for (int i = 0; i < Haar.values().length; i++) {
            this.btnHaar[i] = new Button(Haar.values()[i].name());
            this.btnHaar[i].setId(Integer.toString(i));
            buttonContainerHaar.getChildren().add(this.btnHaar[i]);
        }



// HaarHaarkleur
        buttonContainerHaarkleur = new HBox();
        buttonContainerHaarkleur.setAlignment(Pos.CENTER);

        this.btnHaarkleur = new Button[Haarkleur.values().length];
        for (int i = 0; i < Haarkleur.values().length; i++) {
            this.btnHaarkleur[i] = new Button(Haarkleur.values()[i].name());
            this.btnHaarkleur[i].setId(Integer.toString(i));
            buttonContainerHaarkleur.getChildren().add(this.btnHaarkleur[i]);
        }



// Extra
        buttonContainerExtra = new HBox();
        buttonContainerExtra.setAlignment(Pos.CENTER);

        this.btnExtra = new Button[Extra.values().length];
        for (int i = 0; i < Extra.values().length; i++) {
            this.btnExtra[i] = new Button(Extra.values()[i].name());
            this.btnExtra[i].setId(Integer.toString(i));
            buttonContainerExtra.getChildren().add(this.btnExtra[i]);
        }


        haar = new TitledPane("Haar:", buttonContainerHaar);
        extra = new TitledPane("Extra:", buttonContainerExtra);
         geslacht = new TitledPane("Het geslacht : ", buttonContainerGeslacht);
        gezichtsbeharing = new TitledPane("Gezichtsbeharing:", buttonContainerGezichtsbeharing);
        haarkleur = new TitledPane("Haarkleur:", buttonContainerHaarkleur);
        KeuzesAccordion.getPanes().addAll(geslacht, gezichtsbeharing, haar, haarkleur, extra);










}

        public void setImage(int index,ImageView image) {
            characterButtons[index].setGraphic(image);
        }
    private void layoutNodes() {
        btnGokwagen.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white; ");
        hboxGokwagen.getChildren().addAll(lblGokwagen,txtGokwagen,btnGokwagen,Spelerwisselen);
        KeuzesAccordion.setStyle("-fx-background-color: red; -fx-border-color: black; -fx-border-width: 2px;");
        KeuzesAccordion.setPrefWidth(1080);
        SpelbordGrid.setHgap(15);
        SpelbordGrid.setVgap(15);
        SpelbordGrid.setAlignment(Pos.CENTER);
        SpelbordGrid.setPrefWidth(800);
        SpelbordGrid.setStyle("-fx-background-color:red");

        bovenkant.getChildren().addAll(HetisDeBeurtAan,btnSpelStoppen);
        this.getChildren().add(HetisDeBeurtAan);
        this.getChildren().add(SpelbordGrid);
        this.getChildren().add(KeuzesAccordion);
        this.getChildren().add(lblAntwoordVraag);
        this.getChildren().add(hboxGokwagen);


        HetisDeBeurtAan.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 2; -fx-font-size:12pt");
        lblGokwagen.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 2; -fx-font-size:12pt");
        txtGokwagen.setStyle("-fx-background-color: white; -fx-border-color: black; -fx-border-width: 2; -fx-font-size:12pt");
        lblAntwoordVraag.setStyle("-fx-background-color:white;-fx-border-color:black;-fx-border-width: 2px; -fx-font-size: 12pt;");
        Spelerwisselen.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white");
        geslacht.getContent().setStyle("-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        btnSpelStoppen.setStyle("-fx-background-color: #2a2a2a; -fx-text-fill: white; -fx-font-size: 20px;-fx-border-color: white");

        haar.getContent().setStyle("-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        haarkleur.getContent().setStyle("-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        gezichtsbeharing.getContent().setStyle("-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        extra.getContent().setStyle("-fx-background-color: gray; -fx-border-color: black; -fx-border-width: 2px; -fx-font-size: 12pt;");
        this.setPrefSize(1080,1080);
        HetisDeBeurtAan.setPrefWidth(1080);
        lblAntwoordVraag.setPrefWidth(1080);

        }
// Layout van de Nodes
// add… methodes (of set…)
// Insets, padding, alignment, …


    public Button getSpelerwisselen() {
        return Spelerwisselen;
    }

    public void setHetisDeBeurtAan(Label hetisDeBeurtAan) {
        HetisDeBeurtAan = hetisDeBeurtAan;
    }

    public void setPlayername(String spelersnaam) {
        Playername = spelersnaam;
    }

    public Button[] getBtnGeslacht() {
        return btnGeslacht;
    }

    public Label getHetisDeBeurtAan() {
        return HetisDeBeurtAan;
    }

    public String getPlayername() {
        return Playername;
    }

    public TitledPane getGezichtsbeharing() {
        return gezichtsbeharing;
    }

    public TitledPane getHaar() {
        return haar;
    }

    public TitledPane getHaarkleur() {
        return haarkleur;
    }

    public TitledPane getExtra() {
        return extra;
    }

    public HBox getAccordionenvraag() {
        return accordionenvraag;
    }

    public Button getBtnGeslacht(int id) {
        return btnGeslacht[id];
    }

    public Button getBtnGezichtsbeharing(int id) {
        return btnGezichtsbeharing[id];
    }

    public Button getBtnHaar(int id) {
        return btnHaar[id];
    }

    public Button getBtnHaarkleur(int id) {
        return btnHaarkleur[id];
    }

    public Button getBtnExtra(int id) {
        return btnExtra[id];
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

    public HBox getButtonContainterGeslacht() {
        return buttonContainterGeslacht;
    }

    public void setButtonContainterGeslacht(HBox buttonContainterGeslacht) {
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

    public HBox getButtonContainerExtra() {
        return buttonContainerExtra;
    }

    public HBox getButtonContainerGeslacht() {
        return buttonContainerGeslacht;
    }

    public HBox getButtonContainerGezichtsbeharing() {
        return buttonContainerGezichtsbeharing;
    }

    public HBox getButtonContainerHaar() {
        return buttonContainerHaar;
    }

    public HBox getButtonContainerHaarkleur() {
        return buttonContainerHaarkleur;
    }

    public HBox getBottomButtons() {
        return BottomButtons;
    }

    public Label getLblGokwagen() {
        return lblGokwagen;
    }

    public TextField getTxtGokwagen() {
        return txtGokwagen;
    }

    public HBox getHboxGokwagen() {
        return hboxGokwagen;
    }

    public Button getBtnGokwagen() {
        return btnGokwagen;
    }

    public Button getBtnSpelStoppen() {
        return btnSpelStoppen;
    }

    public int getOpDeKnopGetikt() {
        return opDeKnopGetikt;
    }

    public void setOpDeKnopGetikt(int opDeKnopGetikt) {
        this.opDeKnopGetikt = opDeKnopGetikt;
    }
}
