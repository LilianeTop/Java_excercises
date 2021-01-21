package DesignPatterns.FactoryPattern;

public class PizzaOrderMain {
    public static void main(String[] args) {
        PizzaStore newYork = new NYStylePizzaStore();
        PizzaStore chicago = new ChicagoStylePizzaStore();

        Pizza pizza = newYork.orderPizza("cheese");
        System.out.println("Pizza ordered: " + pizza.getName() + "\n");

        Pizza pizza1 = chicago.orderPizza("cheese");
        System.out.println("Pizza ordered: " + pizza1.getName() + "\n");

    }
}
