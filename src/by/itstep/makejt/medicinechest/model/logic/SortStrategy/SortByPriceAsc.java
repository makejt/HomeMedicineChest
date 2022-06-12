package by.itstep.makejt.medicinechest.model.logic.SortStrategy;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Comparator;

public class SortByPriceAsc implements Comparator<Medicine> {

    public int compare(Medicine medicines1, Medicine medicines2) {
        return (int)medicines1.getPrice() - (int)medicines2.getPrice();
    }
}
