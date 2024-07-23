package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducerImpl implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();

        bulldozers.add(new Bulldozer(5.0));
        bulldozers.add(new Bulldozer(3.5));
        bulldozers.add(new Bulldozer(2.5));

        return bulldozers;
    }
}
