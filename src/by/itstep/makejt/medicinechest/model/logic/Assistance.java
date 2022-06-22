package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
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
    

    public static List<Medicine> getExpiredMedicines(Iterable<Medicine> iterable) {
        Iterator<Medicine> iterator = iterable.iterator();
        List<Medicine> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Medicine temp = iterator.next();
            if (temp.getExpDate() < 2022) {
                list.add(temp);
            }
        }
        return list;
    }

    public static List<Medicine> getColdMedicines(Iterable<Medicine> iterable) {
        Iterator<Medicine> iterator = iterable.iterator();
        List<Medicine> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Medicine temp = iterator.next();
            if (temp.getPharmaGroup() == "febrifuge" &&
            temp.getExpDate() >= 2022) {
                list.add(temp);
            }
        }
        return list;
    }

    public static List<Item> getNotUsefulnessItems(Iterable<Item> iterable) {
        Iterator<Item> iterator = iterable.iterator();
        List<Item> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Item temp = iterator.next();
            if (temp.isUsefulness() == false) {
                list.add(temp);
            }
        }
        return list;
    }





}