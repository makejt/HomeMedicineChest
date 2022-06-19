package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Objects;

public class Tourniquet extends Item {

    public double length;

    public Tourniquet() {
        length = 1;
    }

    public Tourniquet(double price, boolean usefulness, double length) {
        super(price, usefulness);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tourniquet that = (Tourniquet) o;
        return Double.compare(that.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length);
    }

    @Override
    public String toString() {
        return "Tourniquet{" + super.toString() + ", length = " + length + '}';
    }
}