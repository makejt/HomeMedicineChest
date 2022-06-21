package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicinesSection;

import java.util.Iterator;

public class MedicineSectionIterator implements Iterator<Medicine> {


    private MedicinesSection section1;
    private int current;

    public MedicineSectionIterator(MedicinesSection section1) {
        this.section1 = section1;
    }

    @Override
    public boolean hasNext() {
        return current < section1.size();
    }

    @Override
    public Medicine next() {
        return section1.get(current++);
    }

    public void reset() {
        current = 0;
    }
}