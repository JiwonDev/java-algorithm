package algorithm.section2_array;

import java.util.Scanner;

/**
 * 개꿀팁 - 숫자 N이 소수인지 알고싶다면, root(N) 포함해서 여기까지 나눠보면 된다. (그 뒤쪽에는 나누어짐)
 */
public final class 뒤집어서_소수인지_판별하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            clear(sb);
            sb.append(scanner.next());
            int number = Integer.parseInt(sb.reverse().toString());
            if (isPrime(number)) {
                result.append(number).append(" ");
            }
        }

        System.out.println(result);
    }

    private static void clear(StringBuilder sb) {
        sb.delete(0, sb.length());
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; (i * i) <= number; i++) { // i < root(number)
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
