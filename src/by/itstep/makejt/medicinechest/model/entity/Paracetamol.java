package by.itstep.makejt.medicinechest.model.entity;

import by.itstep.makejt.medicinechest.model.entity.abstracts.Medicine;

public class Paracetamol extends Medicine {

    public Form form;


    public Paracetamol(String pharmGroup, double price, int expDate, int count, Form f) {
        super(pharmGroup, price, expDate, count);
        form = f;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }


    @Override
    public String toString() {
        return "Paracetamol{ " + super.toString() + ", form = " + form.getName() + '}';
    }


    public enum Form {

        PILL("pill"),
        CAPSULE("capsule"),
        SUPPOSITORIES("suppositories"),
        SYRUP("syrup"),
        POWDER("powder");

        private String name;

        Form(String name) {
            this.name = name;
        }


        public String getName() {
            return name;
        }

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
