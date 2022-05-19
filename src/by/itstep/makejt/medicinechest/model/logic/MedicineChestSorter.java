package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.DynamicMedicineChest;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.MedicinesSortable;

public class MedicineChestSorter {

    public static void sort(DynamicMedicineChest medicineChest, MedicinesSortable sortable) {
        for (int i = 0; i < medicineChest.size() - 1; i++) {
            for (int j = 0; j < medicineChest.size() - 1 - i; j++) {
                if (sortable.compare(medicineChest.get(j), medicineChest.get(j + 1))) {
                    Medicines temp = medicineChest.get(j);
                    medicineChest.set(j, medicineChest.get(j + 1));
                    medicineChest.set(j + 1, temp);
                }
            }
        }
    }
}