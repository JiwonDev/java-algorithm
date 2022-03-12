package algorithm.section1;

import java.util.Scanner;

public final class 문자열_압축하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder result = new StringBuilder();
        char[] word = input.substring(1).toCharArray();
        char target = input.charAt(0);
        int count = 1;

        for (char c : word) {
            if (c != target) {
                appendCompressedValue(result, target, count);
                target = c;
                count = 0;
            }
            count++;
        }

        appendCompressedValue(result, target, count);
        System.out.println(result);
    }

    private static void appendCompressedValue(StringBuilder string, char target, int count) {
        string.append(target);
        if (count > 1) {
            string.append(count);
        }
    }
}
