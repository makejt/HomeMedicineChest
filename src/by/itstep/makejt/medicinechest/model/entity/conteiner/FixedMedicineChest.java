package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.FixedMedicineChestIterator;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.Iterable;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.MyIterator;

public class FixedMedicineChest implements MedicineChest, Iterable {

    public static final int DEFAULTSIZE = 10;
    private Medicines[] array;
    private int size;

    public FixedMedicineChest() {
        array = new Medicines[DEFAULTSIZE];
        size = 0;
    }

    public FixedMedicineChest(int capacity) {
        array = new Medicines[capacity];
        size = 0;
    }

    public FixedMedicineChest(Medicines[] array) {
        this.array = array;
        size = array.length;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }

    public Medicines get(int index) {
        return array[index];
    }

    public void set(int index, Medicines medicines) {
        array[index] = medicines;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Medicines medicine) {
        if (medicine == null) {
            return;
        }
        if (size < array.length) {
            array[size] = medicine;
            size++;
        }
    }

    public void remove(int index) {
        if (isEmpty() || (index < 0 && index >= size)) {
            return;
        }
        if (index == size - 1) {
            array[index] = null;
        } else {
            for (int i = index; i < size(); i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (isEmpty()) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");

            for (int i = 0; i < size; i++) {
                builder.append("\n").append(array[i]);
            }
        }
        return builder.toString();
    }

    @Override
    public MyIterator getIterator() {
        return new FixedMedicineChestIterator (this);
    }
}