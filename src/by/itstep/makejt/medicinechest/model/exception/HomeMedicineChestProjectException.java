package by.itstep.makejt.medicinechest.model.exception;

public class HomeMedicineChestProjectException extends Exception{
    public HomeMedicineChestProjectException() {
        super();
    }
    public HomeMedicineChestProjectException(String message) {
        super(message);
    }

    public HomeMedicineChestProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public HomeMedicineChestProjectException(Throwable cause) {
        super(cause);
    }
}