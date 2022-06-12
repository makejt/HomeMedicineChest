package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

public class Loperamide extends Medicine {

    public double dosage;
    private String producer;

    public Loperamide() {

    }

    public Loperamide(String pharmGroup, double price, int count, int expDate, double dosage, String producer) {
        super(pharmGroup, price, expDate, count);
        this.dosage = dosage;
        this.producer = producer;
    }


    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Loperamide{" + super.toString() + ", dosage = " + dosage + ", producer = " + producer;
    }

    @Override
    public int compareTo(Medicine o) {

        if (getClass() != o.getClass()) {
            return 1;
        }
        Loperamide loperamide = (Loperamide) o;
        int result = Double.compare(dosage, loperamide.dosage);

        if (result == 0) {
            result = producer.compareTo(loperamide.producer);
        }
        return result;
    }
}