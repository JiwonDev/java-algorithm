package algorithm.section3_two_pointer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * 투포인터로 풀어라고 만든 문제이나, Set을 사용해도 됩니다ㅋㅋ.. 뭐 비슷해요
 */
public final class 교집합_오름차순_출력하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set1 = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set1.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        Set<Integer> set2 = new HashSet<>(m);
        for (int i = 0; i < m; i++) {
            set2.add(scanner.nextInt());
        }

        set1.retainAll(set2);
        List<Integer> numbers = new ArrayList<>(set1);
        numbers.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}
