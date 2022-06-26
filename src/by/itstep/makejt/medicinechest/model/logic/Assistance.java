package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assistance {
    public static double calculateTotalPrice(Iterable<MedicineChestComponent> iterable) {
        Iterator<MedicineChestComponent> iterator = iterable.iterator();
        double total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }
        return total;
    }

    public static List<MedicineChestComponent> getExpiredMedicines(MedicineChest medicineChest) {
        List<MedicineChestComponent> list = new ArrayList<>();
        for (MedicineChestComponent component : medicineChest) {
            if (component instanceof Medicine && ((Medicine) component).getExpDate() < 2022) {
                list.add(component);
            }
        }
        return list;
    }

    public static List<MedicineChestComponent> getColdMedicines(MedicineChest medicineChest) {
        List<MedicineChestComponent> list = new ArrayList<>();
        for (MedicineChestComponent component : medicineChest) {
            if (component instanceof Medicine && ((Medicine) component).getPharmaGroup() == "febrifuge" &&
                    ((Medicine) component).getExpDate() >= 2022) {
                list.add(component);
            }
        }
        return list;
    }

    public static List<MedicineChestComponent> getNotUsefulnessItems(MedicineChest medicineChest) {
        List<MedicineChestComponent> list = new ArrayList<>();
        for (MedicineChestComponent component : medicineChest) {
            if (component instanceof Item && !((Item) component).isUsefulness()) {
                list.add(component);
            }
        }
        return list;
    }
}