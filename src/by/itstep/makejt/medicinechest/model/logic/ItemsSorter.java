package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import by.itstep.makejt.medicinechest.model.entity.conteiner.ItemsSection;

import java.util.Comparator;

public class ItemsSorter {

    public static void sort(ItemsSection section2, Comparator<Item> comparator) {
        for (int i = 0; i < section2.size() - 1; i++) {
            for (int j = 0; j < section2.size() - 1 - i; j++) {
                if (comparator.compare(section2.get(j), section2.get(j + 1)) > 0) {
                    Item temp = section2.get(j);
                    section2.set(j, section2.get(j + 1));
                    section2.set(j + 1, temp);
                }
            }
        }
    }
}