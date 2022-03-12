package algorithm.section1;

import java.util.Scanner;

/**
 * StringBuilder나 List 에 있는 메서드를 활용하자.
 */
public final class 문자열_뒤집기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            StringBuilder word = new StringBuilder(scanner.next());
            System.out.println(word.reverse());
        }
    }
}
