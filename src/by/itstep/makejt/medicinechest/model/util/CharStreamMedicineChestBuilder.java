package by.itstep.makejt.medicinechest.model.util;

import by.itstep.makejt.medicinechest.model.entity.MedicineComponentType;
import by.itstep.makejt.medicinechest.model.entity.abstracts.*;
import by.itstep.makejt.medicinechest.model.entity.conteiner.MedicineChest;
import by.itstep.makejt.medicinechest.model.entity.items.*;
import by.itstep.makejt.medicinechest.model.entity.medicines.*;
import org.apache.log4j.Logger;

import java.io.*;

public class CharStreamMedicineChestBuilder {
    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }
    private String fileName;
    public CharStreamMedicineChestBuilder(String fileName) {
        this.fileName = fileName;
    }

    public void saveMedicineChest(MedicineChest medicineChest) throws MedicineChestFileNoFoundException {
        if (fileName == null) {
            throw new MedicineChestFileNoFoundException();
        }

        try (Writer stream = new BufferedWriter(new FileWriter(fileName))) {

            stream.write(MedicineChest.Name.valueOf(medicineChest.name.toString()) + "\n");

            for (MedicineChestComponent component : medicineChest) {
                if (component instanceof Paracetamol) {
                    Paracetamol paracetamol = (Paracetamol) component;
                    stream.write(MedicineComponentType.PARACETAMOL.name() + " ");
                    stream.write(paracetamol.getPharmaGroup() + " ");
                    stream.write(paracetamol.getPrice() + " ");
                    stream.write(paracetamol.getExpDate() + " ");
                    stream.write(paracetamol.getCount() + " ");
                    stream.write(Paracetamol.FormParacetamolType.valueOf(paracetamol.getForm().toString()) + "\n");
                } else if (component instanceof Loperamide) {
                    Loperamide loperamide = (Loperamide) component;
                    stream.write(MedicineComponentType.LOPERAMIDE.name() + " ");
                    stream.write(loperamide.getPharmaGroup() + " ");
                    stream.write(loperamide.getPrice() + " ");
                    stream.write(loperamide.getExpDate() + " ");
                    stream.write(loperamide.getCount() + " ");
                    stream.write(loperamide.getProducer() + "\n");
                } else if (component instanceof Fenkarol) {
                    Fenkarol fenkarol = (Fenkarol) component;
                    stream.write(MedicineComponentType.FENKAROL.name() + " ");
                    stream.write(fenkarol.getPharmaGroup() + " ");
                    stream.write(fenkarol.getPrice() + " ");
                    stream.write(fenkarol.getExpDate() + " ");
                    stream.write(fenkarol.getCount() + " ");
                    stream.write(fenkarol.getDosage() + "\n");
                } else if (component instanceof Augmentin) {
                    Augmentin augmentin = (Augmentin) component;
                    stream.write(MedicineComponentType.AUGMENTIN.name() + " ");
                    stream.write(augmentin.getPharmaGroup() + " ");
                    stream.write(augmentin.getPrice() + " ");
                    stream.write(augmentin.getExpDate() + " ");
                    stream.write(augmentin.getCount() + " ");
                    stream.write(augmentin.isFreeSold + "\n");
                } else if (component instanceof Euthyrox) {
                    Euthyrox euthyrox = (Euthyrox) component;
                    stream.write(MedicineComponentType.EUTHYROX.name() + " ");
                    stream.write(euthyrox.getPharmaGroup() + " ");
                    stream.write(euthyrox.getPrice() + " ");
                    stream.write(euthyrox.getExpDate() + " ");
                    stream.write(euthyrox.getCount() + " ");
                    stream.write(euthyrox.getDosage() + "\n");
                } else if (component instanceof Herbion) {
                    Herbion herbion = (Herbion) component;
                    stream.write(MedicineComponentType.HERBION.name() + " ");
                    stream.write(herbion.getPharmaGroup() + " ");
                    stream.write(herbion.getPrice() + " ");
                    stream.write(herbion.getExpDate() + " ");
                    stream.write(herbion.getCount() + " ");
                    stream.write(herbion.isKeepRefrigerated + "\n");
                } else if (component instanceof Spazmalgon) {
                    Spazmalgon spazmalgon = (Spazmalgon) component;
                    stream.write(MedicineComponentType.SPAZMALGON.name() + " ");
                    stream.write(spazmalgon.getPharmaGroup() + " ");
                    stream.write(spazmalgon.getPrice() + " ");
                    stream.write(spazmalgon.getExpDate() + " ");
                    stream.write(spazmalgon.getCount() + " ");
                    stream.write(spazmalgon.getDosage() + "\n");
                } else if (component instanceof Teraflu) {
                    Teraflu teraflu = (Teraflu) component;
                    stream.write(MedicineComponentType.TERAFLU.name() + " ");
                    stream.write(teraflu.getPharmaGroup() + " ");
                    stream.write(teraflu.getPrice() + " ");
                    stream.write(teraflu.getExpDate() + " ");
                    stream.write(teraflu.getCount() + " ");
                    stream.write(teraflu.getTaste() + "\n");
                } else if (component instanceof Validol) {
                    Validol validol = (Validol) component;
                    stream.write(MedicineComponentType.VALIDOL.name() + " ");
                    stream.write(validol.getPharmaGroup() + " ");
                    stream.write(validol.getPrice() + " ");
                    stream.write(validol.getExpDate() + " ");
                    stream.write(validol.getCount() + " ");
                    stream.write(Validol.FormValidolType.valueOf(validol.getForm().toString()) + "\n");
                } else if (component instanceof VitaminC) {
                    VitaminC vitaminC = (VitaminC) component;
                    stream.write(MedicineComponentType.VITAMINC.name() + " ");
                    stream.write(vitaminC.getPharmaGroup() + " ");
                    stream.write(vitaminC.getPrice() + " ");
                    stream.write(vitaminC.getExpDate() + " ");
                    stream.write(vitaminC.getCount() + " ");
                    stream.write(vitaminC.getTaste() + "\n");
                } else if (component instanceof Bandage) {
                    Bandage bandage = (Bandage) component;
                    stream.write(MedicineComponentType.BANDAGE.name() + " ");
                    stream.write(bandage.getPrice() + " ");
                    stream.write(bandage.isUsefulness() + " ");
                    stream.write(bandage.getWidth() + "\n");
                } else if (component instanceof Cotton) {
                    Cotton cotton = (Cotton) component;
                    stream.write(MedicineComponentType.COTTON.name() + " ");
                    stream.write(cotton.getPrice() + " ");
                    stream.write(cotton.isUsefulness() + " ");
                    stream.write(cotton.isSterility() + "\n");
                } else if (component instanceof Plaster) {
                    Plaster plaster = (Plaster) component;
                    stream.write(MedicineComponentType.PLASTER.name() + " ");
                    stream.write(plaster.getPrice() + " ");
                    stream.write(plaster.isUsefulness() + " ");
                    stream.write(plaster.isBactericidal() + " ");
                    stream.write(plaster.getWidth() + "\n");
                } else if (component instanceof Scissors) {
                    Scissors scissors = (Scissors) component;
                    stream.write(MedicineComponentType.SCISSORS.name() + " ");
                    stream.write(scissors.getPrice() + " ");
                    stream.write(scissors.isUsefulness() + " ");
                    stream.write(scissors.getSize() + "\n");
                } else if (component instanceof Thermometer) {
                    Thermometer thermometer = (Thermometer) component;
                    stream.write(MedicineComponentType.THERMOMETER.name() + " ");
                    stream.write(thermometer.getPrice() + " ");
                    stream.write(thermometer.isUsefulness() + " ");
                    stream.write(Thermometer.ThermometerType.valueOf(thermometer.getType().toString()) + "\n");
                } else if (component instanceof Tourniquet) {
                    Tourniquet tourniquet = (Tourniquet) component;
                    stream.write(MedicineComponentType.TOURNIQUET.name() + " ");
                    stream.write(tourniquet.getPrice() + " ");
                    stream.write(tourniquet.isUsefulness() + " ");
                    stream.write(tourniquet.getLength() + "\n");
                }
            }

            stream.flush();

        } catch (IOException exception) {
            LOG.warn(exception);;
        }
    }

    public MedicineChest createMedicineChest() throws MedicineChestFileNoFoundException {

        if (fileName == null) {
            throw new MedicineChestFileNoFoundException();
        }

        MedicineChest medicineChest = new MedicineChest();

        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            MedicineChestComponent component = null;

            medicineChest.name = MedicineChest.Name.valueOf(stream.readLine());

            String buf;
            while ((buf = stream.readLine()) != null) {
                String[] strings = buf.split(" ");

                MedicineComponentType type = MedicineComponentType.valueOf(strings[0]);

                switch (type) {
                    case PARACETAMOL: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        Paracetamol.FormParacetamolType form =
                                Paracetamol.FormParacetamolType.valueOf(strings[5]);
                        component = new Paracetamol(pharmaGroup, price, expDate, count, form);
                    }
                    break;
                    case LOPERAMIDE: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        String producer = strings[5];
                        component = new Loperamide(pharmaGroup, price, expDate, count, producer);
                    }
                    break;
                    case FENKAROL: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        double dosage = Double.parseDouble(strings[5]);
                        component = new Fenkarol(pharmaGroup, price, expDate, count, dosage);
                    }
                    break;
                    case AUGMENTIN: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        boolean isFreeSold = Boolean.parseBoolean(strings[5]);
                        component = new Augmentin(pharmaGroup, price, expDate, count, isFreeSold);
                    }
                    break;
                    case EUTHYROX: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        int dosage = Integer.parseInt(strings[5]);
                        component = new Euthyrox(pharmaGroup, price, expDate, count, dosage);
                    }
                    break;
                    case HERBION: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        boolean isKeepRefrigerated = Boolean.parseBoolean(strings[5]);
                        component = new Herbion(pharmaGroup, price, expDate, count, isKeepRefrigerated);
                    }
                    break;
                    case SPAZMALGON: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        double dosage = Double.parseDouble(strings[5]);
                        component = new Spazmalgon(pharmaGroup, price, expDate, count, dosage);
                    }
                    break;
                    case TERAFLU: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        String taste = strings[5];
                        component = new Teraflu(pharmaGroup, price, expDate, count, taste);
                    }
                    break;
                    case VALIDOL: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        Validol.FormValidolType form = Validol.FormValidolType.valueOf(strings[5]);
                        component = new Validol(pharmaGroup, price, expDate, count, form);
                    }
                    break;
                    case VITAMINC: {
                        Medicine.MedicinePharmaGroupType pharmaGroup =
                                Medicine.MedicinePharmaGroupType.valueOf(strings[1]);
                        double price = Double.parseDouble(strings[2]);
                        int expDate = Integer.parseInt(strings[3]);
                        int count = Integer.parseInt(strings[4]);
                        String taste = strings[5];
                        component = new VitaminC(pharmaGroup, price, expDate, count, taste);
                    }
                    break;
                    case BANDAGE: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        int width = Integer.parseInt(strings[3]);
                        component = new Bandage(price, usefulness, width);
                    }
                    break;
                    case COTTON: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        boolean isSterility = Boolean.parseBoolean(strings[3]);
                        component = new Cotton(price, usefulness, isSterility);
                    }
                    break;
                    case PLASTER: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        boolean isBactericidal = Boolean.parseBoolean(strings[3]);
                        int width = Integer.parseInt(strings[4]);
                        component = new Plaster(price, usefulness, isBactericidal, width);
                    }
                    break;
                    case SCISSORS: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        int size = Integer.parseInt(strings[3]);
                        component = new Scissors(price, usefulness, size);
                    }
                    break;
                    case THERMOMETER: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        Thermometer.ThermometerType type1 = Thermometer.ThermometerType.valueOf(strings[3]);
                        component = new Thermometer(price, usefulness, type1);

                    }
                    break;
                    case TOURNIQUET: {
                        double price = Double.parseDouble(strings[1]);
                        boolean usefulness = Boolean.parseBoolean(strings[2]);
                        double length = Double.parseDouble(strings[3]);
                        component = new Tourniquet(price, usefulness, length);
                    }
                    break;
                }
                medicineChest.add(component);
            }
        } catch (IOException exception) {
            LOG.warn(exception);
        }
        return medicineChest;
    }
}