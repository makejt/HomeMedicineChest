package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomMedicineChestBuilder {

    public static final int DEFAULT_MEDICINE_COMPONENT_COUNT = 20;
    public static final int MAX_MEDICINE_COUNT = 10;
    public static final int MIN_MEDICINE_COUNT = 1;
    public static final int MAX_MEDICINE_EXPDATE = 2024;
    public static final int MIN_MEDICINE_EXPDATE = 2021;
    public static final double MAX_PARACETAMOL_PRICE = 2.1;
    public static final double MIN_PARACETAMOL_PRICE = 0.5;

    public static final double MAX_LOPERAMIDE_PRICE = 3.48;
    public static final double MIN_LOPERAMIDE_PRICE = 2.32;

    public static final double MAX_FENKAROL_PRICE = 15.33;
    public static final double MIN_FENKAROL_PRICE = 10.19;

    public static final double MAX_FENKAROL_DOSAGE = 50.0;
    public static final double MIN_FENKAROL_DOSAGE = 10.0;

    public static final double MAX_AUGMENTIN_PRICE = 26.54;
    public static final double MIN_AUGMENTIN_PRICE = 15.88;

    public static final double MAX_EUTHYROX_PRICE = 10.49;
    public static final double MIN_EUTHYROX_PRICE = 7.52;

    public static final int MAX_EUTHYROX_DOSAGE = 150;
    public static final int MIN_EUTHYROX_DOSAGE = 25;

    public static final double MAX_HERBION_PRICE = 18.07;
    public static final double MIN_HERBION_PRICE = 9.64;

    public static final double MAX_SPAZMALGON_PRICE = 14.65;
    public static final double MIN_SPAZMALGON_PRICE = 6.80;

    public static final double MAX_SPAZMALGON_DOSAGE = 10.0;
    public static final double MIN_SPAZMALGON_DOSAGE = 5.0;

    public static final double MAX_TERAFLU_PRICE = 25.00;
    public static final double MIN_TERAFLU_PRICE = 10.00;

    public static final double MAX_VALIDOL_PRICE = 3.36;
    public static final double MIN_VALIDOL_PRICE = 2.23;

    public static final double MAX_VITAMINC_PRICE = 2.73;
    public static final double MIN_VITAMINC_PRICE = 1.70;

    public static final double MAX_BANDAGE_PRICE = 5.25;
    public static final double MIN_BANDAGE_PRICE = 3.70;

    public static final int MAX_BANDAGE_WIDTH = 15;
    public static final int MIN_BANDAGE_WIDTH = 5;

    public static final double MAX_COTTON_PRICE = 1.99;
    public static final double MIN_COTTON_PRICE = 1.09;

    public static final double MAX_PLASTER_PRICE = 4.41;
    public static final double MIN_PLASTER_PRICE = 4.30;

    public static final int MAX_PLASTER_WIDTH = 7;
    public static final int MIN_PLASTER_WIDTH = 1;

    public static final double MAX_SCISSORS_PRICE = 10.02;
    public static final double MIN_SCISSORS_PRICE = 3.55;

    public static final int MAX_SCISSORS_SIZE = 15;
    public static final int MIN_SCISSORS_SIZE = 5;

    public static final double MAX_THERMOMETER_PRICE = 24.87;
    public static final double MIN_THERMOMETER_PRICE = 21.50;

    public static final double MAX_TOURNIQUET_PRICE = 4.94;
    public static final double MIN_TOURNIQUET_PRICE = 2.15;

    public static final double MAX_TOURNIQUET_LENGTH = 1.0;
    public static final double MIN_TOURNIQUET_LENGTH = 0.5;
    public enum MedicineComponentType {
        PARACETAMOL, LOPERAMIDE, FENKAROL, AUGMENTIN, EUTHYROX, HERBION, SPAZMALGON,
        TERAFLU, VALIDOL, VITAMINC, BANDAGE, COTTON, PLASTER, SCISSORS, THERMOMETER, TOURNIQUET;
    }

    public static MedicineChest createMedicineChest() {
        Random random = new Random();
        //MedicineChest medicineChest = new MedicineChest(new ArrayList<>(), MedicineChest.Name.ADULT)
        MedicineChest medicineChest = new MedicineChest(new ArrayList<>(),
                MedicineChest.Name.values()[random.nextInt(MedicineChest.Name.values().length)]);

        for (int i = 0; i < DEFAULT_MEDICINE_COMPONENT_COUNT; i++) {
            MedicineChestComponent medicineChestComponent = createMedicineChestComponent();
            medicineChest.add(medicineChestComponent);
        }
        return medicineChest;
    }
    private static MedicineChestComponent createMedicineChestComponent() {
        Random random = new Random();
        MedicineChestComponent medicineChestComponent = null;

        MedicineComponentType type = MedicineComponentType.values()
                [random.nextInt(MedicineComponentType.values().length)];

        switch (type) {
            case PARACETAMOL:
                double price = random.nextDouble(MAX_PARACETAMOL_PRICE - MIN_PARACETAMOL_PRICE + 1)
                        + MIN_PARACETAMOL_PRICE;
                Medicine.PharmaGroup pharmaGroup = Medicine.PharmaGroup.FEBRIFUGE;
                int expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                int count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                Paracetamol.Form form = Paracetamol.Form.values()[random.nextInt(Paracetamol.Form.values().length)];
                medicineChestComponent = new Paracetamol(pharmaGroup, price, expDate, count, form);
                break;
            case LOPERAMIDE:
                price = random.nextDouble(MAX_LOPERAMIDE_PRICE - MIN_LOPERAMIDE_PRICE + 1)
                        + MIN_LOPERAMIDE_PRICE;
                pharmaGroup = Medicine.PharmaGroup.DIARRHEA;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                String producer = "Ukraine";
                medicineChestComponent = new Loperamide(pharmaGroup, price, expDate, count, producer);
                break;
            case FENKAROL:
                price = random.nextDouble(MAX_FENKAROL_PRICE - MIN_FENKAROL_PRICE + 1)
                        + MIN_FENKAROL_PRICE;
                pharmaGroup = Medicine.PharmaGroup.ANTIHISTAMINE;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                double dosage = random.nextDouble(MAX_FENKAROL_DOSAGE - MIN_FENKAROL_DOSAGE + 1)
                        + MIN_FENKAROL_DOSAGE;
                medicineChestComponent = new Fenkarol(pharmaGroup, price, expDate, count, dosage);
                break;
            case AUGMENTIN:
                price = random.nextDouble(MAX_AUGMENTIN_PRICE - MIN_AUGMENTIN_PRICE + 1)
                        + MIN_AUGMENTIN_PRICE;
                pharmaGroup = Medicine.PharmaGroup.ANTIBIOTIC;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                boolean isFreeSold = random.nextBoolean();
                medicineChestComponent = new Augmentin(pharmaGroup, price, expDate, count, isFreeSold);
                break;
            case EUTHYROX:
                price = random.nextDouble(MAX_EUTHYROX_PRICE - MIN_EUTHYROX_PRICE + 1)
                        + MIN_EUTHYROX_PRICE;
                pharmaGroup = Medicine.PharmaGroup.HORMONAL;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                int dosage1 = random.nextInt(MAX_EUTHYROX_DOSAGE - MIN_EUTHYROX_DOSAGE + 1)
                        + MIN_EUTHYROX_DOSAGE;
                medicineChestComponent = new Euthyrox(pharmaGroup, price, expDate, count, dosage1);
                break;
            case HERBION:
                price = random.nextDouble(MAX_HERBION_PRICE - MIN_HERBION_PRICE + 1)
                        + MIN_HERBION_PRICE;
                pharmaGroup = Medicine.PharmaGroup.FEBRIFUGE;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                boolean isKeepRefrigerated = random.nextBoolean();
                medicineChestComponent = new Herbion(pharmaGroup, price, expDate, count, isKeepRefrigerated);
                break;
            case SPAZMALGON:
                price = random.nextDouble(MAX_SPAZMALGON_PRICE - MIN_SPAZMALGON_PRICE + 1)
                        + MIN_SPAZMALGON_PRICE;
                pharmaGroup = Medicine.PharmaGroup.ANTISPASMODICS;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                dosage = random.nextDouble(MAX_SPAZMALGON_DOSAGE - MIN_SPAZMALGON_DOSAGE + 1)
                        + MIN_SPAZMALGON_DOSAGE;
                medicineChestComponent = new Spazmalgon(pharmaGroup, price, expDate, count, dosage);
                break;
            case TERAFLU:
                price = random.nextDouble(MAX_TERAFLU_PRICE - MIN_TERAFLU_PRICE + 1)
                        + MIN_TERAFLU_PRICE;
                pharmaGroup = Medicine.PharmaGroup.FEBRIFUGE;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                String taste = "lemon";
                medicineChestComponent = new Teraflu(pharmaGroup, price, expDate, count, taste);
                break;
            case VALIDOL:
                price = random.nextDouble(MAX_VALIDOL_PRICE - MIN_VALIDOL_PRICE + 1)
                        + MIN_VALIDOL_PRICE;
                pharmaGroup = Medicine.PharmaGroup.HEART;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                Validol.FORM form1 = Validol.FORM.values()[random.nextInt(Validol.FORM.values().length)];
                medicineChestComponent = new Validol(pharmaGroup, price, expDate, count, form1);
                break;
            case VITAMINC:
                price = random.nextDouble(MAX_VITAMINC_PRICE - MIN_VITAMINC_PRICE + 1)
                        + MIN_VITAMINC_PRICE;
                pharmaGroup = Medicine.PharmaGroup.FEBRIFUGE;
                expDate = random.nextInt(MAX_MEDICINE_EXPDATE - MIN_MEDICINE_EXPDATE + 1)
                        + MIN_MEDICINE_EXPDATE;
                count = random.nextInt(MAX_MEDICINE_COUNT - MIN_MEDICINE_COUNT + 1) + MIN_MEDICINE_COUNT;
                taste = "kiwi";
                medicineChestComponent = new VitaminC(pharmaGroup, price, expDate, count, taste);
                break;
            case BANDAGE:
                price = random.nextDouble(MAX_BANDAGE_PRICE - MIN_BANDAGE_PRICE + 1)
                        + MIN_BANDAGE_PRICE;
                boolean usefulness = random.nextBoolean();
                int width = random.nextInt(MAX_BANDAGE_WIDTH - MIN_BANDAGE_WIDTH + 1) + MIN_BANDAGE_WIDTH;
                medicineChestComponent = new Bandage(price, usefulness, width);
                break;
            case COTTON:
                price = random.nextDouble(MAX_COTTON_PRICE - MIN_COTTON_PRICE + 1)
                        + MIN_COTTON_PRICE;
                usefulness = random.nextBoolean();
                boolean isSterility = random.nextBoolean();
                medicineChestComponent = new Cotton(price, usefulness, isSterility);
                break;
            case PLASTER:
                price = random.nextDouble(MAX_PLASTER_PRICE - MIN_PLASTER_PRICE + 1)
                        + MIN_PLASTER_PRICE;
                usefulness = random.nextBoolean();
                boolean isBactericidal = random.nextBoolean();
                width = random.nextInt(MAX_PLASTER_WIDTH - MIN_PLASTER_WIDTH + 1) + MIN_PLASTER_WIDTH;
                medicineChestComponent = new Plaster(price, usefulness, isBactericidal, width);
                break;
            case SCISSORS:
                price = random.nextDouble(MAX_SCISSORS_PRICE - MIN_SCISSORS_PRICE + 1) + MIN_SCISSORS_PRICE;
                usefulness = random.nextBoolean();
                int size = random.nextInt(MAX_SCISSORS_SIZE - MIN_SCISSORS_SIZE + 1) + MIN_SCISSORS_SIZE;
                medicineChestComponent = new Scissors(price, usefulness, size);
                break;
            case THERMOMETER:
                price = random.nextDouble(MAX_THERMOMETER_PRICE - MIN_THERMOMETER_PRICE + 1)
                        + MIN_THERMOMETER_PRICE;
                usefulness = random.nextBoolean();
                Thermometer.Type type1 = Thermometer.Type.values()[random.nextInt(Thermometer.Type.values().length)];
                medicineChestComponent = new Thermometer(price, usefulness, type1);
                break;
            case TOURNIQUET:
                price = random.nextDouble(MAX_TOURNIQUET_PRICE - MIN_TOURNIQUET_PRICE + 1)
                        + MIN_TOURNIQUET_PRICE;
                usefulness = random.nextBoolean();
                double length = random.nextDouble(MAX_TOURNIQUET_LENGTH - MIN_TOURNIQUET_LENGTH + 1)
                        + MIN_TOURNIQUET_LENGTH;
                break;
        }
        return medicineChestComponent;
    }
}