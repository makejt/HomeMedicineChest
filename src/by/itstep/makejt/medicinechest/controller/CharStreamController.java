package by.itstep.makejt.medicinechest.controller;


import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.CharStreamMedicineChestBuilder;
import by.itstep.makejt.medicinechest.model.util.MedicineChestFileNoFoundException;

public class CharStreamController extends MedicineChestController {
    @Override
    public MedicineChest createMedicineChest() {

        MedicineChest medicineChest = null;
        try {
            medicineChest = new CharStreamMedicineChestBuilder
                    ("C:/Test/charMedicineChest.txt").createMedicineChest();
        } catch (MedicineChestFileNoFoundException e) {
            System.out.println(e);
        }
        return medicineChest;
    }
}