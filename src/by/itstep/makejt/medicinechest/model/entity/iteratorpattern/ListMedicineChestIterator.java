package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.conteiner.ListMedicineChest;

import java.util.Iterator;

public class ListMedicineChestIterator implements Iterator<Medicine> {

    private ListMedicineChest medicineChest;
    private int current;

    public ListMedicineChestIterator(ListMedicineChest medicineChest) {
        this.medicineChest = medicineChest;
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
