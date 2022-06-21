package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Euthyrox extends Medicine {

    public int dosage;

    public Euthyrox() {
        dosage = 25;
    }

    public Euthyrox(PharmaGroup pharmaGroup, double price, int expDate, int count, int dosage) {
        super(pharmaGroup, price, expDate, count);
        this.dosage = dosage;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        if (dosage >= 25 && dosage <= 150) {
            this.dosage = dosage;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Euthyrox euthyrox = (Euthyrox) o;
        return dosage == euthyrox.dosage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dosage);
    }

    @Override
    public String toString() {
        return "Euthyrox{" + super.toString() + ", dosage = " + dosage + '}';
    }
}