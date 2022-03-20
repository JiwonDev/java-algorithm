package algorithm.section7_dfs_bfs_basic;

import java.util.Scanner;

public final class 기본재귀 {

    static StringBuilder answer = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        dfs(n);
        System.out.println(answer);
    }

    private static void dfs(int n) {
        if (n > 1) {
            dfs(n - 1);
        }
        answer.append(n).append(" ");
    }
}
