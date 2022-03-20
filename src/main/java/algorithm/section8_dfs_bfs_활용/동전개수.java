package algorithm.section8_dfs_bfs_활용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public final class 동전개수 {

    static int target;
    static int n;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 가장 적은 수의 동전으로교환, 동전 수는 무한
        n = scanner.nextInt();
        Integer[] coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        target = scanner.nextInt();

        Arrays.sort(coins, Comparator.reverseOrder());
        dfs(0, 0, coins);
        System.out.println(answer);
    }

    private static void dfs(int count, int sum, Integer[] coins) {
        if (count >= answer || sum > target) {
            return;
        }

        if (sum == target) {
            answer = Math.min(answer, count);

        } else {
            for (int i = 0; i < n; i++) {
                dfs(count + 1, sum + coins[i], coins);
            }
        }
    }
}
