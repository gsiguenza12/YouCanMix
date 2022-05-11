package YouCanMixApp.AbsFact;

public class Base implements IF_Base{
    String bname = "";
    //user input is set as Base!!



    Base() {
        this.bname = bname;
    }

    public Base createBase() {
        //will return the result of a getString function!
        return new Base();
    }

    public String getName() {
        //either pass in the name from "main" or ask for it here??
        return name;
    }

}
