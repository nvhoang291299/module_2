package SS11_map_and_tree.countLetter;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String str = sc.nextLine();
        Map<String, Integer> wordMap = new TreeMap<>();
        String key;
        for (int i = 0; i < str.length(); i++) {
            key = String.valueOf(str.toLowerCase().charAt(i));
            if (wordMap.containsKey(key)){
                wordMap.put(key, wordMap.get(key) + 1);
            } else {
                wordMap.put(key, 1);
            }
        }
        System.out.println(wordMap);
    }
}
