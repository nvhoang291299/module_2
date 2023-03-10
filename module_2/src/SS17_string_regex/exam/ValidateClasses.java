package SS17_string_regex.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClasses {
    private static final String CLASS_REGEX = "^[ACP]+[_0-9]{4}+[GHIK]$";
    public static boolean validateClass(String regex) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher  matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên lớp: ");
        String classes = sc.nextLine();
        System.out.println(validateClass(classes));
    }
}
