package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;

import java.util.Comparator;

public class MedicinesSorter {

    public static void sort(MedicineChest medicineChest, Comparator<MedicineChestComponent> comparator) {
        for (int i = 0; i < medicineChest.size() - 1; i++) {
            for (int j = 0; j < medicineChest.size() - 1 - i; j++) {
                if (comparator.compare(medicineChest.get(j), medicineChest.get(j + 1)) > 0) {
                    MedicineChestComponent temp = medicineChest.get(j);
                    medicineChest.set(j, medicineChest.get(j + 1));
                    medicineChest.set(j + 1, temp);
                }
            }
        }
    }
}