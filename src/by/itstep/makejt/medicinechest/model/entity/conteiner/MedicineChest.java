package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public interface MedicineChest {
    int size();
    Medicines get(int index);
}
