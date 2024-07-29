package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("b001", "yellow", 5.0));
        bulldozers.add(new Bulldozer("b002", "orange",3.5));
        bulldozers.add(new Bulldozer("b003", "yellow",2.5));

        return bulldozers;
    }
}
