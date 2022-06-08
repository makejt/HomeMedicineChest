package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;
import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.comparators.SortDesc;
import by.itstep.makejt.medicinechest.model.entity.conteiner.DynamicMedicineChest;
import by.itstep.makejt.medicinechest.model.entity.conteiner.FixedMedicineChest;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.logic.Assistance;
import by.itstep.makejt.medicinechest.model.logic.MedicineChestSorter;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.SortByExpDateDesc;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.SortByPriceAsc;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Paracetamol paracetamol1 = new Paracetamol("febrifuge", 1.5, 5, 2020);
        Paracetamol paracetamol2 = new Paracetamol("febrifuge", 5.5, 3, 2024);

        Loperamide loperamide = new Loperamide("antidiarrhoeal", 7.5, 2, 2, 2023,
                "Ukraine");

        Fenkarol fenkarol1 = new Fenkarol("antihistamine", 4.5, 25, 20, 2025);
        Fenkarol fenkarol2 = new Fenkarol("antihistamine", 4.5, 35, 20, 2022);


 // TreeSet с компоратором SortDesc - верно сортирует по убыванию, без компоратора - неверно
        Set<Medicines> medicineChest = new TreeSet<>();
        Collections.addAll(medicineChest, loperamide, paracetamol1, paracetamol2, fenkarol1, fenkarol2);

        System.out.println("Medicine chest: " + "\n" + medicineChest);

//        // get total price of medicines - работает
//        double price = Assistance.calculateTotalPrice(medicineChest);
//        System.out.println("\nTotal price of all medicines: " + price + "\n");
//
//        FixedMedicineChest medicineChest1 = new FixedMedicineChest();
//        medicineChest1.add(loperamide);
//        medicineChest1.add(paracetamol1);
//        medicineChest1.add(paracetamol2);
//        medicineChest1.add(fenkarol1);
//        medicineChest1.add(fenkarol2);
//
        // get expired medicines - неверно работает c FixedMedicineChest, exception с TreeSet
        System.out.println("Expired medicines: " + Assistance.getExpiredMedicines(medicineChest) + "\n");
//
//        // get cold medicines - добавляет только 1 препарат
        System.out.println("Cold medicines: " + Assistance.getColdMedicines(medicineChest) + "\n");
//
//        // ascending sorting by price - не работает на TreeSet
//        MedicineChestSorter.sort(medicineChest1, new SortByPriceAsc());
//        System.out.print("\nAfter ascending sorting by price - ");
//        System.out.println(medicineChest1);
//
//        // descending sorting by expiration date
//        MedicineChestSorter.sort(medicineChest1, new SortByExpDateDesc());
//        System.out.print("\nAfter descending sorting by expiration date - ");
//        System.out.println(medicineChest1);

    }
}