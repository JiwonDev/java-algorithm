package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 경우의 수를 나누자, 레이저인경우, 아닌 경우
 */
public final class 괄호_레이저_개수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Deque<Character> stack = new ArrayDeque<>();
        /**
         * Stack
         * push pop peek (Deque 사용시 전부다 fisrtPush, firstPop, firstPeek임)
         *
         * Queue
         * poll offer
         * remove add 는 컬렉션꺼임. 근데 써도 상관은없음.
         */

        int answer = 0;

        char[] str = input.toCharArray();
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (c == '(') {
                stack.push(c);
            } else { // c == ')'
                stack.pop();
                if (str[i - 1] == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }

        }
        System.out.println(answer);
    }

}
