package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.util.*;

public class SimpleMedicineChestFactory {

    private static SimpleMedicineChestFactory factory;
    private SimpleMedicineChestFactory() {
    }

    public static SimpleMedicineChestFactory getFactory() {
        if (factory == null) {
            factory = new SimpleMedicineChestFactory();
        }
        return factory;
    }
    public MedicineChest create(int type) throws MedicineChestFileNoFoundException {

        MedicineChest medicineChest = null;

        switch (type) {
            case 0: medicineChest = HardcodeMedicineChestBuilder.createMedicineChest();
                break;
            case 1: medicineChest = new RandomMedicineChestBuilder().createMedicineChest();
                break;
            case 2: medicineChest = new ByteStreamMedicineChestBuilder
                        ("C:/Test/byteMedicineChest.txt").createMedicineChest();
                break;
            case 3: medicineChest = new CharStreamMedicineChestBuilder
                        ("C:/Test/charMedicineChest.txt").createMedicineChest();
                break;
            default: medicineChest = SerializableMedicineChestBuilder.read();
                break;
        }
        return medicineChest;
    }
}