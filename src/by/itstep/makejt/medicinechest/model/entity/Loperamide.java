package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicines;

public class Loperamide extends Medicines {

    public double dosage;
    private int count;
    private String producer;

    public Loperamide() {

    }

    public Loperamide(String pharmGroup, double price, double dosage, int count, int expDate, String producer) {
        super(pharmGroup, price, expDate);
        this.dosage = dosage;
        this.count = count;
        this.producer = producer;
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


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Loperamide{" + super.toString() +
                ", dosage = " + dosage + ", count = " + count +
                ", producer='" + producer + '}';
    }

    @Override
    public int compareTo(Medicines o) {
        if (getClass() != o.getClass()) {
            return 1;
        }
        Loperamide loperamide = (Loperamide) o;
        int result = Double.compare(dosage, loperamide.dosage);
        if (result == 0) {
            result = count - loperamide.count;
        }
        if (result == 0) {
            result = producer.compareTo(loperamide.producer);
        }
        return result;
    }
}