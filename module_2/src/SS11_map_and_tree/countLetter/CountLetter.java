package SS11_map_and_tree.countLetter;

import java.util.Map;
import java.util.TreeMap;

public class CountLetter {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
    }
}
