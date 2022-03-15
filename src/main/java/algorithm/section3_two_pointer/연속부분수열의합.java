package algorithm.section3_two_pointer;

import java.util.Scanner;

public final class 연속부분수열의합 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int lt = 0;
        int sum = 0;
        int count = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                count++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

}
