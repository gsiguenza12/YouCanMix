package YouCanMixApp;

/**
 *
 * facilitates communications between GUI components of application.
 * The synonym of the Mediator is the Controller part of MVC pattern.
 */
public interface Mediator {
    void createGUI();
    void hideElements(boolean flag);
    void clear();

}
