package by.itstep.makejt.medicinechest.model.entity.abstracts;

import by.itstep.makejt.medicinechest.model.exception.MedicineChestComponentWrongPriceException;
import java.util.Objects;

public class MedicineChestComponent {
    private double price;
    public MedicineChestComponent() {
        price = 0;
    }
    public MedicineChestComponent(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) throws MedicineChestComponentWrongPriceException{
        if (price > 0) {
            this.price = price;
        } else {
            throw new MedicineChestComponentWrongPriceException();
        }
    }
    @Override
    public String toString() {
        return "price = " + price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicineChestComponent component = (MedicineChestComponent) o;
        return Double.compare(component.price, price) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(price);
    }
    public int compareTo(MedicineChestComponent component) {
        return Double.compare(price, component.price);
    }
}