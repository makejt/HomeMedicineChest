package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

import java.util.Objects;

public class Paracetamol extends Medicine {

    public Form form;

    public Paracetamol() {
        form = Form.PILL;
    }

    public Paracetamol(PharmaGroup pharmaGroup, double price, int expDate, int count, Form form) {
        super(pharmaGroup, price, expDate, count);
        this.form = form;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Paracetamol that = (Paracetamol) o;
        return form == that.form;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), form);
    }

    @Override
    public String toString() {
        return "Paracetamol{ " + super.toString() + ", form = " + form.getName() + '}';
    }


    public enum Form {

        PILL("pill"),
        CAPSULE("capsule"),
        SUPPOSITORIES("suppositories"),
        SYRUP("syrup"),
        POWDER("powder");

        private String name;

        Form(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }
}

