package algorithm.section8_dfs_bfs_활용;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public final class MST_프림 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();

        ArrayList<ArrayList<Edge>> roads = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            roads.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int cost = scanner.nextInt();
            roads.get(a).add(new Edge(b, cost));
            roads.get(b).add(new Edge(a, cost));
        }

        int answer = 0;
        Queue<Edge> queue = new PriorityQueue<>((o1, o2) -> o1.cost.compareTo(o2.cost));
        boolean[] isVisited = new boolean[v + 1];

        queue.offer(new Edge(1, 0)); // 1번부터 출발, 자기자신이니 비용은 0
        int edgeCount = 0;
        while (!queue.isEmpty()) {
            Edge current = queue.poll();
            int city = current.city;
            if (!isVisited[city]) {
                edgeCount++;
                isVisited[city] = true;
                answer += current.cost;
                for (Edge next : roads.get(city)) {
                    if (!isVisited[next.city]) {
                        queue.offer(next);
                    }
                }
            }
        }
        System.out.println(answer);

    }

    private static class Edge {

        final Integer city;
        final Integer cost;

        public Edge(Integer city, Integer cost) {
            this.city = city;
            this.cost = cost;
        }
    }
}
