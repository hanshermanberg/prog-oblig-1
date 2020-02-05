package prog;

import java.util.regex.Pattern;

public class PersonValidator {

    public static boolean navn(String navn){
        return navn.matches("[A-Z][a-z]* [A-Z][a-z]*");
    }
    public static boolean email(String email){
        return email.matches("[A-Za-z0-9._-]*[@][A-Za-z0-9_-]*[.][A-Za-z.]*");
    }
    public static boolean tlfnr(String tlfnr){
        return tlfnr.matches("^((0047)?|(\\\"+47)?|(47)?)\\\"d{8}$");
    }
}
