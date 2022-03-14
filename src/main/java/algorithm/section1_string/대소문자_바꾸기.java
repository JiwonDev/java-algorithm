package algorithm.section1_string;

import java.util.Scanner;

/**
 * 문자열을 비교하는 방법도 있지만
 * 'A' - 'a' 의 차이가 32임을 알고 있다면 최적화 할 수 있다.
 */
public final class 대소문자_바꾸기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        StringBuilder sb = new StringBuilder();
        for (char x : word.toCharArray()) {
            sb.append(changeCase(x));
        }

        System.out.println(sb);
    }

    private static char changeCase(char x) {
        int gap = 'a' - 'A';
        if (x <= 'Z') {
            return (char) (x + gap);
        }
        return (char) (x - gap);
    }

}
