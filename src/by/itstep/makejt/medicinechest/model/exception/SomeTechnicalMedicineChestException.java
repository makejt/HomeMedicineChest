package by.itstep.makejt.medicinechest.model.exception;

public class SomeTechnicalMedicineChestException extends TechnicalMedicineChestException{

    public SomeTechnicalMedicineChestException() {
        super();
    }
    public SomeTechnicalMedicineChestException(String message) {
        super(message);
    }

    public SomeTechnicalMedicineChestException(String message, Throwable cause) {
        super(message, cause);
    }

    public SomeTechnicalMedicineChestException(Throwable cause) {
        super(cause);
    }
}