package DesignPatterns.StrategyPattern;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly as I have wings");
    }
}
