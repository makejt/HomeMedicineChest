package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Comparator;

public class SortMedicineAsc implements Comparator<Medicine> {

    @Override
    public int compare(Medicine o1, Medicine o2) {
        int result = Double.compare(o1.getPrice(), o2.getPrice());
        if (result == 0) {
            result = o1.getExpDate() - o2.getExpDate();
        }
        if (result == 0) {
            result = o1.getPharmaGroup().compareTo(o2.getPharmaGroup());
        }
        if (result == 0) {
            result = o1.getCount() - o2.getCount();
        }
        return result;
    }
}
