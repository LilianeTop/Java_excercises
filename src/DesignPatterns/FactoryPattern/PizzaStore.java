package DesignPatterns.FactoryPattern;

public abstract class PizzaStore {
    SimplePizzaFactory factory;


    //the orderPizza method uses the factory to create its pizzas by simply passing on the type of the order
    //made final to enforce this
    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);// instead of the keyword new we call the method create();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

    private void box() {
    }

    private void cut() {
    }

    private void bake() {
    }

    private void prepare() {
    }

}
