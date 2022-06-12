package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

public class Paracetamol extends Medicine {

    private Form form1;


//
//    public static final Paracetamol PILL = new Paracetamol("pill");
//    public static final Paracetamol CAPSULE = new Paracetamol("capsule");
//    public static final Paracetamol SUPPOSITORIES = new Paracetamol("suppositories");
//    public static final Paracetamol SYRUP = new Paracetamol("syrup");
//    public static final Paracetamol POWDER = new Paracetamol("powder");

    public Paracetamol(String pharmGroup, double price, int expDate, int count, Form form) {
        super(pharmGroup, price, expDate, count);
        form1 = form;
    }


    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Paracetamol{ " + super.toString() + ", form = " + form + '}';
    }


    enum Form {

        PILL,
        CAPSULE,
        SUPPOSITORIES,
        SYRUP,
        POWDER
    }



}

//    @Override
//    public int compareTo(Medicine o) {
////        if (getClass() != o.getClass()) {
////            return 1;
////        }
////        Paracetamol paracetamol = (Paracetamol) o;
////        return form.compareTo (paracetamol, form);
////    }
