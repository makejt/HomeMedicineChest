package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Medicine implements Comparable<Medicine> {

    private String pharmGroup;
    private double price;
    private int expDate;
    private int count;


    public Medicine() {
        pharmGroup = "no name";
        price = 0;
        expDate = 2022;
        count = 0;
    }

    public Medicine(String pharmGroup, double price, int expDate, int count) {
        this.pharmGroup = pharmGroup;
        this.price = price;
        this.expDate = expDate;
        this.count = count;

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


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "pharmGroup = " + pharmGroup + ", price = " + price + ", expDate = " + expDate + ", count = " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicines = (Medicine) o;
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
    public int compareTo(Medicine o) {
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