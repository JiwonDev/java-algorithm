package algorithm.section3_two_pointer;

import java.util.Scanner;

/**
 * 슬라이딩 윈도우!
 */
public final class 슬라이딩_윈도우_최대값 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] sales = new int[n];
        int current = 0;
        for (int i = 0; i < k; i++) {
            sales[i] = scanner.nextInt();
            current += sales[i];
        }

        int max = current;
        for (int i = 0; i < n - k; i++) {
            sales[i + k] = scanner.nextInt();
            current += sales[i + k] - sales[i];
            if (max < current) {
                max = current;
            }
        }
        System.out.println(max);
    }

}
