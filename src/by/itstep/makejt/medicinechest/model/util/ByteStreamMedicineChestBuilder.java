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

            for (MedicineChestComponent component : medicineChest) {
                if (component instanceof Paracetamol) {
                    Paracetamol paracetamol = (Paracetamol) component;
                    stream.writeInt(MedicineComponentType.PARACETAMOL.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.FEBRIFUGE.ordinal());
                    stream.writeDouble(paracetamol.getPrice());
                    stream.writeInt(paracetamol.getExpDate());
                    stream.writeInt(paracetamol.getCount());
                    stream.writeInt(Paracetamol.FormParacetamolType.valueOf
                            (paracetamol.getForm().toString()).ordinal());
                } else if (component instanceof Loperamide) {
                    Loperamide loperamide = (Loperamide) component;
                    stream.writeInt(MedicineComponentType.LOPERAMIDE.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.DIARRHEA.ordinal());
                    stream.writeDouble(loperamide.getPrice());
                    stream.writeInt(loperamide.getExpDate());
                    stream.writeInt(loperamide.getCount());
                    stream.writeUTF(loperamide.getProducer());
                } else if (component instanceof Fenkarol) {
                    Fenkarol fenkarol = (Fenkarol) component;
                    stream.writeInt(MedicineComponentType.FENKAROL.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.ANTIHISTAMINE.ordinal());
                    stream.writeDouble(fenkarol.getPrice());
                    stream.writeInt(fenkarol.getCount());
                    stream.writeDouble(fenkarol.getDosage());
                } else if (component instanceof Augmentin) {
                    Augmentin augmentin = (Augmentin) component;
                    stream.writeInt(MedicineComponentType.AUGMENTIN.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.FEBRIFUGE.ordinal());
                    stream.writeDouble(augmentin.getPrice());
                    stream.writeInt(augmentin.getExpDate());
                    stream.writeInt(augmentin.getCount());
                    stream.writeBoolean(augmentin.isFreeSold);
                } else if (component instanceof Euthyrox) {
                    Euthyrox euthyrox = (Euthyrox) component;
                    stream.writeInt(MedicineComponentType.EUTHYROX.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.HORMONAL.ordinal());
                    stream.writeDouble(euthyrox.getPrice());
                    stream.writeInt(euthyrox.getCount());
                    stream.writeInt(euthyrox.getDosage());
                } else if (component instanceof Herbion) {
                    Herbion herbion = (Herbion) component;
                    stream.writeInt(MedicineComponentType.HERBION.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.FEBRIFUGE.ordinal());
                    stream.writeDouble(herbion.getPrice());
                    stream.writeInt(herbion.getCount());
                    stream.writeBoolean(herbion.isKeepRefrigerated);
                } else if (component instanceof Spazmalgon) {
                    Spazmalgon spazmalgon = (Spazmalgon) component;
                    stream.writeInt(MedicineComponentType.SPAZMALGON.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.ANTISPASMODICS.ordinal());
                    stream.writeDouble(spazmalgon.getPrice());
                    stream.writeInt(spazmalgon.getCount());
                    stream.writeDouble(spazmalgon.getDosage());
                } else if (component instanceof Teraflu) {
                    Teraflu teraflu = (Teraflu) component;
                    stream.writeInt(MedicineComponentType.TERAFLU.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.FEBRIFUGE.ordinal());
                    stream.writeDouble(teraflu.getPrice());
                    stream.writeInt(teraflu.getCount());
                    stream.writeUTF(teraflu.getTaste());
                } else if (component instanceof Validol) {
                    Validol validol = (Validol) component;
                    stream.writeInt(MedicineComponentType.VALIDOL.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.HEART.ordinal());
                    stream.writeDouble(validol.getPrice());
                    stream.writeInt(validol.getCount());
                    stream.writeUTF(validol.formValidolType.getName());
                } else if (component instanceof VitaminC) {
                    VitaminC vitaminC = (VitaminC) component;
                    stream.writeInt(MedicineComponentType.VITAMINC.ordinal());
                    stream.writeInt(Medicine.MedicinePharmaGroupType.FEBRIFUGE.ordinal());
                    stream.writeDouble(vitaminC.getPrice());
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
            while (stream.available() != 0) {

                MedicineChestComponent component = null;

                int index = stream.readInt();

                MedicineComponentType type = MedicineComponentType.values()[index];
                switch (type) {
                    case PARACETAMOL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        Paracetamol.FormParacetamolType form =
                                Paracetamol.FormParacetamolType.values()[stream.readInt()];
                        component = new Paracetamol(medicinePharmaGroupType, price, expDate, count, form);
                    }
                    break;
                    case LOPERAMIDE: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String producer = stream.readUTF();
                        component = new Loperamide(medicinePharmaGroupType, price, expDate, count, producer);
                    }
                    break;
                    case FENKAROL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        double dosage = stream.readDouble();
                        component = new Fenkarol(medicinePharmaGroupType, price, expDate, count, dosage);
                    }
                    break;
                    case AUGMENTIN: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        boolean isFreeSold = stream.readBoolean();
                        component = new Augmentin(medicinePharmaGroupType, price, expDate, count, isFreeSold);
                    }
                    break;
                    case EUTHYROX: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        int dosage = stream.readInt();
                        component = new Euthyrox(medicinePharmaGroupType, price, expDate, count, dosage);
                    }
                    break;
                    case HERBION: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        boolean isKeepRefrigerated = stream.readBoolean();
                        component = new Herbion(medicinePharmaGroupType, price, expDate, count, isKeepRefrigerated);
                    }
                    break;
                    case SPAZMALGON: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        double dosage = stream.readDouble();
                        component = new Spazmalgon(medicinePharmaGroupType, price, expDate, count, dosage);
                    }
                    break;
                    case TERAFLU: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String taste = stream.readUTF();
                        component = new Teraflu(medicinePharmaGroupType, price, expDate, count, taste);
                    }
                    break;
                    case VALIDOL: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        Validol.FormValidolType form = Validol.FormValidolType.values()[stream.readInt()];
                        component = new Validol(medicinePharmaGroupType, price, expDate, count, form);
                    }
                    break;
                    case VITAMINC: {
                        Medicine.MedicinePharmaGroupType medicinePharmaGroupType =
                                Medicine.MedicinePharmaGroupType.values()[stream.readInt()];
                        double price = stream.readDouble();
                        int expDate = stream.readInt();
                        int count = stream.readInt();
                        String taste = stream.readUTF();
                        component = new VitaminC(medicinePharmaGroupType, price, expDate, count, taste);
                    }
                    break;
                    case BANDAGE: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        int width = stream.readInt();
                        component = new Bandage(price, usefulness, width);
                    }
                    break;
                    case COTTON: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        boolean isSterility = stream.readBoolean();
                        component = new Cotton(price, usefulness, isSterility);
                    }
                    break;
                    case PLASTER: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        boolean isBactericidal = stream.readBoolean();
                        int width = stream.readInt();
                        component = new Plaster(price, usefulness, isBactericidal, width);
                    }
                    break;
                    case SCISSORS: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        int size = stream.readInt();
                        component = new Scissors(price, usefulness, size);
                    }
                    break;
                    case THERMOMETER: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        Thermometer.ThermometerType type1 = Thermometer.ThermometerType.values()[stream.readInt()];
                        component = new Thermometer(price, usefulness, type1);
                    }
                    break;
                    case TOURNIQUET: {
                        double price = stream.readDouble();
                        boolean usefulness = stream.readBoolean();
                        double length = stream.readDouble();
                        component = new Tourniquet(price, usefulness, length);
                    }
                    break;
                }
                medicineChest.add(component);
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