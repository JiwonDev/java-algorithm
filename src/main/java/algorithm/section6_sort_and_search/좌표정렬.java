package algorithm.section6_sort_and_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class 좌표정렬 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Coord> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Coord(scanner.nextInt(), scanner.nextInt()));
        }

        list.sort((o1, o2) -> {
            if (o1.x.equals(o2.x)) {
                return o1.y.compareTo(o2.y);
            } else {
                return o1.x.compareTo(o2.x);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Coord c : list) {
            sb.append(c.x).append(" ").append(c.y).append("\n");
        }
        System.out.println(sb);
    }

    static class Coord {

        Integer x;
        Integer y;

        Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
