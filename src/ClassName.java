import sun.misc.Cleaner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASS_NAME = "[ACP]+\\d{4}[GHIKLM]+$";
    public static final String PHONE_NUMBER_REGEX = "[(]\\d\\d[)]-[(]0\\d{9}[)]";
    Pattern pattern;
    Matcher matcher;
    public static boolean validateName(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();
    }

    public static boolean validatePhoneNumber(String regex){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println(ClassName.validateName("E0920G"));
        System.out.println(ClassName.validatePhoneNumber("(84)-(0999999999)"));
    }

}
