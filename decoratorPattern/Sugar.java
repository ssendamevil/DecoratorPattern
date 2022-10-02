package decoratorPattern;

public class Sugar extends CondimentDecorator{

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

}
