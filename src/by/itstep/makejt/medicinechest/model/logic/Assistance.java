package by.itstep.makejt.medicinechest.model.logic;

import by.itstep.makejt.medicinechest.model.entity.iteratorpattern.MyIterator;

public class Assistance {

    public static double calculateTotalPrice (MyIterator iterator){
        double total = 0;

        while (iterator.hasNext()){
            total += iterator.next().getPrice();
        }

        return total;
    }
}
