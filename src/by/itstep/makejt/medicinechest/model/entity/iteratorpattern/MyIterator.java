package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public interface MyIterator {
    Medicines next();
    boolean hasNext();
    void reset();
}
