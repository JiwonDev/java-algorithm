package algorithm.section1_string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * LinkedHashSet, 순서를 보장하는 Set을 알면 간단한 문제
 */
public final class 중복_알파벳_제거_순서유지 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Set<Character> set = new LinkedHashSet<>();

        char[] word = input.toCharArray();
        for (char c : word) {
            set.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Object c : set.toArray()) {
            result.append(c);
        }

        System.out.println(result);
    }
}
