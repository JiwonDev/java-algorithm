package algorithm.section3_two_pointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class 아나그램 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // 맵 한개로 다시 뺴면서 0이하이거나 없을 때 바로 NO를 반환하는게 더 효율적일듯.
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        if (map.entrySet().equals(map2.entrySet())) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
