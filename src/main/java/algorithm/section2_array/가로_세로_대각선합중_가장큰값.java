package algorithm.section2_array;

import java.util.Scanner;

public final class 가로_세로_대각선합중_가장큰값 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] board = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                board[row][col] = scanner.nextInt();
            }
        }

        int max = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += board[i][j];
                sum2 += board[j][i];
            }
            max = getMax(max, sum1, sum2);
        }

        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += board[i][i];
            sum2 += board[i][(n - 1) - i];
        }

        max = getMax(max, sum1, sum2);

        System.out.println(max);
    }

    private static int getMax(int max, int sum1, int sum2) {
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);
        return max;
    }

}
