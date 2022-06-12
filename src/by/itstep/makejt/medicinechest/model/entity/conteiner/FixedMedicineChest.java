package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.FixedMedicineChestIterator;

import java.util.Iterator;

public class FixedMedicineChest implements MedicineChest, Iterable<Medicine> {

    public static final int DEFAULTSIZE = 30;
    private Medicine[] array;
    private int size;

    public FixedMedicineChest() {
        array = new Medicine[DEFAULTSIZE];
        size = 0;
    }

    public FixedMedicineChest(int capacity) {
        array = new Medicine[capacity];
        size = 0;
    }

    public FixedMedicineChest(Medicine[] array) {
        this.array = array;
        size = array.length;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }

    public Medicine get(int index) {
        return array[index];
    }

    public void set(int index, Medicine medicines) {
        array[index] = medicines;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Medicine medicine) {
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
    public Iterator<Medicine> iterator() {
        return new FixedMedicineChestIterator(this);
    }

}