package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.FixedMedicineChest;

public class FixedMedicineChestIterator implements MyIterator {

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

    @Override
    public void reset() {
        current = 0;
    }
}
