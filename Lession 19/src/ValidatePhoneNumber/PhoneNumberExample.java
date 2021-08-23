package ValidatePhoneNumber;

import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String phoneNumberExample = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public PhoneNumberExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(phoneNumberExample);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
