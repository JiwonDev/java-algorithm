package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public final class 괄호쌍찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Deque<Integer> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.add(0);
            } else {
                if (stack.isEmpty()) {
                    stack.add(0);
                    break;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
