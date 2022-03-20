package algorithm.section8_dfs_bfs_활용;

import java.util.Scanner;

public final class 최대점수 {

    static int n;
    static int limit;

    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();// 문제의 개수
        limit = scanner.nextInt(); // 제한 시간
        int[] score = new int[n];
        int[] time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
            time[i] = scanner.nextInt();
        }
        answer = 0;
        dfs(0, 0, 0, score, time);
        System.out.println(answer);
    }

    private static void dfs(int index, int sum, int time, int[] scores, int[] times) {
        if (time > limit) {
            return;
        }
        if (index == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(index + 1, sum + scores[index], time + times[index], scores, times);
            dfs(index + 1, sum, time, scores, times);
        }
    }
}
