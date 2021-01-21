package DesignPatterns.FactoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public Pizza() {
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void cut() {
        System.out.println("Cutting the pizza in diagonals");
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings){
            System.out.println(" " + topping);
        }
    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }
}
