package DesignPatterns;

public class WildDuck extends Duck{
    public WildDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        System.out.println("I'm a wild duck");
    }
}
