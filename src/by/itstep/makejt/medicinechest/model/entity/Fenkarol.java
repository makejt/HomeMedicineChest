package by.itstep.makejt.medicinechest.model.entity;

public class Fenkarol {

    private String pharmGroup;
    private double price;
    public double dosage;
    private int count;
    private int expDate;

    public Fenkarol(){

    }

    public Fenkarol(String pharmGroup, double price, double dosage, int count, int expDate) {
        this.pharmGroup = pharmGroup;
        this.price = price;
        this.dosage = dosage;
        this.count = count;
        this.expDate = expDate;
    }

    public String getPharmGroup() {
        return pharmGroup;
    }

    public void setPharmGroup(String pharmGroup) {
        this.pharmGroup = pharmGroup;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDosage() {
        return dosage;
    }

    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Fenkarol{" +
                "pharmGroup='" + pharmGroup + '\'' +
                ", price=" + price +
                ", dosage=" + dosage +
                ", count=" + count +
                ", expDate=" + expDate +
                '}';
    }



}
