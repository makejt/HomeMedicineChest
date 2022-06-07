package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.ListMedicineChest;

import java.util.Iterator;

public class ListMedicineChestIterator implements Iterator<Medicines> {

    private ListMedicineChest medicineChest;
    private int current;

    public ListMedicineChestIterator(ListMedicineChest medicineChest) {
        this.medicineChest = medicineChest;
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
