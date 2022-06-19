package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Fenkarol extends Medicine {

    public double dosage;

    public Fenkarol(){
        dosage = 25;
    }

    public Fenkarol(PharmaGroup pharmaGroup, double price, int expDate, int count, double dosage) {
        super(pharmaGroup, price, expDate, count);
        this.dosage = dosage;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        if (dosage >= 10 && dosage <=50)
        this.dosage = dosage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fenkarol fenkarol = (Fenkarol) o;
        return Double.compare(fenkarol.dosage, dosage) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dosage);
    }

    @Override
    public String toString() {
        return "Fenkarol{" + super.toString() + ", dosage = " + dosage +'}';
    }
}
