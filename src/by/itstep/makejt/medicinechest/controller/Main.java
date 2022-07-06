package by.itstep.makejt.medicinechest.controller;

import by.itstep.makejt.medicinechest.model.util.*;
import org.apache.log4j.BasicConfigurator;

public class Main {


    public static void main(String[] args) throws MedicineChestFileNoFoundException {

        BasicConfigurator.configure();

        ControllerSimpleFactory.ControllerType type = ControllerSimpleFactory.ControllerType.RANDOM;

        MedicineChestController controller = ControllerSimpleFactory.getController(type);

        controller.doIt();
    }
}