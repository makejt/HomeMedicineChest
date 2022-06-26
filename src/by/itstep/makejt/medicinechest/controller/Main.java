package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.logic.Assistance;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.HardcodeMedicineChestBuilder;
import by.itstep.makejt.medicinechest.model.util.RandomMedicineChestBuilder;
import by.itstep.makejt.medicinechest.view.Printer;

public class Main {

    public static void main(String[] args) {

        MedicineChest medicineChest1 = RandomMedicineChestBuilder.createMedicineChest();
        Printer.print(medicineChest1 + "");

        MedicineChest medicineChest = HardcodeMedicineChestBuilder.createMedicineChest();
        Printer.print("medicineChest:" + medicineChest);

        // get cold medicines from Medicine chest
        Printer.print("Cold medicines: " + "\n" + Assistance.getColdMedicines(medicineChest) + "\n" + "\n");

        // get expired medicines from Medicine chest
        Printer.print("Expired medicines: " + "\n" + Assistance.getExpiredMedicines(medicineChest) + "\n" + "\n");

        // get cold medicines from Medicine chest
        Printer.print("Cold medicines: " + "\n" + Assistance.getColdMedicines(medicineChest) + "\n" + "\n");

        // get not usefulness items from Medicine chest
        Printer.print("Not usefulness items: " + "\n" + Assistance.getNotUsefulnessItems(medicineChest) + "\n" + "\n");

        // get total price of medicine chest component
        double price = Assistance.calculateTotalPrice(medicineChest);
        Printer.print("\nTotal price of all medicine chest components: " + price);
    }
}