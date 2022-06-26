package by.itstep.makejt.medicinechest.model.entity.conteiner;

import java.util.ArrayList;
import java.util.List;

// conteiner of all home medicineChest

public class HomeMedicineChest{
    private List<MedicineChest> list;
    public HomeMedicineChest() {
        list = new ArrayList<>();
    }
    public HomeMedicineChest(List<MedicineChest> list) {
        this.list = list;
    }
    public int count() {
        return list.size();
    }
    public MedicineChest get(int index) {
        return list.get(index);
    }
    public void set(int index, MedicineChest medicineChest) {
        list.set(index, medicineChest);
    }
    public void add(MedicineChest medicineChest) {
        if (medicineChest == null) {
            return;
        }
        list.add(medicineChest);
    }
    public void remove(int index) {
        list.remove(index);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (list.isEmpty()) {
            builder.append("There are no medicineChest at home");
        } else {
            builder.append("Home medicineChest: \n");

            for (MedicineChest medicineChest : list) {
                builder.append("\n").append(medicineChest.name);
            }
        }
        return builder.toString();
    }
}