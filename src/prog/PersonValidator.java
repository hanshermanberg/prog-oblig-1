package prog;

import java.util.regex.Pattern;

public class PersonValidator {

    public static boolean navn(){
        Pattern regex = Pattern.compile("[A-Z][a-z]* [A-Z][a-z]*");


        return false;
    }
    public static boolean email(){
        return false;
    }
    public static boolean tlfnr(){
        return false;
    }
}
