package algorithm.section4_hash_and_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class 반장선거 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Character, Integer> map = new HashMap<>();

        String vote = scanner.next();
        char[] chars = vote.toCharArray();

        char student;
        Integer temp = 0;
        for (int i = 0; i < n; i++) {
            student = chars[i];
            map.put(student, map.getOrDefault(student, 0) + 1);
        }

        ArrayList<Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        System.out.println(list.get(0).getKey());
    }

}
