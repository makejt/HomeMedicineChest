package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import java.util.Objects;
public class Scissors extends Item {
    private int size;
    public Scissors() {
        size = 10;
    }
    public Scissors(double price, boolean usefulness, int size) {
        super(price, usefulness);
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Scissors scissors = (Scissors) o;
        return size == scissors.size;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }
    @Override
    public String toString() {
        return "Scissors{" + super.toString() + ", size = " + size + '}';
    }
}