package algorithm.section1;

import java.util.Scanner;

/**
 * 정규표현식 [^ ] 을 쓰면, 해당 문자가 아닌 것을 찾아낼 수 있다.
 */
public final class 문자열_거르고_회문_Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String alphaInput = input.replaceAll("[^a-zA-Z]", "");

        char[] word = alphaInput.toUpperCase().toCharArray();

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
