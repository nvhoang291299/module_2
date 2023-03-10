package SS17_string_regex.exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    private static final String NUMBERPHONE_REGEX = "^\\([0-9]{2}\\)-\\((0)[0-9]{9}\\)$";

    public static boolean validateNumber(String regex){
        Pattern pattern = Pattern.compile(NUMBERPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số điện thoại: ");
        String numberphone = sc.nextLine();
        System.out.println(validateNumber(numberphone));
    }
}
