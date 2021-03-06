package DesignPatterns.StrategyPattern;
/**
 * The Strategy Pattern defines a family of algorithms(behaviors)
 * encapsulates each one, and make them interchangeable.
 * Strategy lets the algorithms vary independently from clients that use it
 * */


public class StrategyExercise {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();

        mallardDuck.flyBehavior.fly();//these 2 have same output
        mallardDuck.performFly();

        Duck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.performFly();
        //here we change the flybehavior at runtime by using the setter
        wildDuck.setFlyBehavior(new FlyRocketPowered());
        wildDuck.performFly();
        //Implement the QuackBehavior interface
        DuckCallerDevice dc = new DuckCallerDevice();
        dc.quack();

        // now I can easily change the quacking at runtime form mute to squeak
        dc.setQuackBehavior(new Squeak());
        dc.quack();



    }
}
