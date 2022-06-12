package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

public interface MedicineChest{
    int size();
    Medicine get(int index);
    void set(int index, Medicine medicine);
    void add(Medicine medicine);
    void remove(int index);
}
