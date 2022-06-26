package by.itstep.makejt.medicinechest.model.exception;

public class TechnicalMedicineChestException extends HomeMedicineChestProjectException{
    public TechnicalMedicineChestException() {
        super();
    }
    public TechnicalMedicineChestException(String message) {
        super(message);
    }
    public TechnicalMedicineChestException(String message, Throwable cause) {
        super(message, cause);
    }
    public TechnicalMedicineChestException(Throwable cause) {
        super(cause);
    }
}