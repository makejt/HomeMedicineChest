package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.logic.Assistance;

public class Main {
    public static void main(String[] args) {

        Paracetamol paracetamol1 = new Paracetamol("febrifuge", 1.5, 3, 2024);
        Paracetamol paracetamol2 = new Paracetamol("febrifuge", 1.5, 1, 2025);

        Loperamide loperamide = new Loperamide("antidiarrhoeal", 3.5, 2, 2, 2023,
                "Ukraine");

        Fenkarol fenkarol = new Fenkarol("antihistamine", 12, 25, 20, 2024);

        MedicineChest medicineChest = new MedicineChest();
        medicineChest.addParacetamol(paracetamol1);
        medicineChest.addParacetamol(paracetamol2);
        medicineChest.addLoperamide(loperamide);
        medicineChest.addFenkarol(fenkarol);
        System.out.println(medicineChest);

        double price = Assistance.calculateTotalPrice(medicineChest);
        System.out.println("\nTotal price of all medicines: " + price);
    }
}
