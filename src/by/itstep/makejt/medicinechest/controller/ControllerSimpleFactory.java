package by.itstep.makejt.medicinechest.controller;

import java.util.HashMap;

public class ControllerSimpleFactory {

    public enum ControllerType {
        BYTESTREAM, CHARSTREAM, HARDCODE, RANDOM, SERIALIZE;
    }
    private static HashMap<ControllerType, MedicineChestController> map;

    static {
        map = new HashMap<>();
        map.put(ControllerType.BYTESTREAM, new ByteStreamController());
        map.put(ControllerType.CHARSTREAM, new CharStreamController());
        map.put(ControllerType.HARDCODE, new HardcodeController());
        map.put(ControllerType.RANDOM, new RandomController());
        map.put(ControllerType.SERIALIZE, new SerializableController());
    }

    public static MedicineChestController getController(ControllerType key) {
        return map.get(key);
    }

    public static void addController(ControllerType key, MedicineChestController value) {
        map.put(key, value);
    }
}