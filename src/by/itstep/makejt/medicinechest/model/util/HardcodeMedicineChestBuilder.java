package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.comparators.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;

import java.util.ArrayList;

public class HardcodeMedicineChestBuilder {

    public static MedicineChest createMedicineChest() {

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

        MedicineChest medicineChest = new MedicineChest(new ArrayList<>(), MedicineChest.Name.ADULT);
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

        return medicineChest;
    }
}