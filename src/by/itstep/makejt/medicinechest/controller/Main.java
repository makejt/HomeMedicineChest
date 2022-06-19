package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import by.itstep.makejt.medicinechest.model.entity.comparators.*;
import by.itstep.makejt.medicinechest.model.entity.conteiner.*;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;
import by.itstep.makejt.medicinechest.model.logic.*;
import by.itstep.makejt.medicinechest.view.Printer;

public class Main {
    public static void main(String[] args) {

        Paracetamol paracetamol = new Paracetamol
                (Medicine.PharmaGroup.FEBRIFUGE, 1.2, 2020, 20, Paracetamol.Form.PILL);


        Loperamide loperamide = new Loperamide
                (Medicine.PharmaGroup.DIARRHEA, 8.1, 2024, 12, "Ukraine");

        Fenkarol fenkarol = new Fenkarol
                (Medicine.PharmaGroup.ANTIHISTAMINE, 15, 2023, 10, 25);

        Augmentin augmentin = new Augmentin
                (Medicine.PharmaGroup.ANTIBIOTIC, 25, 2020, 10, true);

        Euthyrox euthyrox = new Euthyrox
                (Medicine.PharmaGroup.HORMONAL, 8.5, 2020, 100, 50);

        Herbion herbion = new Herbion
                (Medicine.PharmaGroup.FEBRIFUGE, 22, 2024, 1, true);

        Spazmalgon spazmalgon = new Spazmalgon
                (Medicine.PharmaGroup.ANTISPASMODICS, 12, 2023, 20, 5);

        Teraflu teraflu = new Teraflu
                (Medicine.PharmaGroup.FEBRIFUGE, 2.5, 2024, 8, "lemon");

        Validol validol = new Validol
                (Medicine.PharmaGroup.HEART, 2.5, 2025, 5, Validol.FORM.PILL);

        VitaminC vitaminC = new VitaminC
                (Medicine.PharmaGroup.FEBRIFUGE, 2.8, 2025, 100, "strawberry");

        Bandage bandage = new Bandage(2.5, true, 5);
        Cotton cotton = new Cotton(2, true, true);
        Plaster plaster = new Plaster(4.5, true, false, 1);
        Scissors scissors = new Scissors(10.5, true, 8);
        Thermometer thermometer = new Thermometer(35, false, Thermometer.Type.INFRARED);
        Tourniquet tourniquet = new Tourniquet(6, true, 0.5);

        // add medicines in Medicine section
        MedicinesSection section1 = new MedicinesSection();
        section1.add(paracetamol);
        section1.add(fenkarol);
        section1.add(validol);
        section1.add(teraflu);
        section1.add(augmentin);

        MedicinesSorter.sort(section1, new SortMedicineAsc());

        // add items in Item section
        ItemsSection section2 = new ItemsSection();
        section2.add(scissors);
        section2.add(thermometer);

        // create medicine chest for adults, included Medicine section1 and Item section2

        MedicineChest medicineChest = new MedicineChest(section1, section2, MedicineChest.Name.ADULT);

        Printer.print(medicineChest + "\n" + "\n");


        // get expired medicines from Medicine section1
        Printer.print("Expired medicines: " + "\n" + Assistance.getExpiredMedicines(section1) + "\n" + "\n" );

        // get cold medicines from Medicine section1
        Printer.print("Cold medicines: " + "\n" + Assistance.getColdMedicines(section1) + "\n" + "\n");

        // get not usefulness items from Item section2
        Printer.print("Not usefulness items: " + "\n" + Assistance.getNotUsefulnessItems(section2) + "\n" + "\n");

        // get total price of medicine chest component
        double price = Assistance.calculateTotalPrice(section1, section2);
        Printer.print("\nTotal price of all medicine chest components: " + price);

        // get total price of all medicines from Medicine sector
        double price1 = Assistance.calculateTotalPriceOfMedicines(section1);
        Printer.print("\nTotal price of all medicines: " + price1);

        // get total price of all items from Item sector
        double price2 = Assistance.calculateTotalPriceOfItems(section2);
        Printer.print("\nTotal price of all items: " + price2);

    }
}