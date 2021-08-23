package ValidateAcc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAcc {
    private static final String accountRegex="^[_a-z0-9]{6,}$";

    public ValidateAcc(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(accountRegex);
        Matcher matcher= pattern.matcher(regex);
        return  matcher.matches();
    }
}
