package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class ListMedicineChest implements MedicineChest {
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

    public Medicines get(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.medicines;
    }

    public void add(Medicines medicines) {
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

    private class Node {
        public Medicines medicines;
        public Node next;

        public Node(Medicines medicines) {
            this.medicines = medicines;
        }
    }
}
