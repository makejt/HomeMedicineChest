package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.DynamicMedicineChestIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DynamicMedicineChest implements MedicineChest, Iterable<Medicine> {

    private List<Medicine> list;

    public DynamicMedicineChest() {
        list = new ArrayList<>();
    }

    public DynamicMedicineChest(List<Medicine> list) {
        this.list = list;
    }

    public List<Medicine> getList() {
        return list;
    }

    public void setList(List<Medicine> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");

            for (int i = 0; i < list.size(); i++) {
                builder.append("\n").append(get(i));
            }
        }
        return builder.toString();
    }


    public Iterator<Medicine> iterator() {
        return new DynamicMedicineChestIterator(this);
    }


    public int size() {
        return list.size();
    }


    @Override
    public Medicine get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, Medicine medicine) {
        list.set(index, medicine);
    }

    @Override
    public void add(Medicine medicine) {
        if (medicine == null) {
            return;
        }
        list.add(medicine);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

}

