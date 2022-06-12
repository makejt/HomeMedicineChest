package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

public class Fenkarol extends Medicine {

    public double dosage;

    public Fenkarol(){

    }

    public Fenkarol(String pharmGroup, double price, double dosage, int count, int expDate) {
        super(pharmGroup, price, expDate, count);
        this.dosage = dosage;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }


    @Override
    public String toString() {
        return "Fenkarol{" + super.toString() +
                ", dosage=" + dosage +'}';
    }

    @Override
    public int compareTo(Medicine o) {
        if (getClass() != o.getClass()){
            return 1;
        }
        Fenkarol fenkarol = (Fenkarol) o;
        int result = Double.compare(dosage, fenkarol.dosage);

        return result;
    }
}
