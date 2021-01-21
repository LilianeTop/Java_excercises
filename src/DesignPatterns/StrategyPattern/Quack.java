package DesignPatterns.StrategyPattern;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
