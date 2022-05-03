package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;

public class Assistance {

    public static double calculateTotalPrice (MedicineChest medicineChest){
        double total = 0;

        for (int i = 0; i < medicineChest.getCountOfParacetamol(); i++) {
            total += medicineChest.getParacetamol(i).getPrice();
        }

        for (int i = 0; i < medicineChest.getCountOfLoperamide(); i++) {
            total += medicineChest.getLoperamide(i).getPrice();
        }

        for (int i = 0; i < medicineChest.getCountOfFenkarol(); i++) {
            total += medicineChest.getFenkarol(i).getPrice();
        }

        return total;
    }
}
