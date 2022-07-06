package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import org.apache.log4j.Logger;

import java.util.*;

public class Assistance {

    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }

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
            if (component instanceof Medicine && ((Medicine) component).getPharmaGroup() ==
                    Medicine.MedicinePharmaGroupType.FEBRIFUGE && ((Medicine) component).getExpDate() >= 2022) {
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

    public static void cleanMedicineChest(MedicineChest medicineChest) {
        Iterator<MedicineChestComponent> iterator = medicineChest.iterator();
        while (iterator.hasNext()) {
            MedicineChestComponent temp = iterator.next();
            if (temp instanceof Item && !((Item) temp).isUsefulness() ||
                    temp instanceof Medicine && ((Medicine) temp).getExpDate() < 2022) {
                iterator.remove();
            }
        }
    }

    public static List<MedicineChestComponent> getShoppingList(MedicineChest medicineChest) {
        List<MedicineChestComponent> list = new ArrayList<>();
        for (MedicineChestComponent component : medicineChest) {
            if (component instanceof Item && !((Item) component).isUsefulness() ||
                    component instanceof Medicine && ((Medicine) component).getCount() < 2) {
                list.add(component);
            }
        }
        return list;
    }
}