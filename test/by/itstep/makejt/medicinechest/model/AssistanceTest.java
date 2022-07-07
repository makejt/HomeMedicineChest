package by.itstep.makejt.medicinechest.model;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;
import by.itstep.makejt.medicinechest.model.logic.Assistance;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AssistanceTest {
    Paracetamol paracetamol = new Paracetamol
            (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 1, 2020, 20,
                    Paracetamol.FormParacetamolType.PILL);
    Loperamide loperamide = new Loperamide
            (Medicine.MedicinePharmaGroupType.DIARRHEA, 9, 2024, 12, "Ukraine");
    Fenkarol fenkarol = new Fenkarol
            (Medicine.MedicinePharmaGroupType.ANTIHISTAMINE, 15, 2023, 10, 25);
    Augmentin augmentin = new Augmentin
            (Medicine.MedicinePharmaGroupType.ANTIBIOTIC, 25, 2020, 10, true);
    Euthyrox euthyrox = new Euthyrox
            (Medicine.MedicinePharmaGroupType.HORMONAL, 8.5, 2020, 100, 50);
    Herbion herbion = new Herbion
            (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 23, 2024, 1, true);
    Spazmalgon spazmalgon = new Spazmalgon
            (Medicine.MedicinePharmaGroupType.ANTISPASMODICS, 13, 2023, 20, 5);
    Teraflu teraflu = new Teraflu
            (Medicine.MedicinePharmaGroupType.FEBRIFUGE, 2, 2024, 8, "lemon");
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

    @Test
    public void testCalculateTotalPrice() {

        MedicineChest medicineChest = new MedicineChest();
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

        double expected = 162.3;
        double actual = Assistance.calculateTotalPrice(medicineChest);
        assertEquals(expected, actual, 0.0);
    }
        @Test
    public void testGetExpiredMedicines() {
        MedicineChest medicineChest = new MedicineChest();
        medicineChest.add(paracetamol);
        medicineChest.add(loperamide);
        medicineChest.add(fenkarol);
        medicineChest.add(thermometer);
        medicineChest.add(tourniquet);

        List<MedicineChestComponent> list = new ArrayList<>();
        list.add(paracetamol);

        List<MedicineChestComponent> list1 = Assistance.getExpiredMedicines(medicineChest);
        assertEquals(list, list1);
    }

    @Test
    public void testGetColdMedicines() {
        MedicineChest medicineChest = new MedicineChest();
        medicineChest.add(paracetamol);
        medicineChest.add(loperamide);
        medicineChest.add(herbion);
        medicineChest.add(spazmalgon);
        medicineChest.add(teraflu);
        medicineChest.add(validol);
        medicineChest.add(vitaminC);
        medicineChest.add(thermometer);
        medicineChest.add(tourniquet);

        List<MedicineChestComponent> list = new ArrayList<>();
        list.add(herbion);
        list.add(teraflu);
        list.add(vitaminC);

        List<MedicineChestComponent> list1 = Assistance.getColdMedicines(medicineChest);
        assertEquals(list, list1);
    }

    @Test
    public void testGetNotUsefulnessItems() {
        MedicineChest medicineChest = new MedicineChest();
        medicineChest.add(euthyrox);
        medicineChest.add(herbion);
        medicineChest.add(bandage);
        medicineChest.add(cotton);
        medicineChest.add(plaster);
        medicineChest.add(scissors);
        medicineChest.add(thermometer);
        medicineChest.add(tourniquet);

        List<MedicineChestComponent> list = new ArrayList<>();
        list.add(thermometer);

        List<MedicineChestComponent> list1 = Assistance.getNotUsefulnessItems(medicineChest);
        assertEquals(list, list1);
    }

    @Test
    public void testCleanMedicineChest(){
        MedicineChest medicineChest = new MedicineChest();
        medicineChest.add(paracetamol);
        medicineChest.add(spazmalgon);
        medicineChest.add(teraflu);
        medicineChest.add(validol);
        medicineChest.add(thermometer);
        medicineChest.add(tourniquet);

        MedicineChest medicineChest1 = medicineChest;

        medicineChest.remove(paracetamol);
        medicineChest.remove(thermometer);

        Assistance.cleanMedicineChest(medicineChest1);

        assertEquals(medicineChest, medicineChest1);

    }
}