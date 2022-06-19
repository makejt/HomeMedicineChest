package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Item extends MedicineChestComponent implements Comparable<Item> {

    private boolean usefulness;

    public Item() {
        usefulness = true;
    }

    public Item(double price, boolean usefulness) {
        super(price);
         this.usefulness = usefulness;
    }

    public boolean isUsefulness() {
        return usefulness;
    }

    public void setUsefulness(boolean usefulness) {
        this.usefulness = usefulness;
    }

    @Override
    public String toString() {
        return super.toString() + ", usefulness = " + usefulness;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Item item = (Item) o;
        return usefulness == item.usefulness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), usefulness);
    }

    @Override
    public int compareTo(Item o) {
         return Boolean.compare(usefulness, o.usefulness);
    }
}