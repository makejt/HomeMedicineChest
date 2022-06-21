package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.ItemSectionIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// itemSection contains only items, no medicines
public class ItemsSection implements Iterable<Item>{

    private List<Item> list;

    public ItemsSection() {
        list = new ArrayList<Item>();
    }

    public ItemsSection(List<Item> list) {
        this.list = list;
    }

    public Item get(int index) {
        return list.get(index);
    }

    public void set(int index, Item item) {
        if (item == null) {
            return;
        }
        list.set(index, item);
    }

    public int size() {
        return list.size();
    }

    public void add(Item item) {
        if (item == null) {
            return;
        }
        list.add(item);
    }

    public void remove(Item item) {
        list.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("There are no items at medicineChest");
        } else {
            builder.append("Items: \n");
            for (Item item : list) {
                builder.append("\n").append(item);
            }
        }
        return builder.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new ItemSectionIterator(this);
    }
}