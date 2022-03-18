package algorithm.section3_two_pointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class 구간별_숫자종류_개수구하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        /**
         * N일 동안 매출기록
         * 연속된 K 일동안 매출의 종류
         */
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        int str = 0;
        for (int i : arr) {
            k--;
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (k == 0) {
                result.append(map.size()).append(" ");

                int next = map.get(arr[str]) - 1;
                if (next == 0) {
                    map.remove(arr[str]);
                } else {
                    map.put(arr[str], next);
                }
                str++;
                k++;
            }
        }
        System.out.println(result);

    }
}
