package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.conteiner.FixedMedicineChest;

import java.util.Iterator;

public class FixedMedicineChestIterator implements Iterator<Medicine> {

    private FixedMedicineChest medicineChest;
    private int current;

    public FixedMedicineChestIterator(FixedMedicineChest medicineChest) {
        this.medicineChest = medicineChest;
        current = 0;
    }

    @Override
    public Medicine next() {
        return medicineChest.get(current++);
    }

    @Override
    public boolean hasNext() {
        return current < medicineChest.size();
    }

    public void reset() {
        current = 0;
    }
}
