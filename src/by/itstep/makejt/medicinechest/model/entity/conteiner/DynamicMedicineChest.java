package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.DynamicMedicineChestIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class DynamicMedicineChest implements MedicineChest, Iterable<Medicine> {

    private List<Medicine> list;

    public DynamicMedicineChest() {
        list = new ArrayList<>();
    }

    public DynamicMedicineChest(List<Medicine> list) {
        this.list = list;
    }

    public List<Medicine> getList() {
        return list;
    }

    public void setList(List<Medicine> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");

            for (int i = 0; i < list.size(); i++) {
                builder.append("\n").append(get(i));
            }
        }
        return builder.toString();
    }

    @Override
    public Iterator<Medicine> iterator() {
        return new DynamicMedicineChestIterator(this);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Medicine get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, Medicine medicine) {
        list.set(index, medicine);
    }

    @Override
    public void add(Medicine medicine) {
        if (medicine == null) {
            return;
        }
        list.add(medicine);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    //    public DynamicMedicineChest() {
//        medicines = new Medicines[0];
//    }
//
//    public DynamicMedicineChest(Medicines[] medicines) {
//        this();
//        if (medicines != null) {
//            this.medicines = medicines;
//        }
//    }
//
//    public int size() {
//        return medicines.length;
//    }
//
//    public Medicines get(int index) {
//        return medicines[index];
//    }
//
//    public void set(int index, Medicines medicine){
//        medicines[index] = medicine;
//    }
//
//    public void add(Medicines medicine) {
//        if (medicine == null) {
//            return;
//        }
//        Medicines[] temp = new Medicines[medicines.length + 1];
//        int i = 0;
//        for (; i < medicines.length; i++) {
//            temp[i] = medicines[i];
//        }
//        temp[i] = medicine;
//        medicines = temp;
//    }
//
//    public void removeMedicines(int index) {
//        Medicines[] temp = new Medicines[medicines.length - 1];
//        for (int i = 0, j = 0; i < medicines.length; i++) {
//            if (i != index) {
//                temp[j] = medicines[i];
//                j++;
//            }
//            medicines = temp;
//        }
//    }
//
//     public String toString() {
//        StringBuilder builder = new StringBuilder();
//
//        if (medicines == null || medicines.length == 0) {
//            builder.append("MedicineChest is empty");
//        } else {
//            builder.append("MedicineChest: \n");
//            for (Medicines medicines : medicines) {
//                builder.append("\n").append(medicines);
//            }
//        }
//        return builder.toString();
//    }


}