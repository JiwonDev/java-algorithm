package algorithm.section8_dfs_bfs_활용;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class 합이같은부분집합 {

    static int[] arr;
    static int n;
    static int total;
    static Set<Integer> set = new HashSet<>();

    static boolean isFound = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new int[n];

        total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        dfs(0, 0);
        if (isFound) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static void dfs(int index, int sum) {
        if (isFound) {
            return;
        }

        if (index == n) {
            if ((total - sum) == sum) {
                isFound = true;
            }
        } else {
            dfs(index + 1, sum + arr[index]);
            dfs(index + 1, sum);
        }
    }
}
