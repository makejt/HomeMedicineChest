package by.itstep.makejt.medicinechest.model.entity.iteratorpattern;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import by.itstep.makejt.medicinechest.model.entity.conteiner.ItemsSection;
import java.util.Iterator;

public class ItemSectionIterator implements Iterator<Item> {

    private ItemsSection section2;
    private int current;

    public ItemSectionIterator(ItemsSection section2) {
        this.section2 = section2;
    }
    @Override
    public boolean hasNext() {
        return current < section2.size();
    }
    @Override
    public Item next() {
        return section2.get(current++);
    }

    public void reset() {
        current = 0;
    }
}