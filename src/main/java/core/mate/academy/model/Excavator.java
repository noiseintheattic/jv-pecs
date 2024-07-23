package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double excavatorReach;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(double excavatorReach, double bucketCapacity) {
        this.excavatorReach = excavatorReach;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getExcavatorReachInMeters() {
        return excavatorReach;
    }

    public Excavator setExcavatorReachInMeters(int excavatorReachInMeters) {
        this.excavatorReach = excavatorReachInMeters;
        return this;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public Excavator setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
        return this;
    }
}
