package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssistanceTest {

    @Test
    public void testCalculateTotalPrice(){
        Paracetamol paracetamol = new Paracetamol("febrifuge", 1.0, 10, 2024);
        Loperamide loperamide = new Loperamide("antidiarrhoeal", 4.5, 2, 15, 2023,
                "Ukraine");
        Fenkarol fenkarol = new Fenkarol("antihistamine", 11, 25, 30, 2024);

        MedicineChest medicineChest = new MedicineChest();
        medicineChest.addMedicines(fenkarol);
        medicineChest.addMedicines(paracetamol);
        medicineChest.addMedicines(loperamide);

        double expected = 16.5;
        double actual = Assistance.calculateTotalPrice(medicineChest);
        assertEquals(expected, actual, 0.0);
    }
}