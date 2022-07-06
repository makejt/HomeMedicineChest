package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class VitaminC extends Medicine {

    public String taste;

    public VitaminC() {
        taste = "kiwi";
    }

    public VitaminC(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count, String taste) {
        super(medicinePharmaGroupType, price, expDate, count);
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
        if (!super.equals(o)) return false;
        VitaminC vitaminC = (VitaminC) o;
        return Objects.equals(taste, vitaminC.taste);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taste);
    }

    @Override
    public String toString() {
        return "VitaminC{" + super.toString() + ", taste = " + taste + '}';
    }
}