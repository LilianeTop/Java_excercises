package DesignPatterns.FactoryPattern;

//the subclass is fully responsible for which concrete pizza is instantiates
//by extending PizzaStore it inherits the final orderPizza() method
public class NYStylePizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        } else if (type.equals("clam")){
            return new NYStyleClamPizza();
        } else if (type.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
