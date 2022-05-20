package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;
import by.itstep.makejt.medicinechest.model.entity.conteiner.FixedMedicineChest;
import by.itstep.makejt.medicinechest.model.entity.conteiner.ListMedicineChest;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.FixedMedicineChestIterator;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.Iterable;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.ListMedicineChestIterator;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.MyIterator;
import by.itstep.makejt.medicinechest.model.logic.Assistance;
import by.itstep.makejt.medicinechest.model.logic.MedicineChestSorter;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.SortByExpDateDesc;
import by.itstep.makejt.medicinechest.model.logic.SortStrategy.SortByPriceAsc;

public class Main {
    public static void main(String[] args) {

        Paracetamol paracetamol1 = new Paracetamol("febrifuge", 1.7, 3, 2024);
        Paracetamol paracetamol2 = new Paracetamol("febrifuge", 1.5, 1, 2025);

        Loperamide loperamide = new Loperamide("antidiarrhoeal", 3.5, 2, 2, 2023,
                "Ukraine");

        Fenkarol fenkarol = new Fenkarol("antihistamine", 12, 25, 20, 2024);

        ListMedicineChest medicineChest = new ListMedicineChest();

        medicineChest.add(paracetamol1);
        medicineChest.add(loperamide);
        medicineChest.add(fenkarol);

//        MyIterator iterator = new ListMedicineChestIterator(medicineChest);
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        iterator.reset();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        iterator.reset();


        System.out.println(medicineChest);

        double price = Assistance.calculateTotalPrice(medicineChest);
        System.out.println("\nTotal price of all medicines: " + price);

        medicineChest.add(paracetamol2);

        System.out.println(medicineChest);

        double price1 = Assistance.calculateTotalPrice(medicineChest);
        System.out.println("\nTotal price of all medicines: " + price1);


//        for (int i = 0; i < medicineChest.size() ; i++) {
//            System.out.println(medicineChest.get(i));
//        }

//        MedicineChestSorter.sort(medicineChest, new SortByPriceAsc());
//        System.out.print("\nAfter ascending sorting by price - ");
//        System.out.println(medicineChest);
//
//        MedicineChestSorter.sort(medicineChest, new SortByExpDateDesc());
//        System.out.print("\nAfter descending sorting by expiration date - ");
//        System.out.println(medicineChest);
    }
}