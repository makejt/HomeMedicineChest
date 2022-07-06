package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.RandomMedicineChestBuilder;

public class RandomController extends MedicineChestController{
    @Override
    public MedicineChest createMedicineChest() {
        return RandomMedicineChestBuilder.createMedicineChest();
    }
}