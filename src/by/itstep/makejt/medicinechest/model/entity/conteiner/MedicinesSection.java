package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.MedicineSectionIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// medicinesSection contains only medicines, no items
public class MedicinesSection implements Iterable<Medicine>{

    private List<Medicine> list;

    public MedicinesSection() {
        list = new ArrayList<>();
    }

    public MedicinesSection(List<Medicine> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }


    public Medicine get(int index) {
        return list.get(index);
    }

    public void set(int index, Medicine medicine) {
        if (medicine == null){
            return;
        }
        list.set(index, medicine);
    }

    public void add(Medicine medicine) {
        if (medicine == null) {
            return;
        }
        list.add(medicine);
    }

    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("There are no medicines at medicineChest");
        } else {
            builder.append("Medicines: \n");

            for (Medicine medicine : list) {
                builder.append("\n").append(medicine);
            }
        }
        return builder.toString();
    }

    @Override
    public Iterator<Medicine> iterator() {
        return new MedicineSectionIterator(this);
    }




}