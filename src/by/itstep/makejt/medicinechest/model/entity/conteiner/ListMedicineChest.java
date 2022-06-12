package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.ListMedicineChestIterator;

import java.util.Iterator;

public class ListMedicineChest implements MedicineChest, Iterable<Medicine> {
    private Node first;
    private int size;

    public ListMedicineChest() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Medicine get(int index) {
            if (isEmpty() || index < 0 || index >= size) {
                return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.medicines;
    }

    @Override
    public void set(int index, Medicine medicine) {

    }

    public void add(Medicine medicines) {
        if (isEmpty()) {
            first = new Node(medicines);
        } else {
            Node temp = first;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(medicines);
        }
        size++;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");

            Node temp = first;
            while (temp.next != null) {
                builder.append("\n").append(temp.medicines);
                temp = temp.next;
            }
            builder.append("\n").append(temp.medicines);
        }
        return builder.toString();
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public Iterator<Medicine> iterator() {
        return new ListMedicineChestIterator(this);
    }

    private class Node {
        public Medicine medicines;
        public Node next;

        public Node(Medicine medicines) {
            this.medicines = medicines;
        }
    }


}
