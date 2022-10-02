package decoratorPattern;

public class Lemon extends CondimentDecorator{

    public Lemon(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.40 ;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Lemon";
    }
}
