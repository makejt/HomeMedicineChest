package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import java.util.Objects;

public class Paracetamol extends Medicine {
    private FormParacetamolType form;
    public Paracetamol() {
        form = FormParacetamolType.PILL;
    }
    public Paracetamol(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate,
                       int count, FormParacetamolType form) {
        super(medicinePharmaGroupType, price, expDate, count);
        this.form = form;
    }
   public FormParacetamolType getForm() {
        return form;
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
    public enum FormParacetamolType {
        PILL("pill"),
        CAPSULE("capsule"),
        SUPPOSITORIES("suppositories"),
        SYRUP("syrup"),
        POWDER("powder");
        private String name;
        FormParacetamolType(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}