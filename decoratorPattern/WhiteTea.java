package decoratorPattern;

public class WhiteTea extends Beverage{

    public WhiteTea(){
        description = "White Tea";
    }

    @Override
    public double cost() {
        return 0.75;
    }
}
