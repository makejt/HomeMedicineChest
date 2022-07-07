package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.MedicineComponentType;
import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;
import org.apache.log4j.Logger;
import java.io.*;

public class ByteStreamMedicineChestBuilder {

    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }
    private String fileName;

    public ByteStreamMedicineChestBuilder(String name) {
        this.fileName = name;
    }

    public void saveMedicineChest(MedicineChest medicineChest) throws MedicineChestFileNoFoundException {
        if (fileName == null) {
            throw new MedicineChestFileNoFoundException();
        }
        DataOutputStream stream = null;
        try {
            stream = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(fileName)));

            stream.writeInt(MedicineChest.Name.valueOf(medicineChest.getName().toString()).ordinal());
            LOG.info("MedicineChest name " + MedicineChest.Name.valueOf(medicineChest.getName().toString()).ordinal());

            for (MedicineChestComponent component : medicineChest) {
                if (component instanceof Paracetamol) {
                    Paracetamol paracetamol = (Paracetamol) component;
                    stream.writeInt(MedicineComponentType.PARACETAMOL.ordinal());
                    LOG.info("write PARACETAMOL " + MedicineComponentType.PARACETAMOL.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.FEBRIFUGE.name().toString());
                    stream.writeDouble(paracetamol.getPrice());
                    stream.writeInt(paracetamol.getExpDate());
                    stream.writeInt(paracetamol.getCount());
                       stream.writeUTF(paracetamol.getForm().toString());
                } else if (component instanceof Loperamide) {
                    Loperamide loperamide = (Loperamide) component;
                    stream.writeInt(MedicineComponentType.LOPERAMIDE.ordinal());
                    LOG.info("write LOPERAMIDE" + MedicineComponentType.LOPERAMIDE.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.DIARRHEA.name().toString());
                    stream.writeDouble(loperamide.getPrice());
                    stream.writeInt(loperamide.getExpDate());
                    stream.writeInt(loperamide.getCount());
                    stream.writeUTF(loperamide.getProducer());
                } else if (component instanceof Fenkarol) {
                    Fenkarol fenkarol = (Fenkarol) component;
                    stream.writeInt(MedicineComponentType.FENKAROL.ordinal());
                    LOG.info("write FENKAROL" + MedicineComponentType.FENKAROL.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.ANTIHISTAMINE.name().toString());
                    stream.writeDouble(fenkarol.getPrice());
                    stream.writeInt(fenkarol.getExpDate());
                    stream.writeInt(fenkarol.getCount());
                    stream.writeDouble(fenkarol.getDosage());
                } else if (component instanceof Augmentin) {
                    Augmentin augmentin = (Augmentin) component;
                    stream.writeInt(MedicineComponentType.AUGMENTIN.ordinal());
                    LOG.info("write AUGMENTIN" + MedicineComponentType.AUGMENTIN.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.FEBRIFUGE.name().toString());
                    stream.writeDouble(augmentin.getPrice());
                    stream.writeInt(augmentin.getExpDate());
                    stream.writeInt(augmentin.getCount());
                    stream.writeBoolean(augmentin.isFreeSold);
                } else if (component instanceof Euthyrox) {
                    Euthyrox euthyrox = (Euthyrox) component;
                    stream.writeInt(MedicineComponentType.EUTHYROX.ordinal());
                    LOG.info("write EUTHYROX" + MedicineComponentType.EUTHYROX.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.HORMONAL.name().toString());
                    stream.writeDouble(euthyrox.getPrice());
                    stream.writeInt(euthyrox.getExpDate());
                    stream.writeInt(euthyrox.getCount());
                    stream.writeInt(euthyrox.getDosage());
                } else if (component instanceof Herbion) {
                    Herbion herbion = (Herbion) component;
                    stream.writeInt(MedicineComponentType.HERBION.ordinal());
                    LOG.info("write HERBION" + MedicineComponentType.HERBION.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.FEBRIFUGE.name().toString());
                    stream.writeDouble(herbion.getPrice());
                    stream.writeInt(herbion.getExpDate());
                    stream.writeInt(herbion.getCount());
                    stream.writeBoolean(herbion.isKeepRefrigerated);
                } else if (component instanceof Spazmalgon) {
                    Spazmalgon spazmalgon = (Spazmalgon) component;
                    stream.writeInt(MedicineComponentType.SPAZMALGON.ordinal());
                    LOG.info("write SPAZMALGON" + MedicineComponentType.SPAZMALGON.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.ANTISPASMODICS.name().toString());
                    stream.writeDouble(spazmalgon.getPrice());
                    stream.writeInt(spazmalgon.getExpDate());
                    stream.writeInt(spazmalgon.getCount());
                    stream.writeDouble(spazmalgon.getDosage());
                } else if (component instanceof Teraflu) {
                    Teraflu teraflu = (Teraflu) component;
                    stream.writeInt(MedicineComponentType.TERAFLU.ordinal());
                    LOG.info("write TERAFLU" + MedicineComponentType.TERAFLU.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.FEBRIFUGE.name().toString());
                    stream.writeDouble(teraflu.getPrice());
                    stream.writeInt(teraflu.getExpDate());
                    stream.writeInt(teraflu.getCount());
                    stream.writeUTF(teraflu.getTaste());
                } else if (component instanceof Validol) {
                    Validol validol = (Validol) component;
                    stream.writeInt(MedicineComponentType.VALIDOL.ordinal());
                    LOG.info("write VALIDOL" + MedicineComponentType.VALIDOL.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.HEART.name().toString());
                    stream.writeDouble(validol.getPrice());
                    stream.writeInt(validol.getExpDate());
                    stream.writeInt(validol.getCount());
                    stream.writeUTF(validol.getForm().toString());
                } else if (component instanceof VitaminC) {
                    VitaminC vitaminC = (VitaminC) component;
                    stream.writeInt(MedicineComponentType.VITAMINC.ordinal());
                    LOG.info("write VITAMINC" + MedicineComponentType.VITAMINC.ordinal());
                    stream.writeUTF(Medicine.MedicinePharmaGroupType.FEBRIFUGE.name().toString());
                    stream.writeDouble(vitaminC.getPrice());
                    stream.writeInt(vitaminC.getExpDate());
                    stream.writeInt(vitaminC.getCount());
                    stream.writeUTF(vitaminC.getTaste());
                } else if (component instanceof Bandage) {
                    Bandage bandage = (Bandage) component;
                    stream.writeInt(MedicineComponentType.BANDAGE.ordinal());
                    stream.writeDouble(bandage.getPrice());
                    stream.writeBoolean(bandage.isUsefulness());
                    stream.writeInt(bandage.getWidth());
                } else if (component instanceof Cotton) {
                    Cotton cotton = (Cotton) component;
                    stream.writeInt(MedicineComponentType.COTTON.ordinal());
                    stream.writeDouble(cotton.getPrice());
                    stream.writeBoolean(cotton.isUsefulness());
                    stream.writeBoolean(cotton.isSterility());
                } else if (component instanceof Plaster) {
                    Plaster plaster = (Plaster) component;
                    stream.writeInt(MedicineComponentType.PLASTER.ordinal());
                    stream.writeDouble(plaster.getPrice());
                    stream.writeBoolean(plaster.isUsefulness());
                    stream.writeBoolean(plaster.isBactericidal());
                    stream.writeInt(plaster.getWidth());
                } else if (component instanceof Scissors) {
                    Scissors scissors = (Scissors) component;
                    stream.writeInt(MedicineComponentType.SCISSORS.ordinal());
                    stream.writeDouble(scissors.getPrice());
                    stream.writeBoolean(scissors.isUsefulness());
                    stream.writeInt(scissors.getSize());
                } else if (component instanceof Thermometer) {
                    Thermometer thermometer = (Thermometer) component;
                    stream.writeInt(MedicineComponentType.THERMOMETER.ordinal());
                    stream.writeDouble(thermometer.getPrice());
                    stream.writeBoolean(thermometer.isUsefulness());
                    stream.writeInt(Thermometer.ThermometerType.valueOf(thermometer.getType().toString()).ordinal());
                } else if (component instanceof Tourniquet) {
                    Tourniquet tourniquet = (Tourniquet) component;
                    stream.writeInt(MedicineComponentType.TOURNIQUET.ordinal());
                    stream.writeDouble(tourniquet.getPrice());
                    stream.writeBoolean(tourniquet.isUsefulness());
                    stream.writeDouble(tourniquet.getLength());
                }
            }
            stream.flush();
        } catch (IOException exception) {
            LOG.warn(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    LOG.warn(exception);
                }
            }
        }
    }

    public MedicineChest createMedicineChest() throws MedicineChestFileNoFoundException {
        MedicineChest medicineChest = new MedicineChest();

        if (fileName == null) {
            throw new MedicineChestFileNoFoundException();
        }
        DataInputStream stream = null;
        try {
            stream = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(fileName)));
            medicineChest.name = MedicineChest.Name.values()[stream.readInt()];
            LOG.info("read name = " + medicineChest.name);
            while (stream.available() != 0) {

                MedicineChestComponent component = null;

                int index = stream.readInt();

                MedicineComponentType type = MedicineComponentType.values()[index];
                switch (type) {
                    case PARACETAMOL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                                               double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        Paracetamol.FormParacetamolType form = Paracetamol.FormParacetamolType.valueOf(stream.readUTF());
                        component = new Paracetamol(medicinePharmaGroupType, price, expDate, count, form);
                        LOG.info(component);

                    }
                    break;
                    case LOPERAMIDE: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());

                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String producer = stream.readUTF();
                        component = new Loperamide(medicinePharmaGroupType, price, expDate, count, producer);
                        LOG.info(component);

                    }
                    break;
                    case FENKAROL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        double dosage = stream.readDouble();
                        component = new Fenkarol(medicinePharmaGroupType, price, expDate, count, dosage);
                        LOG.info(component);

                    }
                    break;
                    case AUGMENTIN: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        boolean isFreeSold = stream.readBoolean();
                        component = new Augmentin(medicinePharmaGroupType, price, expDate, count, isFreeSold);
                        LOG.info(component);

                    }
                    break;
                    case EUTHYROX: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        int dosage = stream.readInt();
                        component = new Euthyrox(medicinePharmaGroupType, price, expDate, count, dosage);
                        LOG.info(component);

                    }
                    break;
                    case HERBION: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        boolean isKeepRefrigerated = stream.readBoolean();
                        component = new Herbion(medicinePharmaGroupType, price, expDate, count, isKeepRefrigerated);
                        LOG.info(component);

                    }
                    break;
                    case SPAZMALGON: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        double dosage = stream.readDouble();
                        component = new Spazmalgon(medicinePharmaGroupType, price, expDate, count, dosage);
                        LOG.info(component);

                    }
                    break;
                    case TERAFLU: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String taste = stream.readUTF();
                        component = new Teraflu(medicinePharmaGroupType, price, expDate, count, taste);
                        LOG.info(component);

                    }
                    break;
                    case VALIDOL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        Validol.FormValidolType form = Validol.FormValidolType.valueOf(stream.readUTF());
                        component = new Validol(medicinePharmaGroupType, price, expDate, count, form);
                        LOG.info(component);

                    }
                    break;
                    case VITAMINC: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.valueOf(stream.readUTF());
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String taste = stream.readUTF();
                        component = new VitaminC(medicinePharmaGroupType, price, expDate, count, taste);
                        LOG.info(component);

                    }
                    break;
                    case BANDAGE: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        int width = stream.readInt();
                        component = new Bandage(price, usefulness, width);
                        LOG.info(component);

                    }
                    break;
                    case COTTON: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        boolean isSterility = stream.readBoolean();
                        component = new Cotton(price, usefulness, isSterility);
                        LOG.info(component);

                    }
                    break;
                    case PLASTER: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        boolean isBactericidal = stream.readBoolean();
                        int width = stream.readInt();
                        component = new Plaster(price, usefulness, isBactericidal, width);
                        LOG.info(component);
                    }
                    break;
                    case SCISSORS: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        int size = stream.readInt();
                        component = new Scissors(price, usefulness, size);
                        LOG.info(component);

                    }
                    break;
                    case THERMOMETER: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        Thermometer.ThermometerType type1 = Thermometer.ThermometerType.values()[stream.readInt()];
                        component = new Thermometer(price, usefulness, type1);
                        LOG.info(component);

                    }
                    break;
                    case TOURNIQUET: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        double length = stream.readDouble();
                        component = new Tourniquet(price, usefulness, length);
                        LOG.info(component);

                    }
                    break;
                }
                medicineChest.add(component);
                LOG.info("add " + component);

            }
        } catch (EOFException exception) {
        } catch (IOException exception) {
            LOG.warn(exception);
        } finally {
            if (stream == null) {
                try {
                    stream.close();
                } catch (IOException exception) {
                    LOG.warn(exception);
                }
            }
        }
        return medicineChest;
    }
}