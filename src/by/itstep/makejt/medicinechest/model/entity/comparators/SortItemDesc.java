package by.itstep.makejt.medicinechest.model.entity.comparators;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Comparator;

public class SortItemDesc implements Comparator<Item>{

    @Override
    public int compare(Item o1, Item o2) {
        return Boolean.compare(o2.isUsefulness(), o1.isUsefulness());
    }
}
