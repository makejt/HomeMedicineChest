package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.MedicinesSortable;

public class MedicineChestSorter {

    public static void sort(MedicineChest medicineChest, MedicinesSortable sortable) {
        for (int i = 0; i < medicineChest.getMedicinesCount() - 1; i++) {
            for (int j = 0; j < medicineChest.getMedicinesCount() - 1 - i; j++) {
                if (sortable.compare(medicineChest.getMedicines(j), medicineChest.getMedicines(j + 1))) {
                    Medicines temp = medicineChest.getMedicines(j);
                    medicineChest.setMedicines(j, medicineChest.getMedicines(j + 1));
                    medicineChest.setMedicines(j + 1, temp);
                }
            }
        }
    }
}