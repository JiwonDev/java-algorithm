package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public final class 괄호사이문자제거 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (stack.pop() != '(') ;
            } else {
                stack.push(c);
            }
        }

        Iterator<Character> iterator = stack.descendingIterator();
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        System.out.println(sb);
    }
}
