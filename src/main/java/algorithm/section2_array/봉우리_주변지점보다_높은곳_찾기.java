package algorithm.section2_array;

import java.util.Scanner;

/**
 * 꿀팁 - dx, dy 배열을 사용하면 반복되는 검사코드를 줄일 수 있다.
 */
public final class 봉우리_주변지점보다_높은곳_찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 상하좌우 보다 크다면 봉우리 (* 배열 범위 밖은 높이 0 취급)
        int[][] heights = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                heights[i][j] = scanner.nextInt();
            }
        }

        int current = 0;
        int peekCount = 0;
        int i = 0, j = 0;
        boolean isPeek = false;
        boolean[][] skipChecker = new boolean[n + 2][n + 2];
        for (int x = 1; x < n + 1; x++) {
            for (int y = 1; y < n + 1; y++) {
                if (skipChecker[x][y]) {
                    continue;
                }

                current = heights[x][y];

                isPeek = true;
                for (int k = 0; k < 4; k++) {
                    i = x + dx[k];
                    j = y + dy[k];
                    if (canBePeek(current, heights[i][j])) {
                        skipChecker[i][j] = true;
                    } else {
                        isPeek = false;
                        break;
                    }
                }

                if (isPeek) {
                    peekCount++;
                }
            }
        }

        System.out.println(peekCount);
    }

    private static boolean canBePeek(int from, int next) {
        if (from > next) {
            return true;
        }
        return false;
    }
}
