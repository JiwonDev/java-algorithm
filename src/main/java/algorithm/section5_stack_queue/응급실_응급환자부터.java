package algorithm.section5_stack_queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 우선순위 큐는 순서를 보장하지 않는다.
 */
public final class 응급실_응급환자부터 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 개수
        int m = scanner.nextInt(); // M 번째 환자는 몇번재 진료받나
        int[] risks = new int[n];
        Queue<Person> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            risks[i] = scanner.nextInt();
            queue.offer(new Person(i, risks[i]));
        }

        boolean isMyTurn = false;
        int count = 0;
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            isMyTurn = true;
            for (Person x : queue) {
                if (person.getPriority() < x.getPriority()) {
                    isMyTurn = false;
                    break;
                }
            }
            if (isMyTurn) {
                count++;

                if (person.getId() == m) {
                    System.out.println(count);
                    break;
                }

            } else {
                queue.offer(person);
            }
        }

        Integer target = risks[m];

    }

    static class Person {

        private final Integer id;
        private final Integer priority;

        Person(Integer id, Integer priority) {
            this.id = id;
            this.priority = priority;
        }

        public int getId() {
            return id;
        }

        public int getPriority() {
            return priority;
        }

    }
}
