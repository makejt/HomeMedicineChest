package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Comparator;

public class SortDesc implements Comparator<Medicine> {
    @Override
    public int compare(Medicine o1, Medicine o2) {
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
