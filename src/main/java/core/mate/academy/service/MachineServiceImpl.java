package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {

        if (type.equals(Bulldozer.class)) {
            MachineProducer<Bulldozer> producer = new BulldozerProducerImpl();
            return new ArrayList<>(producer.get());
        } else if (type.equals(Excavator.class)) {
            MachineProducer<Excavator> producer = new ExcavatorProducerImpl();
            return new ArrayList<>(producer.get());
        } else if (type.equals(Truck.class)) {
            MachineProducer<Truck> producer = new TruckProducerImpl();
            return new ArrayList<>(producer.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<Machine> machines) {
    }
}
