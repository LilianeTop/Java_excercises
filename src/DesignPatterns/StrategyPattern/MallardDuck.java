package DesignPatterns.StrategyPattern;

public class MallardDuck extends Duck{
    //when a new Mallard Duck is created the quackBehaviour will be set to Quack
    //and the flyBehavior will be set to FLyWithWIngs at runtime

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();

    }

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        System.out.println("I am a Mallard duck");
    }

    @Override
    public void performFly() {
        flyBehavior.fly();

    }
}
