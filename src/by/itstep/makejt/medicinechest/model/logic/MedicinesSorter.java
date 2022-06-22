package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Comparator;

public class MedicinesSorter {

    public static void sort(MedicinesSection section1, Comparator<Medicine> comparator) {
        for (int i = 0; i < section1.size() - 1; i++) {
            for (int j = 0; j < section1.size() - 1 - i; j++) {
                if (comparator.compare(section1.get(j), section1.get(j + 1)) > 0) {
                    Medicine temp = section1.get(j);
                    section1.set(j, section1.get(j + 1));
                    section1.set(j + 1, temp);
                }
            }
        }
    }
}