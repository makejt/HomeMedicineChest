package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class Fenkarol extends Medicines {

    public double dosage;
    private int count;

    public Fenkarol(){

    }

    public Fenkarol(String pharmGroup, double price, double dosage, int count, int expDate) {
        super(pharmGroup, price, expDate);
        this.dosage = dosage;
        this.count = count;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Fenkarol{" + super.toString() +
                ", dosage=" + dosage +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Medicines o) {
        if (getClass() != o.getClass()){
            return 1;
        }
        Fenkarol fenkarol = (Fenkarol) o;
        int result = Double.compare(dosage, fenkarol.dosage);

        if (result == 0) {
            result = count - fenkarol.count;
        }

        return result;
    }
}
