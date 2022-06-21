package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Teraflu extends Medicine {

    public String taste;

    public Teraflu() {
        taste = "lemon";
    }

    public Teraflu(PharmaGroup pharmaGroup, double price, int expDate, int count, String taste) {
        super(pharmaGroup, price, expDate, count);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teraflu teraflu = (Teraflu) o;
        return Objects.equals(taste, teraflu.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taste);
    }

    @Override
    public String toString() {
        return "Teraflu{" + super.toString() + ", taste = " + taste + '}';
    }
}