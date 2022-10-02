package decoratorPattern;

public class BlackTea extends Beverage{

    public BlackTea(){
        description = "Black Tea";
    }

    @Override
    public double cost() {
        return 0.65;
    }
}
