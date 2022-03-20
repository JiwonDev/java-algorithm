package algorithm.section7_dfs_bfs_basic;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * 최단거리를 찾는건 BFS, 경우의 수를 따지는 건 DFS! 트리가 그려지는지 생각해보자
 * 층을 잘 생각하자. 큐에있는걸 다 꺼내야함
 * Q size는 따로 빼서 넣자. 자꾸 바뀐다.
 */
public final class 최단점프수찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();// 현수의 위치 s
        int e = scanner.nextInt();// 송아지의 위치 e
        // 직선좌표는 1부터 10,000까지 , 점프의 최소횟수 (단 답은 1이상)
        // 현수는 앞1, 뒤1, 앞5 만 이동가능

        boolean[] isVisited = new boolean[10001];
        isVisited[s] = true;
        int[] dis = {1, -1, 5};

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(s);
        int jump = 0;
        boolean isDone = false;
        while (!queue.isEmpty() && !isDone) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer cur = queue.poll();

                // 찾은 경우
                if (cur == e) {
                    System.out.println(jump);
                    isDone = true;
                    break;
                }

                for (int dx : dis) {
                    int next = cur + dx;
                    if (next >= 1 && next <= 10000 && !isVisited[next]) {
                        isVisited[next] = true;
                        queue.offer(next);
                    }
                }
            }
            jump++;
        }
    }
}
