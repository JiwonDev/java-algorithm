package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 배열로 푸는게 더 간단한데, 큐 연습하는 의미로 큐로 풀어보자
 */
public final class 전공수업_순서대로_들었는지_확인 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String major = scanner.next();
        String me = scanner.next();

        Queue<Character> planQueue = new ArrayDeque<>();
        for (char c : major.toCharArray()) {
            planQueue.offer(c);
        }

        boolean isDone = false;
        for (char c : me.toCharArray()) {
            if (planQueue.size() == 0) {
                System.out.println("YES");
                isDone = true;
                break;
            }
            if (planQueue.contains(c)) {
                if (planQueue.poll() != c) {
                    System.out.println("NO");
                    isDone = true;
                    break;
                }
            }
        }


        if (!isDone) {
            System.out.println("NO");
        }

    }
}
