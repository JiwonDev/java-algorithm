package algorithm.section1;

import java.util.Scanner;

public final class 회문_문자열_확인 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[] word = input.toUpperCase().toCharArray();

        int left = 0;
        int right = word.length - 1;
        while (left < right) {
            if (word[left] != word[right]) {
                System.out.println("NO");
                return;
            }
            left++;
            right--;
        }
        System.out.println("YES");
    }

}
