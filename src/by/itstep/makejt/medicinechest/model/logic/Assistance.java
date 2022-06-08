package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assistance {

    public static double calculateTotalPrice(Iterable<Medicines> iterable) {

        Iterator<Medicines> iterator = iterable.iterator();
        double total = 0;
        while (iterator.hasNext()) {
            total += iterator.next().getPrice();
        }
        return total;
    }


    public static List<Medicines> getExpiredMedicines(Iterable<Medicines> iterable) {
        Iterator<Medicines> iterator = iterable.iterator();
        List<Medicines> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Medicines temp = iterator.next();
            if (temp.getExpDate() < 2022) {
                list.add(temp);
            }
        }

        return list;
    }

    // для водителя аптечка, сколько денег


    public static List<Medicines> getColdMedicines(Iterable<Medicines> iterable) {
        Iterator<Medicines> iterator = iterable.iterator();
        List<Medicines> list = new ArrayList<>();
        while (iterator.hasNext()) {
            Medicines temp = iterator.next();
            if (iterator.next().getPharmGroup() == "febrifuge" ||
            iterator.next().getExpDate() >= 2022) {
                list.add(iterator.next());
            }
        }
        return list;
    }

}
