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

    public Bulldozer(String name, String color, double dozingWidth) {
        super(name, color);
        this.dozingWidth = dozingWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getDozingWidth() {
        return dozingWidth;
    }

    public void setDozingWidth(double dozingWidth) {
        this.dozingWidth = dozingWidth;

    }
}
