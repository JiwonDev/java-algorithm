package algorithm.section3_two_pointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 투 포인터 연습을 위한 문제이나, 사실 한 배열에 때려박고 sort 해도 상관없긴하다.
 */
public final class 두_배열_오름차순_합치기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> array1 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            array1.add(scanner.nextInt());
        }

        int m = scanner.nextInt();
        List<Integer> array2 = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            array2.add(scanner.nextInt());
        }

        List<Integer> result = new ArrayList<>(n + m);
        int index1 = 0;
        int index2 = 0;
        while (index1 < n && index2 < m) {
            if (array1.get(index1) < array2.get(index2)) {
                result.add(array1.get(index1++));
            } else {
                result.add(array2.get(index2++));
            }
        }

        while (index1 < n) {
            result.add(array1.get(index1++));
        }

        while (index2 < m) {
            result.add(array2.get(index2++));
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);

    }

}
