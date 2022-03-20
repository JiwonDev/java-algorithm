package algorithm.section8_dfs_bfs_활용;

import java.util.Scanner;

public final class 최대무게구하기 {

    static int max;
    static int n;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        max = scanner.nextInt(); // 견딜 수 있는 최대 무게, max 포함
        n = scanner.nextInt();

        int[] dogs = new int[n];
        for (int i = 0; i < n; i++) {
            dogs[i] = scanner.nextInt();
        }
        answer = 0;
        dfs(0, 0, dogs);
        System.out.println(answer);
    }

    private static void dfs(int index, int total, int[] dogs) {
        if (total > max) {
            return;
        }
        if (index == n) {
            if (answer < total) {
                answer = total;
            }
        } else {
            dfs(index + 1, dogs[index] + total, dogs);
            dfs(index + 1, total, dogs);
        }
    }

}
