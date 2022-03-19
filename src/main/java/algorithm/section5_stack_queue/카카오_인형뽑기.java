package algorithm.section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public final class 카카오_인형뽑기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = scanner.nextInt();
        }

        카카오_인형뽑기 T = new 카카오_인형뽑기();
        int result = T.solution(n, m, board, moves);
        System.out.println(result);
    }

    private int solution(int n, int m, int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();

        int depth = 0;
        int item = 0;
        int answer = 0;
        for (int position : moves) {
            position -= 1;
            depth = 0;
            while (depth < n && board[depth][position] == 0) {depth++;}
            if (depth < n) {
                item = board[depth][position];
                board[depth][position] = 0;
                if (!stack.isEmpty() && item == stack.peek()) {
                    int a = stack.pop();
                    answer += 2;
                } else {
                    stack.push(item);
                }
            }
        }

        return answer;
    }
}
