package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import java.util.Comparator;

public class SortMedicineComponentDesc implements Comparator<MedicineChestComponent> {
    public int compare(MedicineChestComponent c1, MedicineChestComponent c2) {

        int result = Double.compare(c2.getPrice(), c1.getPrice());

        if (result == 0 && c1 instanceof Medicine && c2 instanceof Medicine) {
            result = ((Medicine) c2).getPharmaGroup().compareTo(((Medicine) c1).getPharmaGroup());
            if (result == 0) {
                result = ((Medicine) c2).getExpDate() - ((Medicine) c1).getExpDate();
            }
            if (result == 0) {
                result = ((Medicine) c2).getCount() - ((Medicine) c1).getCount();
            } else if (result == 0 && c1 instanceof Item && c2 instanceof Item) {
                result = Boolean.compare(((Item) c2).isUsefulness(), ((Item) c1).isUsefulness());
            }
        }
        return result;
    }
}
