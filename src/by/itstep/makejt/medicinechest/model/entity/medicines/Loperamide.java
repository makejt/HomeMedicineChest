package by.itstep.makejt.medicinechest.model.entity.medicines;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;
import java.util.Objects;
public class Loperamide extends Medicine {
    private String producer;
    public Loperamide() {
        producer = "Ukraine";
    }
    public Loperamide(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count, String producer) {
        super(medicinePharmaGroupType, price, expDate, count);
        this.producer = producer;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    @Override
    public String toString() {
        return "Loperamide{" + super.toString() + ", producer = " + producer;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Loperamide that = (Loperamide) o;
        return producer.equals(that.producer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer);
    }
}