package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(5.0, 0.8));
        excavators.add(new Excavator(7.0, 0.5));
        excavators.add(new Excavator(8.5, 0.4));

        return excavators;
    }

}
