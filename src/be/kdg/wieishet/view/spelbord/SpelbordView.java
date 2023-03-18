package be.kdg.wieishet.view.spelbord;

import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class SpelbordView extends VBox {
private GridPane SpelbordGrid;
private Accordion KeuzesAccordion;
public SpelbordView() {
    this.initialiseNodes();
    this.layoutNodes();
}
    private void initialiseNodes() {
        for (int i = 0; i < 24; i++) {
            int p = (i + 1);
           ToggleButton characterButton = new ToggleButton();
            ImageView characterImageView = new ImageView(new Image("/characters/character" + p + ".png"));
            characterButton.setGraphic(characterImageView);
            characterButton.setSelected(false);
            SpelbordGrid.add(characterButton, i % 6, i / 6);
        }
    }
    private void layoutNodes() {
// Layout van de Nodes
// add… methodes (of set…)
// Insets, padding, alignment, …
    }

}
