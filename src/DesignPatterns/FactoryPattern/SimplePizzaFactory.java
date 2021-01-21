package DesignPatterns.FactoryPattern;

public class SimplePizzaFactory {

    //this create method will be used by all clients to instantiate a new Pizza
    public Pizza createPizza(String type){
        Pizza pizza = null;
        //TODO: would it not better to use Enums?
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
