package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.comparators.SortMedicineComponentDesc;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.logic.Assistance;
import by.itstep.makejt.medicinechest.model.logic.MedicinesSorter;
import by.itstep.makejt.medicinechest.view.Printer;

public abstract class MedicineChestController {


    public abstract MedicineChest createMedicineChest();
    public void doIt() {
        MedicineChest medicineChest = createMedicineChest();

     MedicinesSorter.sort(medicineChest, new SortMedicineComponentDesc());

        Printer.print(medicineChest + "\n");

        double price = Assistance.calculateTotalPrice(medicineChest);

        Printer.print("Total price of all medicine chest components: " + price + "\n" + "\n");

        // get cold medicines from Medicine chest
        Printer.print("Cold medicines: " + "\n" + Assistance.getColdMedicines(medicineChest) + "\n" + "\n");

        // get expired medicines from Medicine chest
        Printer.print("Expired medicines: " + "\n" + Assistance.getExpiredMedicines(medicineChest) + "\n" + "\n");

        // get not usefulness items from Medicine chest
        Printer.print("Not usefulness items: " + "\n" + Assistance.getNotUsefulnessItems(medicineChest) + "\n" + "\n");

        // get a shopping list of unusable items and medicines with a quantity of less than 2 pieces
        Printer.print("Shopping list: " + "\n" + Assistance.getShoppingList(medicineChest) + "\n" + "\n");

        Assistance.cleanMedicineChest(medicineChest);

        Printer.print("MedicineChest after cleaning: " + "\n" + medicineChest + "\n" + "\n");

        double price1 = Assistance.calculateTotalPrice(medicineChest);

        Printer.print("Total price of all medicine chest components after cleaning: " + price1 + "\n" + "\n");
    }
}