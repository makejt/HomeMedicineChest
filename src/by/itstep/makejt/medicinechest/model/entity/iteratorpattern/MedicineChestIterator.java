package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;

import java.util.Iterator;

public class MedicineChestIterator implements Iterator<MedicineChestComponent> {


    private MedicineChest medicineChest;
    private int current;

    public MedicineChestIterator(MedicineChest medicineChest) {
        this.medicineChest = medicineChest;
    }

    @Override
    public boolean hasNext() {
        return current < medicineChest.size();
    }

    @Override
    public MedicineChestComponent next() {
        return medicineChest.get(current++);
    }

    public void reset() {
        current = 0;
    }
}