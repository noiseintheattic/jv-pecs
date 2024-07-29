package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Truck> {

    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();

        trucks.add(new Truck("tr001", "white",20.0));
        trucks.add(new Truck("tr002", "pink",15.5));
        trucks.add(new Truck("tr003", "green",37.5));

        return trucks;
    }
}
