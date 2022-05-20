package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.DynamicMedicineChest;

public class DynamicMedicineChestIterator implements MyIterator{

    private DynamicMedicineChest medicineChest;
    private int current;


   public DynamicMedicineChestIterator (DynamicMedicineChest medicineChest) {
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

    @Override
    public void reset() {
        current = 0;
    }
}
