package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;

public class Assistance {

    public static double calculateTotalPrice (MedicineChest medicineChest){
        double total = 0;

        for (int i = 0; i < medicineChest.getMedicinesCount(); i++) {
            total += medicineChest.getMedicines(i).getPrice();
        }
        return total;
    }
}
