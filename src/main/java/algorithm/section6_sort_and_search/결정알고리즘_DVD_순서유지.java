package algorithm.section6_sort_and_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 결정 알고리즘, target을 확인한 후 min = target-1, max = target+1로 범위를 좁힌다.
 * 순서 정렬해도 되는지 확인 꼭 해보기!!
 */
class 결정알고리즘_DVD_순서유지 {

    public static void main(String[] args) {
        결정알고리즘_DVD_순서유지 T = new 결정알고리즘_DVD_순서유지();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {arr[i] = scanner.nextInt();}
        System.out.println(T.solution(n, m, arr));
    }

    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr) {
        int min = Arrays.stream(arr).max().getAsInt();
        int max = Arrays.stream(arr).sum();
        int answer = 0;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return answer;
    }
}
