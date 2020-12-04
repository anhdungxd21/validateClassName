import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASS_NAME = "[ACP]+\\d{4}[GHIKLM]+$";

    public static boolean validateName(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(ClassName.validateName("E0920G"));
    }
}
