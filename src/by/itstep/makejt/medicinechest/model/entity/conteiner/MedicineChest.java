package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class MedicineChest {

    private Medicines[] medicines;

    public MedicineChest() {
        medicines = new Medicines[0];
    }

    public MedicineChest(Medicines[] medicines) {
        this();
        if (medicines != null) {
            this.medicines = medicines;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (medicines == null || medicines.length == 0) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");
            for (Medicines medicines : medicines) {
                builder.append("\n").append(medicines);
            }
        }
        return builder.toString();
    }

    public void addMedicines(Medicines medicine) {
        if (medicine == null) {
            return;
        }
        Medicines[] temp = new Medicines[medicines.length + 1];
        int i = 0;
        for (; i < medicines.length; i++) {
            temp[i] = medicines[i];
        }
        temp[i] = medicine;
        medicines = temp;
    }

    public int getMedicinesCount() {
        return medicines.length;
    }

    public Medicines getMedicines(int index) {
        return medicines[index];
    }

    public void removeMedicines(int index) {
        Medicines[] temp = new Medicines[medicines.length + 1];
        for (int i = 0, j = 0; i < medicines.length; i++) {
            if (i != index) {
                temp[j] = medicines[i];
                j++;
            }
            medicines = temp;
        }
    }
}