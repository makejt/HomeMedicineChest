package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.SerializableMedicineChestBuilder;

public class SerializableController extends MedicineChestController{
    @Override
    public MedicineChest createMedicineChest() {
        return SerializableMedicineChestBuilder.read();
    }
}