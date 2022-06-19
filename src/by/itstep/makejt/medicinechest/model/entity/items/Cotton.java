package by.itstep.makejt.medicinechest.model.entity.items;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Item;

import java.util.Objects;

public class Cotton extends Item {

    public boolean isSterility;

    public Cotton() {
        isSterility = false;
    }

    public Cotton(double price, boolean usefulness, boolean isSterility) {
        super(price, usefulness);
        this.isSterility = isSterility;
    }

    public boolean isSterility() {
        return isSterility;
    }

    public void setSterility(boolean sterility) {
        isSterility = sterility;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cotton cotton = (Cotton) o;
        return isSterility == cotton.isSterility;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isSterility);
    }

    @Override
    public String toString() {
        return "Cotton{" + super.toString() + ", isSterility = " + isSterility + '}';
    }
}