package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.util.*;

public class Main {
    public static void main(String[] args) throws MedicineChestFileNoFoundException {

        ControllerSimpleFactory.ControllerType type = ControllerSimpleFactory.ControllerType.BYTESTREAM;
        MedicineChestController controller = ControllerSimpleFactory.getController(type);
        controller.doIt();
    }
}