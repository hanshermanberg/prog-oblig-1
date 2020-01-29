package prog;

public class InvalidDateException extends IllegalArgumentException {

    public InvalidDateException(String msg){
        super(msg);
    }
}
