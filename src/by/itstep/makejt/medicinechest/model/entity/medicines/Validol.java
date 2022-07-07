package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import java.util.Objects;
public class Validol extends Medicine {
    private FormValidolType formValidolType;
    public Validol (){
        formValidolType = FormValidolType.PILL;
    }
    public Validol(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count, FormValidolType formValidolType) {
        super(medicinePharmaGroupType, price, expDate, count);
        this.formValidolType = formValidolType;
    }
    public FormValidolType getForm() {
        return formValidolType;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Validol validol = (Validol) o;
        return formValidolType == validol.formValidolType;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), formValidolType);
    }
    @Override
    public String toString() {
        return "Validol{" + super.toString() + ", form = " + formValidolType.getName() + '}';
    }
    public enum FormValidolType {
        PILL("pill"),
        CAPSULE("capsule");
        private String name;
        FormValidolType(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}