package algorithm.section6_sort_and_search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public final class 중복확인 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n 개수
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 중복이 존재하면 D, 모두 고유하면 U를 출력하라
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        if (arr.length != set.size()) {
            System.out.println("D");
        } else {
            System.out.println("U");
        }
    }
}
