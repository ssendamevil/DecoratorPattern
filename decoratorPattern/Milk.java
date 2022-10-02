package decoratorPattern;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() +  0.30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
