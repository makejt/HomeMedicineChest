package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.MedicineChestComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MedicineChest implements Iterable<MedicineChestComponent> {
    List<MedicineChestComponent> list;
    public Name name;
    public MedicineChest() {
        list = new ArrayList<>();
    }
    public MedicineChest(List<MedicineChestComponent> list, Name name) {
        this.list = list;
        this.name = name;
    }
    public int size() {
        return list.size();
    }
    public MedicineChestComponent get(int index) {
        return list.get(index);
    }
    public void set(int index, MedicineChestComponent component) {
        if (component == null) {
            return;
        }
        list.set(index, component);
    }
    public void add(MedicineChestComponent component) {
        if (component == null) {
            return;
        }
        list.add(component);
    }
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest " + name.getName() + ":\n");

            for (MedicineChestComponent component : list) {
                builder.append("\n").append(component);
            }
        }
        return builder.toString();
    }

    @Override
    public Iterator<MedicineChestComponent> iterator() {
        return list.iterator();
    }

    public enum Name {
        ADULT("for adults"),
        CHILD("for children"),
        TRAVEL("for travelling"),
        AUTO("for car");
        private String name;

        Name(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}