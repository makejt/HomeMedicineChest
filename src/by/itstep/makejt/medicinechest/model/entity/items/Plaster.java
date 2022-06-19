package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Objects;

public class Plaster extends Item {

    public boolean isBactericidal;
    public int width;

    public Plaster() {
        isBactericidal = false;
        width = 1;
    }

    public Plaster(double price, boolean usefulness, boolean isBactericidal, int width) {
        super(price, usefulness);
        this.isBactericidal = isBactericidal;
        this.width = width;
    }

    public boolean isBactericidal() {
        return isBactericidal;
    }

    public void setBactericidal(boolean bactericidal) {
        isBactericidal = bactericidal;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plaster plaster = (Plaster) o;
        return isBactericidal == plaster.isBactericidal && width == plaster.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isBactericidal, width);
    }

    @Override
    public String toString() {
        return "Plaster{" + super.toString() + ", isBactericidal=" + isBactericidal +
                ", width = " + width + '}';
    }
}