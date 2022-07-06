package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.HardcodeMedicineChestBuilder;

public class HardcodeController extends MedicineChestController{
    @Override
    public MedicineChest createMedicineChest() {
        return HardcodeMedicineChestBuilder.createMedicineChest();
    }
}
