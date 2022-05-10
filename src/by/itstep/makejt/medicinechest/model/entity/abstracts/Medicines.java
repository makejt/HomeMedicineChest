package by.itstep.makejt.medicinechest.model.entity.abstracts;

public class Medicines {

    private String pharmGroup;
    private double price;
    private int expDate;


    public Medicines() {

    }

    public Medicines(String pharmGroup, double price, int expDate) {
        this.pharmGroup = pharmGroup;
        this.price = price;
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
        if (price > 0) {
            this.price = price;
        }
    }

    public int getExpDate() {
        return expDate;
    }

    public void setExpDate(int expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "pharmGroup = " + pharmGroup + ", price = " + price + ", expDate = " + expDate;
    }
}
