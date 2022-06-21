package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Augmentin extends Medicine {

    public boolean isFreeSold;

    public Augmentin() {
        isFreeSold = true;
    }

    public Augmentin(PharmaGroup pharmaGroup, double price, int expDate, int count, boolean isFreeSold) {
        super(pharmaGroup, price, expDate, count);
        this.isFreeSold = isFreeSold;
    }

    public boolean isFreeSold() {
        return isFreeSold;
    }

    public void setFreeSold(boolean freeSold) {
        isFreeSold = freeSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Augmentin augmentin = (Augmentin) o;
        return isFreeSold == augmentin.isFreeSold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFreeSold);
    }

    @Override
    public String toString() {
        return "Augmentin{" + super.toString() + ", isFreeSold = " + isFreeSold + '}';
    }
}
