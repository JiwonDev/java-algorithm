package algorithm.section6_sort_and_search;

import java.util.Arrays;
import java.util.Scanner;

public final class 정렬 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}
