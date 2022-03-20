package algorithm.section7_dfs_bfs_basic;

import java.util.Scanner;

public final class 기본재귀_팩토리얼 {

    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = dfs(scanner.nextInt());
        System.out.println(n);
    }

    private static int dfs(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * dfs(n - 1);
        }
    }

}
