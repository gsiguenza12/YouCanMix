package YouCanMixApp;


import SnakeGame.SnakeGame;

public class StrategyIsUnder21 implements StrategyIF {

    @Override
    public void execute() {
        SnakeGame g = new SnakeGame();
//        g.startGame();
        MMain thread = new MMain(g);
        thread.start();
    }
}

class MMain extends Thread {
    private SnakeGame g;

    public MMain(SnakeGame g) {
        this.g = g;
    }

    public void run() {
        this.g.startGame();
    }
}
