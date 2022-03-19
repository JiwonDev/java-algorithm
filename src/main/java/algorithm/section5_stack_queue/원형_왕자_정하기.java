package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public final class 원형_왕자_정하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 왕자 n명
        int k = scanner.nextInt(); // 특정 숫자 k
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
        }
        Integer answer = queue.poll();
        System.out.println(answer);
    }

}
