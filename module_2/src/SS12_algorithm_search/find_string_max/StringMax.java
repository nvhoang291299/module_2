package SS12_algorithm_search.find_string_max;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        ArrayList<Character> arrayMax = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Character> arrTemp = new ArrayList<>();

            arrTemp.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (arrTemp.get(arrTemp.size()-1) < str.charAt(j)){
                    arrTemp.add(str.charAt(j));
                } else {
                    break;
                }
            }
            if (arrTemp.size() > arrayMax.size()){
                arrayMax.clear();
                arrayMax.addAll(arrTemp);
            }
        }
        for (Character max : arrayMax) {
            System.out.print(max);
        }
    }
}
