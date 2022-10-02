package decoratorPattern;

public class GreenTea extends Beverage{

    public GreenTea(){
        description = "Grean Tea";
    }

    @Override
    public double cost() {
        return 0.95;
    }
}
