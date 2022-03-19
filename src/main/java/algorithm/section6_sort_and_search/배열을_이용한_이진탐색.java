package algorithm.section6_sort_and_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * List.sort() 해도 되는데
 * Array.sort() Arrays.binarySearch 이런것도 있다 ㅎ
 */
public final class 배열을_이용한_이진탐색 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt(); // m 값의 위치번호
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr, m);
        System.out.println(result+1);

    }

}
