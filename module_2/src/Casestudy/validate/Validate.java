package Casestudy.validate;

import java.util.Scanner;

public class Validate {
    Scanner sc = new Scanner(System.in);
    private final String REGEX_CODE = "^(SV)(VL|HO|RO)-\\d{4}$";
    private final String REGEX_NAMESERVICE = "^[A-Z]{1}[a-z]+$";
    public void validate(){
        System.out.println("nhập mã dịch vụ: ");
        String code = sc.nextLine();
        System.out.println("tên dịch vụ: ");
        String nameService = sc.nextLine();
        System.out.println("nhập diện tích sử dụng:");

        try {
            float areaUse = Float.parseFloat(sc.nextLine());
        } catch (Exception e){
            System.out.println("bạn nhập sai định dạng");
        }
    }
}
