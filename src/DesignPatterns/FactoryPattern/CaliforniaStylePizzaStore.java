package DesignPatterns.FactoryPattern;

public class CaliforniaStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        } else if (type.equals("clam")){
            return new CaliforniaStyleClamPizza();
        } else if (type.equals("veggie")){
            return new CaliforniaStyleVeggiePizza();
        } else return null;

    }
}
