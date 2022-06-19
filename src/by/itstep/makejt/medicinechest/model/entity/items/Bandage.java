package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Objects;

public class Bandage extends Item {

    public int width;

    public Bandage() {
        width = 10;
    }

    public Bandage(double price, boolean usefulness, int width) {
        super(price, usefulness);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bandage bandage = (Bandage) o;
        return width == bandage.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width);
    }

    @Override
    public String toString() {
        return "Bandage{" + super.toString() + ", width = " + width + '}';
    }
}