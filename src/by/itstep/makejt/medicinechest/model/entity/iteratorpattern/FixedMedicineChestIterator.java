package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.FixedMedicineChest;

import java.util.Iterator;

public class FixedMedicineChestIterator implements Iterator<Medicines> {

    private FixedMedicineChest medicineChest;
    private int current;

    public FixedMedicineChestIterator(FixedMedicineChest medicineChest) {
        this.medicineChest = medicineChest;
        current = 0;
    }

    @Override
    public Medicines next() {
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
