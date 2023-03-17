package Casestudy.validate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    Scanner sc = new Scanner(System.in);
    private final String REGEX_NAMESERVICE = "^[A-Z]{1}[a-z]+$";
    private final String REGEX_CODESERVICE = "^(SV)(VL|HO|RO)-[0-9]{4}$";
    public boolean validate(String regex){
        if (regex.length() == 9){
            Pattern pattern = Pattern.compile(REGEX_CODESERVICE);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        } else {
            Pattern pattern = Pattern.compile(REGEX_NAMESERVICE);
            Matcher matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
}
