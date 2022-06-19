package by.itstep.makejt.medicinechest.model.entity.conteiner;

public class MedicineChest {

    private MedicinesSection section1;
    private ItemsSection section2;
    public Name name;

    public MedicineChest(MedicinesSection section1, ItemsSection section2, Name name) {
        this.section1 = section1;
        this.section2 = section2;
        this.name = name;
    }

    public int size() {
        return section1.size() + section2.size();
    }

        @Override
    public String toString() {
        return "MedicineChest " +  name.getName() + ":" + "\n" + "\n" + section1 + "\n" + "\n" + section2;
    }

    public enum Name {
        ADULT ("for adults"),
        CHILD ("for children"),
        TRAVEL ("for travelling"),
        AUTO ("for car");

        private String name;

        Name(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}