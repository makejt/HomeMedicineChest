package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Medicines implements Comparable<Medicines> {

    private String pharmGroup;
    private double price;
    private int expDate;


    public Medicines() {
        pharmGroup = "no name";
        price = 0;
        expDate = 2022;
    }

    public Medicines(String pharmGroup, double price, int expDate) {
        this.pharmGroup = pharmGroup;
        this.price = price;
        this.expDate = expDate;
    }

    public String getPharmGroup() {
        return pharmGroup;
    }

    public void setPharmGroup(String pharmGroup) {
        this.pharmGroup = pharmGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "pharmGroup = " + pharmGroup + ", price = " + price + ", expDate = " + expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicines medicines = (Medicines) o;
        return Double.compare(price, medicines.price) == 0
                && expDate == medicines.expDate && Objects.equals(pharmGroup, medicines.pharmGroup);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime + Objects.hash(pharmGroup);
        result = result * prime + Objects.hash(price);
        result = result * prime + Objects.hash(expDate);
        return result;
    }

    @Override
    public int compareTo(Medicines o) {
        int result = Double.compare(price, o.price);
        if (result == 0) {
            result = expDate - o.expDate;
        }
        if (result == 0) {
            result = pharmGroup.compareTo(o.pharmGroup);
        }
        return result;
    }
}