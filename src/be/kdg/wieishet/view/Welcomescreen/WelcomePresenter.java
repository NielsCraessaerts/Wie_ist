package be.kdg.wieishet.view.Welcomescreen;
import be.kdg.wieishet.Model.WieishetModel;


public class WelcomePresenter {
    private WieishetModel model;
    private WelcomeView view;
    public WelcomePresenter(WieishetModel model,WelcomeView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
        this.updateView();
    }
    private void addEventHandlers() {
// Koppelt event handlers (anon. inner klassen)
// aan de controls uit de view.
// Event handlers: roepen methodes aan uit het
// model en zorgen voor een update van de view.
    }
    private void updateView() {
// Vult de view met data uit model
    }
    public void addWindowEventHandlers () {
// Window event handlers (anon. inner klassen)
// Koppeling via view.getScene().getWindow()
    }
}
