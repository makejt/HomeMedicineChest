package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.ByteStreamMedicineChestBuilder;
import by.itstep.makejt.medicinechest.model.util.MedicineChestFileNoFoundException;

public class ByteStreamController extends MedicineChestController{
    @Override
    public MedicineChest createMedicineChest() {

        MedicineChest medicineChest = null;
         try {
             medicineChest =
                     new ByteStreamMedicineChestBuilder("C:/Test/byteMedicineChest.txt").createMedicineChest();
         } catch (MedicineChestFileNoFoundException e) {
             System.out.println(e);
         }
         return medicineChest;
    }
}