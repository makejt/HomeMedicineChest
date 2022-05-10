package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class Paracetamol extends Medicines {

    private int count;

    public Paracetamol() {
    }

    public Paracetamol(String pharmGroup, double price, int count, int expDate) {
        super(pharmGroup, price, expDate);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Paracetamol{ " + super.toString() + ", count = " + count + '}';
    }
}
