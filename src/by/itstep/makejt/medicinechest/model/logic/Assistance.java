package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assistance {

    public static double calculateTotalPrice(Iterable<Medicine> iterable) {

        Iterator<Medicine> iterator = iterable.iterator();
        double total = 0;

        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }
        return total;
    }

// не работает с динамик массив
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
            if (temp.getPharmGroup() == "febrifuge" &&
            temp.getExpDate() >= 2022) {
                list.add(temp);
            }
        }
        return list;
    }

}
