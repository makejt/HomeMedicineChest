package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;
import java.util.Objects;
public class Thermometer extends Item {
    private ThermometerType thermometerType;
    public Thermometer() {
        thermometerType = ThermometerType.MERCURY;
    }
    public Thermometer(double price, boolean usefulness, ThermometerType thermometerType) {
        super(price, usefulness);
        this.thermometerType = thermometerType;
    }
    public ThermometerType getType() {
        return thermometerType;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Thermometer that = (Thermometer) o;
        return thermometerType == that.thermometerType;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), thermometerType);
    }
    @Override
    public String toString() {
        return "Thermometer{" + super.toString() + ", type = " + thermometerType.getName() + '}';
    }
    public enum ThermometerType {
        MERCURY ("mercury"),
        ELECTRONIC ("electronic"),
        INFRARED ("infrared");
        private String name;
        ThermometerType(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
    }
}