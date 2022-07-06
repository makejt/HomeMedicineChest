package by.itstep.makejt.medicinechest.model.entity;

public enum MedicineComponentType {

    PARACETAMOL("парацетамол"),
    LOPERAMIDE("лоперамид"),
    FENKAROL("фенкарол"),
    AUGMENTIN("агументин"),
    EUTHYROX("эутирокс"),
    HERBION("гербион"),
    SPAZMALGON("смазмалгон"),
    TERAFLU("терафлю"),
    VALIDOL("валидол"),
    VITAMINC("аскорбиновая кислота"),
    BANDAGE("бинт"),
    COTTON("вата"),
    PLASTER("пластырь"),
    SCISSORS("ножницы"),
    THERMOMETER("термометр"),
    TOURNIQUET("жгут");

    String name;

    MedicineComponentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}