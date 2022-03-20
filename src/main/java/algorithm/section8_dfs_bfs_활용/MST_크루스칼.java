package algorithm.section8_dfs_bfs_활용;

import java.util.ArrayList;
import java.util.Scanner;

public final class MST_크루스칼 {

    static int[] city;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();
        city = new int[v + 1];
        for (int i = 1; i <= v; i++) {
            city[i] = i;
        }

        ArrayList<Edge> roads = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int cost = scanner.nextInt();
            roads.add(new Edge(a, b, cost));
        }

        int answer = 0;
        int count = 0;
        // 크루스칼은 최소비용( 혹은 최대 가치 )부터 탐색하는 알고리즘이다.
        roads.sort((o1, o2) -> o1.cost.compareTo(o2.cost));
        for (Edge road : roads) {
            int a = find(road.a);
            int b = find(road.b);
            if (a != b) {
                count++;
                answer += road.cost;
                connect(road.a, road.b);
            }
            if (count == v - 1) {
                break; // 더 이상 할 필요가 없으므로
            }
        }
        System.out.println(answer);

    }

    private static void connect(Integer a, Integer b) {
        int x = find(a);
        int y = find(b);
        if (x != y) {
            city[x] = city[y];
        }
    }

    private static int find(Integer x) {
        if (x != city[x]) {
            city[x] = find(city[x]);
        }
        return city[x];
    }

    private static class Edge {

        Integer a;
        Integer b;
        Integer cost;

        public Edge(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }
}
