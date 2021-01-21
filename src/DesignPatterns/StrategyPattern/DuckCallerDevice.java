package DesignPatterns.StrategyPattern;

public class DuckCallerDevice implements QuackBehavior{
    QuackBehavior quackBehavior;
    public DuckCallerDevice() {
        quackBehavior = new MuteQuack();
    }

    @Override
    public void quack() {
        quackBehavior.quack();

    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
