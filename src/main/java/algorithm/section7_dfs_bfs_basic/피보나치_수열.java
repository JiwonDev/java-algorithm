package algorithm.section7_dfs_bfs_basic;

import java.util.Scanner;

public final class 피보나치_수열 {

    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = dfs(scanner.nextInt());
        System.out.println(n);
    }

    private static int dfs(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return dfs(n - 1) + dfs(n - 2);
        }
    }

    private static int fiboByArray(int n) {
        int[] fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        return fibo[n];
    }
}
