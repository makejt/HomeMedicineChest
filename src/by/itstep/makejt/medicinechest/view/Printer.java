package by.itstep.makejt.medicinechest.view;

import org.apache.log4j.Logger;

public class Printer {
    private static final Logger LOG;

    static {
        LOG = Logger.getRootLogger();
    }
    public static void print(String msg) {
        System.out.print(msg);
        LOG.info(msg);
    }
}
