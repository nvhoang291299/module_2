package Casestudy.validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Scanner sc = new Scanner(System.in);
    private final String REGEX_NAMESERVICE = "^[A-Z]{1}[a-z]+$";
    private final String REGEX_CODESERVICE = "^(SV)(VL|HO|RO)-[0-9]{4}$";
    private final String REGEX_DATEOFBIRTH = "^(0[1-9]|1[012])[\\/](0[1-9]|[12][0-9]|3[01])[\\/](19|20)\\d\\d$";
    private final String NUMBERPHONE_REGEX = "^\\([0-9]{2}\\)-\\((0)[0-9]{9}\\)$";
    private final String EMAIL_REGEX = "^((?!\\.)[\\w-_.]*[^.])(@\\w+)(\\.\\w+(\\.\\w+)?[^.\\W])$";
    public boolean validate(String regex){
        Pattern pattern = null;
        Matcher matcher = null;
        int length = regex.length();
        if (length == 9) {
                pattern = Pattern.compile(REGEX_CODESERVICE);
                matcher = pattern.matcher(regex);
                return matcher.matches();
        } else if (length == 10) {
            pattern = Pattern.compile(REGEX_DATEOFBIRTH);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        } else if (length == 13) {
            pattern = Pattern.compile(NUMBERPHONE_REGEX);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        } else if (length < 9) {
            pattern = Pattern.compile(REGEX_NAMESERVICE);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        } else {
            pattern = Pattern.compile(EMAIL_REGEX);
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
}
