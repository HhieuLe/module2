package ValidateClassname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String classNameRegex="^[ACP][0-9]{4}[GHIKLM]$";
    public ClassNameExample(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(classNameRegex);
        Matcher matcher= pattern.matcher(regex);
        return  matcher.matches();
    }
}
