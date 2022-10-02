package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new GreenTea();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new WhiteTea();
        beverage2 = new Sugar(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new BlackTea();
        beverage3 = new Honey(beverage3);
        beverage3 = new Lemon(beverage3);
        beverage3 = new Sugar(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
