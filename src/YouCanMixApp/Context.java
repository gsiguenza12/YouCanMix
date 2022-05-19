package YouCanMixApp;

/**
 * This class maintains a reference to one of the concrete strategies and communicates with this object
 * only via the appropriate interface
 */
public class Context {
    private StrategyIF selectedStrategy;

    public void setSelectedStrategy(StrategyIF s){
        this.selectedStrategy = s;
    }

    public void executeStrategy(){
        selectedStrategy.execute();
    }
}
