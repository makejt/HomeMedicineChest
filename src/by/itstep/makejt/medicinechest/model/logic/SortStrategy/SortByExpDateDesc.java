package by.itstep.makejt.medicinechest.model.logic.SortStrategy;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class SortByExpDateDesc implements MedicinesSortable {

    public boolean compare(Medicines medicines1, Medicines medicines2){
        return medicines1.getExpDate() < medicines2.getExpDate();
    }
}