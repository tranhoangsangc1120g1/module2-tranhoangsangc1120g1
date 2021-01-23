package session_14_exception_debug.bai_tap;

public class NumCheckException extends Exception{
    public NumCheckException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return  "Lỗi nhập và số :" + super.getMessage();
    }
}
