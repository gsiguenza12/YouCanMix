package YouCanMixApp;

import javax.swing.*;

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 * @author Gabriel Alfredo Siguenza <sigue005@cougars.csusm.edu>
 */
public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /*@Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }*/

    @Override
    public String getName() {
        return "YouCanMixApp.Title";
    }
}
