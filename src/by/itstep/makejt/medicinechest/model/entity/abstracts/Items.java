package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Items implements Comparable<Items> {

    private double price;
    private boolean usefulness;

    public Items() {
        price = 0;
        usefulness = true;
    }

    public Items(double price, boolean usefulness) {
        this.price = price;
        this.usefulness = usefulness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isUsefulness() {
        return usefulness;
    }

    public void setUsefulness(boolean usefulness) {
        this.usefulness = usefulness;
    }

    @Override
    public String toString() {
        return "price = " + price + ", usefulness = " + usefulness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return Double.compare(items.price, price) == 0 && usefulness == items.usefulness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, usefulness);
    }


    @Override
    public int compareTo(Items o) {
        int result = Double.compare(price, o.price);
        if (result == 0) {
            result = Boolean.compare(usefulness, o.usefulness);
        }

        return result;
    }
}

