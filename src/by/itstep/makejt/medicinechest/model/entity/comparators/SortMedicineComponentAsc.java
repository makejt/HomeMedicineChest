package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import java.util.Comparator;
public class SortMedicineComponentAsc implements Comparator<MedicineChestComponent> {
    @Override
    public int compare(MedicineChestComponent c1, MedicineChestComponent c2) {

        int result = Double.compare(c1.getPrice(), c2.getPrice());

        if (result == 0 && c1 instanceof Medicine && c2 instanceof Medicine) {
            result = ((Medicine) c1).getPharmaGroup().compareTo(((Medicine) c2).getPharmaGroup());
            if (result == 0) {
                result = ((Medicine) c1).getExpDate() - ((Medicine) c2).getExpDate();
            }
            if (result == 0) {
                result = ((Medicine) c1).getCount() - ((Medicine) c2).getCount();
            } else if (result == 0 && c1 instanceof Item && c2 instanceof Item) {
                result = Boolean.compare(((Item) c1).isUsefulness(), ((Item) c2).isUsefulness());
            }
        }
        return result;
    }
}