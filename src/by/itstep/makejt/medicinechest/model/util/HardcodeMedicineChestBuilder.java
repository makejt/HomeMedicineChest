package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;

import java.util.ArrayList;

public class HardcodeMedicineChestBuilder {

    public static MedicineChest createMedicineChest() {

        Paracetamol paracetamol = new Paracetamol
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 1.2, 2020, 20,
                        Paracetamol.FormParacetamolType.PILL);

        Loperamide loperamide = new Loperamide
                (Medicine.MedicinePharmaGroupType.DIARRHEA, 8.1, 2024, 12, "Ukraine");

        Fenkarol fenkarol = new Fenkarol
                (Medicine.MedicinePharmaGroupType.ANTIHISTAMINE, 15, 2023, 10, 25);

        Augmentin augmentin = new Augmentin
                (Medicine.MedicinePharmaGroupType.ANTIBIOTIC, 25, 2020, 10, true);

        Euthyrox euthyrox = new Euthyrox
                (Medicine.MedicinePharmaGroupType.HORMONAL, 8.5, 2020, 100, 50);

        Herbion herbion = new Herbion
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 22, 2024, 1, true);

        Spazmalgon spazmalgon = new Spazmalgon
                (Medicine.MedicinePharmaGroupType.ANTISPASMODICS, 12, 2023, 20, 5);

        Teraflu teraflu = new Teraflu
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 2.5, 2024, 8, "lemon");

        Validol validol = new Validol
                (Medicine.MedicinePharmaGroupType.HEART, 2.5, 2025, 5, Validol.FormValidolType.CAPSULE);

        VitaminC vitaminC = new VitaminC
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 2.8, 2025, 100, "strawberry");

        Bandage bandage = new Bandage(2.5, true, 5);
        Cotton cotton = new Cotton(2, true, true);
        Plaster plaster = new Plaster(4.5, true, false, 1);
        Scissors scissors = new Scissors(10.5, true, 8);
        Thermometer thermometer = new Thermometer(35, false, Thermometer.ThermometerType.INFRARED);
        Tourniquet tourniquet = new Tourniquet(6, true, 0.5);

        Paracetamol paracetamol1 = new Paracetamol
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 1.2, 2024, 5,
                        Paracetamol.FormParacetamolType.CAPSULE);

        Loperamide loperamide1 = new Loperamide
                (Medicine.MedicinePharmaGroupType.DIARRHEA, 8.5, 2022, 1, "Ukraine");

        Fenkarol fenkarol1 = new Fenkarol
                (Medicine.MedicinePharmaGroupType.ANTIHISTAMINE, 17, 2021, 1, 30);

        Augmentin augmentin1 = new Augmentin
                (Medicine.MedicinePharmaGroupType.ANTIBIOTIC, 23.2, 2024, 2, false);

        Euthyrox euthyrox1 = new Euthyrox
                (Medicine.MedicinePharmaGroupType.HORMONAL, 8.5, 2024, 100, 100);

        Herbion herbion1 = new Herbion
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 25, 2024, 2, true);

        Spazmalgon spazmalgon1 = new Spazmalgon
                (Medicine.MedicinePharmaGroupType.ANTISPASMODICS, 12, 2021, 1, 5);

        Teraflu teraflu1 = new Teraflu
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 2.9, 2024, 1, "orange");

        Validol validol1 = new Validol
                (Medicine.MedicinePharmaGroupType.HEART, 2.5, 2025, 2, Validol.FormValidolType.PILL);

        VitaminC vitaminC1 = new VitaminC
                (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 2.8, 2024, 5, "orange");

        Bandage bandage1 = new Bandage(2.5, true, 8);
        Cotton cotton1 = new Cotton(2, true, false);
        Plaster plaster1 = new Plaster(5.5, true, true, 2);
        Scissors scissors1 = new Scissors(8.5, false, 5);
        Thermometer thermometer1 = new Thermometer(15, true, Thermometer.ThermometerType.MERCURY);
        Tourniquet tourniquet1 = new Tourniquet(6, true, 1);

        MedicineChest medicineChest = new MedicineChest(MedicineChest.Name.ADULT, new ArrayList<>());
        medicineChest.add(paracetamol);
        medicineChest.add(loperamide);
        medicineChest.add(fenkarol);
        medicineChest.add(augmentin);
        medicineChest.add(euthyrox);
        medicineChest.add(herbion);
        medicineChest.add(spazmalgon);
        medicineChest.add(teraflu);
        medicineChest.add(validol);
        medicineChest.add(vitaminC);
        medicineChest.add(bandage);
        medicineChest.add(cotton);
        medicineChest.add(plaster);
        medicineChest.add(scissors);
        medicineChest.add(thermometer);
        medicineChest.add(tourniquet);
        medicineChest.add(paracetamol1);
        medicineChest.add(loperamide1);
        medicineChest.add(fenkarol1);
        medicineChest.add(augmentin1);
        medicineChest.add(euthyrox1);
        medicineChest.add(herbion1);
        medicineChest.add(spazmalgon1);
        medicineChest.add(teraflu1);
        medicineChest.add(validol1);
        medicineChest.add(vitaminC1);
        medicineChest.add(bandage1);
        medicineChest.add(cotton1);
        medicineChest.add(plaster1);
        medicineChest.add(scissors1);
        medicineChest.add(thermometer1);
        medicineChest.add(tourniquet1);

        return medicineChest;
    }
}