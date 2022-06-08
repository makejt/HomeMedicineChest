package by.itstep.makejt.medicinechest.model.logic.SortStrategy;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

import java.util.Comparator;

public class SortByExpDateAsc implements Comparator<Medicines> {

    public int compare(Medicines medicines1, Medicines medicines2) {
        return medicines1.getExpDate() - medicines2.getExpDate();
    }
}