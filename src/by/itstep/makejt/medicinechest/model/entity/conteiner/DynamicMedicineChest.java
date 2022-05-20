package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.DynamicMedicineChestIterator;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.Iterable;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.MyIterator;

public class DynamicMedicineChest implements MedicineChest, Iterable {

    private Medicines[] medicines;

    public DynamicMedicineChest() {
        medicines = new Medicines[0];
    }

    public DynamicMedicineChest(Medicines[] medicines) {
        this();
        if (medicines != null) {
            this.medicines = medicines;
        }
    }

    public int size() {
        return medicines.length;
    }

    public Medicines get(int index) {
        return medicines[index];
    }

    public void set(int index, Medicines medicine){
        medicines[index] = medicine;
    }

    public void add(Medicines medicine) {
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

    public void removeMedicines(int index) {
        Medicines[] temp = new Medicines[medicines.length - 1];
        for (int i = 0, j = 0; i < medicines.length; i++) {
            if (i != index) {
                temp[j] = medicines[i];
                j++;
            }
            medicines = temp;
        }
    }

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

    @Override
    public MyIterator getIterator() {
        return new DynamicMedicineChestIterator(this);
    }
}