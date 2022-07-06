package by.itstep.makejt.medicinechest.model.entity.abstracts;

import java.util.Objects;

public class Medicine extends MedicineChestComponent implements Comparable<Medicine> {

    private MedicinePharmaGroupType medicinePharmaGroupType;
    private int expDate;
    private int count;

    public Medicine() {
        expDate = 2022;
        count = 0;
    }

    public Medicine(MedicinePharmaGroupType medicinePharmaGroupType, double price, int expDate, int count) {
        super(price);
        this.medicinePharmaGroupType = medicinePharmaGroupType;
        this.expDate = expDate;
        this.count = count;
    }

    public MedicinePharmaGroupType getPharmaGroup() {
        return medicinePharmaGroupType;
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
        return super.toString() + ", pharmaGroup = " + medicinePharmaGroupType.getName() + ", expDate = " +
                + expDate + ", count = " + count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Medicine medicine = (Medicine) o;
        return expDate == medicine.expDate && count == medicine.count && medicinePharmaGroupType == medicine.medicinePharmaGroupType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), medicinePharmaGroupType, expDate, count);
    }

    @Override
    public int compareTo(Medicine o) {
        int result = medicinePharmaGroupType.compareTo(o.medicinePharmaGroupType);
        if (result == 0) {
            result = Integer.compare(expDate, o.expDate);
        }
        if (result == 0) {
            result = Integer.compare(count, o.count);
        }
        return result;
    }

    public enum MedicinePharmaGroupType {
        FEBRIFUGE("febrifuge"),
        DIARRHEA("diarrhea"),
        ANTIHISTAMINE("antihistamine"),
        HORMONAL("hormonal"),
        HEART("heart"),
        ANTIBIOTIC ("antibiotic"),
        ANTISPASMODICS("antispasmodics");

        private String name;

        MedicinePharmaGroupType(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }
}