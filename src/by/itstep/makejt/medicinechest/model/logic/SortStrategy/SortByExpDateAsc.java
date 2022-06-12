package by.itstep.makejt.medicinechest.model.logic.SortStrategy;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Comparator;

public class SortByExpDateAsc implements Comparator<Medicine> {

    public int compare(Medicine medicines1, Medicine medicines2) {
        return medicines1.getExpDate() - medicines2.getExpDate();
    }
}