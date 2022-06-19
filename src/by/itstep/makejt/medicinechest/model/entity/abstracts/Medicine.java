package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Medicine extends MedicineChestComponent implements Comparable<Medicine> {

    private PharmaGroup pharmaGroup;
    private int expDate;
    private int count;

    public Medicine() {
        expDate = 2022;
        count = 0;
    }

    public Medicine(PharmaGroup pharmaGroup, double price, int expDate, int count) {
        super(price);
        this.pharmaGroup = pharmaGroup;
        this.expDate = expDate;
        this.count = count;
    }

    public String getPharmaGroup() {
        return pharmaGroup.name;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        if (expDate >= 2022) {
            this.expDate = expDate;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", pharmaGroup = " + pharmaGroup.getName() + ", expDate = " +
                + expDate + ", count = " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Medicine medicine = (Medicine) o;
        return expDate == medicine.expDate && count == medicine.count && pharmaGroup == medicine.pharmaGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pharmaGroup, expDate, count);
    }

    @Override
    public int compareTo(Medicine o) {
        int result = pharmaGroup.compareTo(o.pharmaGroup);
        if (result == 0) {
            result = Integer.compare(expDate, o.expDate);
        }
        if (result == 0) {
            result = Integer.compare(count, o.count);
        }
        return result;
    }

    public enum PharmaGroup {
        FEBRIFUGE("febrifuge"),
        DIARRHEA("diarrhea"),
        ANTIHISTAMINE("antihistamine"),
        HORMONAL("hormonal"),
        HEART("heart"),
        ANTIBIOTIC ("antibiotic"),
        ANTISPASMODICS("antispasmodics");

        private String name;

        PharmaGroup(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}