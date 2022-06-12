package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;
import by.itstep.makejt.medicinechest.model.entity.conteiner.DynamicMedicineChest;
import by.itstep.makejt.medicinechest.model.logic.Assistance;

public class Main {
    public static void main(String[] args) {


        Paracetamol p = Paracetamol.SYRUP;
        p.setCount(10);
        p.setExpDate(2025);
//        p.setPharmGroup("febrifuge");
        p.setPrice(2.50);

        System.out.println(p);

        Paracetamol paracetamol1 =
                new Paracetamol("febrifuge", 1.5, 2020, 10, "pill");
        Paracetamol paracetamol2 =
                new Paracetamol("febrifuge", 5.5, 2024, 1, "suspension");
        Loperamide loperamide =
                new Loperamide("antidiarrhoeal", 7.5, 2, 2023, 15,"Ukraine");
        Fenkarol fenkarol1 =
                new Fenkarol("antihistamine", 4.5, 25, 20, 2025);
        Fenkarol fenkarol2 =
                new Fenkarol("antihistamine", 4.5, 35, 20, 2022);


        DynamicMedicineChest medicineChest2 = new DynamicMedicineChest();
        medicineChest2.add(paracetamol1);
        medicineChest2.add(paracetamol2);
        medicineChest2.add(loperamide);
        medicineChest2.add(fenkarol1);
        medicineChest2.add(fenkarol2);
        System.out.println(medicineChest2);


        // get expired medicines - неверно работает c FixedMedicineChest, exception с TreeSet
        System.out.println("Expired medicines: " + Assistance.getExpiredMedicines(medicineChest2) + "\n");

        // get cold medicines - добавляет только 1 препарат
        System.out.println("Cold medicines: " + Assistance.getColdMedicines(medicineChest2) + "\n");

//
//
// // TreeSet с компоратором SortDesc - верно сортирует по убыванию, без компоратора - неверно
//        Set<Medicines> medicineChest = new TreeSet<>(new SortDesc());
//        Collections.addAll(medicineChest, loperamide, paracetamol1, paracetamol2, fenkarol1, fenkarol2);
//
//        System.out.println("Medicine chest: " + "\n" + medicineChest);
//
//
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
//        // get expired medicines - неверно работает c FixedMedicineChest, exception с TreeSet
//        System.out.println("Expired medicines: " + Assistance.getExpiredMedicines(medicineChest1) + "\n");
//
//        // get cold medicines - добавляет только 1 препарат
//        System.out.println("Cold medicines: " + Assistance.getColdMedicines(medicineChest) + "\n");
//
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
//
    }
}