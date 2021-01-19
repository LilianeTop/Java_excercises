package DesignPatterns;

public class DuckCallerDevice{
    QuackBehavior quackBehavior;

    public DuckCallerDevice() {
        this.quackBehavior = new MuteQuack();
    }
}
