package by.itstep.makejt.medicinechest.model.logic.SortStrategy;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public interface MedicinesSortable {

    boolean compare(Medicines medicines1, Medicines medicines2);
}