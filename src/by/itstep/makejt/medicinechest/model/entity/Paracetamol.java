package by.itstep.makejt.medicinechest.model.entity;

public class Paracetamol {

    private String pharmGroup;
    private double price;
    private int count;
    private int expDate;

    public Paracetamol(){

    }

    public Paracetamol(String pharmGroup, double price, int count, int expDate) {
        this.pharmGroup = pharmGroup;
        this.price = price;
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
        return "Paracetamol{" +
                "pharmGroup='" + pharmGroup + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", expDate=" + expDate +
                '}';
    }
}
