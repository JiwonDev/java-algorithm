package algorithm.section7_dfs_bfs_basic;

import java.util.Scanner;

/**
 * 정적인 상태값을 이용한 재귀함수
 */
public final class 모든_부분수열_순서대로_출력하기 {

    static StringBuilder answer = new StringBuilder();
    static boolean[] isUsed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        isUsed = new boolean[n + 1];
        dfs(1, n);
        System.out.println(answer);

    }

    private static void dfs(int str, int n) {
        if (str > n) {
            for (int i = 1; i <= n; i++) {
                if (isUsed[i]) {answer.append(i).append(" ");}
            }
            answer.deleteCharAt(answer.length() - 1);
            answer.append("\n");
        } else {
            isUsed[str] = true;
            dfs(str + 1, n);

            isUsed[str] = false;
            dfs(str + 1, n);
        }

    }
}
