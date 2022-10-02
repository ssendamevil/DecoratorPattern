package decoratorPattern;

public class Honey extends CondimentDecorator{

    public Honey(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() +  0.52;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Honey";
    }
}
