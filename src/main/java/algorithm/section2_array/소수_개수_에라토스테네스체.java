package algorithm.section2_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 메모리를 많이 사용해서, 소거법을 쓸 수도 있다. (에라토스테네스 체) 소수를 판별하는 작업은 비용이 비싸다.
 */
public final class 소수_개수_에라토스테네스체 {

    public static final int PRIME = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] isPrime = new int[n + 1];
        Arrays.fill(isPrime, PRIME);
        isPrime[0] = 0;
        isPrime[1] = 0;

        int cursor = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == PRIME) {
                continue;
            }

            cursor = i + i;
            while (cursor <= n) {
                isPrime[cursor] = 0;
                cursor += i;
            }
        }

        int count = sum(isPrime);
        System.out.println(count);
    }

    private static int sum(int[] isPrime) {
        int total = 0;
        for (int i : isPrime) {
            total += i;
        }
        return total;
    }

}
