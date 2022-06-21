package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Validol extends Medicine {

    public FORM form;

    public Validol (){
        form = FORM.PILL;
    }

    public Validol(PharmaGroup pharmaGroup, double price, int expDate, int count, FORM form) {
        super(pharmaGroup, price, expDate, count);
        this.form = form;
    }

    public FORM getForm() {
        return form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Validol validol = (Validol) o;
        return form == validol.form;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), form);
    }


    @Override
    public String toString() {
        return "Validol{" + super.toString() + ", form = " + form.getName() + '}';
    }

    public enum FORM{
        PILL("pill"),
        CAPSULE("capsule");

        private String name;

        FORM(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}