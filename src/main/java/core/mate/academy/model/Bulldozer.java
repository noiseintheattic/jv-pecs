package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double dozingWidth;

    public Bulldozer() {
    }

    public Bulldozer(double dozingWidth) {
        this.dozingWidth = dozingWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getDozingWidth() {
        return dozingWidth;
    }

    public Bulldozer setDozingWidth(int dozingWidth) {
        this.dozingWidth = dozingWidth;
        return this;
    }
}
