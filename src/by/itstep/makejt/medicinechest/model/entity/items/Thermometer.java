package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Objects;

public class Thermometer extends Item {

    public Type type;

    public Thermometer() {
        type = Type.MERCURY;
    }

    public Thermometer(double price, boolean usefulness, Type type) {
        super(price, usefulness);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Thermometer that = (Thermometer) o;
        return type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Thermometer{" + super.toString() + ", type = " + type.getName() + '}';
    }

    public enum Type {
        MERCURY ("mercury"),
        ELECTRONIC ("electronic"),
        INFRARED ("infrared");

        private String name;

        Type(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}