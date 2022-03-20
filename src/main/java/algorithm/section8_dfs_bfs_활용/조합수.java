package algorithm.section8_dfs_bfs_활용;

import java.util.Scanner;

class 조합수 {

    int[][] dy = new int[35][35];

    public static void main(String[] args) {
        조합수 T = new 조합수();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int r = kb.nextInt();
        System.out.println(T.dfs(n, r));
    }

    public int dfs(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
        }
    }
}
