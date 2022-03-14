package algorithm.section2_array;

import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public final class 높은점수_순위_출력하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        List<Integer> orderedNumbers = new ArrayList<>(numbers);
        orderedNumbers.sort(reverseOrder());

        Map<Integer, Integer> rankMap = getRankMap(orderedNumbers);

        StringBuilder ranks = new StringBuilder();
        for (int num : numbers) {
            ranks.append(rankMap.get(num)).append(" ");
        }

        System.out.println(ranks);

    }

    private static Map<Integer, Integer> getRankMap(List<Integer> orderedNumbers) {
        Map<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        int previous = orderedNumbers.get(0);
        int current = 0;
        map.put(previous, rank);
        for (int i = 1; i < orderedNumbers.size(); i++) {
            rank++;
            current = orderedNumbers.get(i);
            if (previous != current) {
                map.put(current, rank);
                previous = current;
            }
        }

        return map;
    }
}
