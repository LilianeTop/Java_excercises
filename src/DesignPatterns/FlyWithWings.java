package DesignPatterns;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly as I have wings");
    }
}
