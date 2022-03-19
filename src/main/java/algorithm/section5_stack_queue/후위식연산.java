package algorithm.section5_stack_queue;

import java.util.Scanner;
import java.util.Stack;

/**
 * 아 String을 스택에 넣지말고, 그냥 double을 스택에 넣으면 더 속도가 빠를듯?
 * 문자인지 판단도 무조건 1~9니까 Character.isDigit(c)로 충분하고.. 근데 귀찮으니 패스!
 */
public final class 후위식연산 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Stack<String> stack = new Stack<>();
        double first = 0;
        double second = 0;
        for (String c : input.split("")) {
            if (c.matches("[-]?\\d+([.]\\d+)?")) {
                stack.push(c);
            } else {
                second = Double.parseDouble(stack.pop());
                first = Double.parseDouble(stack.pop());
                switch (c) {
                    case "+":
                        stack.push(String.valueOf(first + second));
                        break;
                    case "-":
                        stack.push(String.valueOf(first - second));
                        break;
                    case "*":
                        stack.push(String.valueOf(first * second));
                        break;
                    case "/":
                        stack.push(String.valueOf(first / second));
                        break;

                    default:
                        break;
                }
            }
        }
        double answer = Double.parseDouble(stack.pop());
        System.out.println(Math.round(answer));
    }
}
