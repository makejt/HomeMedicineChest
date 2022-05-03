package by.itstep.makejt.medicinechest.model.entity.conteiner;

import by.itstep.makejt.medicinechest.model.entity.Fenkarol;
import by.itstep.makejt.medicinechest.model.entity.Loperamide;
import by.itstep.makejt.medicinechest.model.entity.Paracetamol;

public class MedicineChest {

    private Paracetamol[] paracetamols;
    private Loperamide[] loperamides;
    private Fenkarol[] fenkarols;

    public MedicineChest() {
        paracetamols = new Paracetamol[0];
        loperamides = new Loperamide[0];
        fenkarols = new Fenkarol[0];
    }

    public MedicineChest(Paracetamol[] paracetamol, Loperamide[] loperamide, Fenkarol[] fenkarol) {
        this();

        if (paracetamol == null) {
            paracetamol = new Paracetamol[0];
        }
        if (loperamide == null) {
            loperamide = new Loperamide[0];
        }
        if (fenkarol == null) {
            fenkarol = new Fenkarol[0];
        }

        this.paracetamols = paracetamol;
        this.loperamides = loperamide;
        this.fenkarols = fenkarol;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (paracetamols == null || loperamides == null || fenkarols == null
                || (paracetamols.length == 0 && loperamides.length == 0 || fenkarols.length == 0)) {
            builder.append("MedicineChest is empty");
        } else {
            builder.append("MedicineChest: \n");
            for (Paracetamol paracetamol : paracetamols) {
                builder.append("\n").append(paracetamol);
            }
            for (Loperamide loperamide : loperamides) {
                builder.append("\n").append(loperamide);
            }
            for (Fenkarol fenkarol : fenkarols) {
                builder.append("\n").append(fenkarol);
            }
        }
        return builder.toString();
    }


    public void addParacetamol(Paracetamol paracetamol) {
        if (paracetamol == null) {
            return;
        }
        Paracetamol[] temp = new Paracetamol[paracetamols.length + 1];
        int i = 0;
        for (; i < paracetamols.length; i++) {
            temp[i] = paracetamols[i];
        }
        temp[i] = paracetamol;
        paracetamols = temp;
    }

    public void addLoperamide(Loperamide loperamide) {
        if (loperamide == null) {
            return;
        }
        Loperamide[] temp = new Loperamide[loperamides.length + 1];
        int i = 0;
        for (; i < loperamides.length; i++) {
            temp[i] = loperamides[i];
        }
        temp[i] = loperamide;
        loperamides = temp;
    }

    public void addFenkarol(Fenkarol fenkarol) {
        if (fenkarol == null) {
            return;
        }
        Fenkarol[] temp = new Fenkarol[fenkarols.length + 1];
        int i = 0;
        for (; i < fenkarols.length; i++) {
            temp[i] = fenkarols[i];
        }
        temp[i] = fenkarol;
        fenkarols = temp;
    }


    public int getCountOfParacetamol() {
        return paracetamols.length;
    }

    public int getCountOfLoperamide() {
        return loperamides.length;
    }

    public int getCountOfFenkarol() {
        return fenkarols.length;
    }

    public Paracetamol getParacetamol(int index) {
        return paracetamols[index];
    }

    public Loperamide getLoperamide(int index) {
        return loperamides[index];
    }

    public Fenkarol getFenkarol(int index) {
        return fenkarols[index];
    }

    public void removeParacetamol (int index){
        Paracetamol [] temp = new Paracetamol[paracetamols.length + 1];
        for (int i = 0, j = 0; i < paracetamols.length; i++) {
            if (i != index){
                temp [j] = paracetamols[i];
                j++;
            }
            paracetamols = temp;
        }
    }


    public void removeLoperamide (int index){
        Loperamide [] temp = new Loperamide[loperamides.length + 1];
        for (int i = 0, j = 0; i < loperamides.length; i++) {
            if (i != index){
                temp [j] = loperamides[i];
                j++;
            }
            loperamides = temp;
        }
    }

    public void removeFenkarol (int index){
        Fenkarol [] temp = new Fenkarol[fenkarols.length + 1];
        for (int i = 0, j = 0; i < fenkarols.length; i++) {
            if (i != index){
                temp [j] = fenkarols[i];
                j++;
            }
            fenkarols = temp;
        }
    }



}





