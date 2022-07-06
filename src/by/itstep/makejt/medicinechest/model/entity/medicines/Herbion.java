package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Herbion extends Medicine {

    public boolean isKeepRefrigerated;

    public Herbion() {
        isKeepRefrigerated = true;
    }

    public Herbion(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count, boolean isKeepRefrigerated) {
        super(medicinePharmaGroupType, price, expDate, count);
        this.isKeepRefrigerated = isKeepRefrigerated;
    }

    public boolean isKeepRefrigerated() {
        return isKeepRefrigerated;
    }

    public void setKeepRefrigerated(boolean keepRefrigerated) {
        isKeepRefrigerated = keepRefrigerated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbion herbion = (Herbion) o;
        return isKeepRefrigerated == herbion.isKeepRefrigerated;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isKeepRefrigerated);
    }

    @Override
    public String toString() {
        return "Herbion{" + super.toString() + ", isKeepRefrigerated = " + isKeepRefrigerated + '}';
    }
}