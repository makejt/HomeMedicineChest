package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import org.apache.log4j.Logger;

import java.io.*;

public class SerializableMedicineChestBuilder {

    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }
    private static String fileName;

    static {
        fileName = "C:/Test/serializedMedicineChest.txt";
    }

    public static void write(MedicineChest medicineChest) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {
            stream.writeObject(medicineChest);
        } catch (IOException exception) {
            LOG.warn(exception);;
        }
    }
    public static MedicineChest read() {
        MedicineChest medicineChest = null;
        try (ObjectInput stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            medicineChest = (MedicineChest) stream.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            LOG.warn(exception);;
        }
        return medicineChest;
    }
}