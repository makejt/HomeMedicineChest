package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

import java.util.Comparator;

public class SortDesc implements Comparator<Medicines> {
    @Override
    public int compare(Medicines o1, Medicines o2) {
        int result = Double.compare(o2.getPrice(), o1.getPrice());
        if (result == 0) {
            result = o2.getExpDate() - o1.getExpDate();
        }
        if (result == 0) {
            result = o2.getPharmGroup().compareTo(o1.getPharmGroup());
        }
        return result;
    }
}
