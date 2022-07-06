package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Spazmalgon extends Medicine {

    public double dosage;

    public Spazmalgon() {
        dosage = 5;
    }

    public Spazmalgon(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count, double dosage) {
        super(medicinePharmaGroupType, price, expDate, count);
        this.dosage = dosage;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        if (dosage >= 5 && dosage <= 10) {
            this.dosage = dosage;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spazmalgon that = (Spazmalgon) o;
        return Double.compare(that.dosage, dosage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dosage);
    }

    @Override
    public String toString() {
        return "Spazmalgon{" + super.toString() + ", dosage = " + dosage + '}';
    }
}