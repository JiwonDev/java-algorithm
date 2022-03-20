package algorithm.section6_sort_and_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 객기 부리지말고, 기존 형태를 기억하자 count(arr,mid) <= c
 * 어차피 찾아진다 ㅋ
 */
public final class 결정알고리즘_말사이의최대거리찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt(); // 말 마리수

        // 마구간 n 개, 좌표 arr (중복없음)
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        // 마구간에는 한마리의 말만 넣을 수 있고, 거리가 최대로 하고 싶다.
        // C 개의 말을, 마구간에 배치되었을 때 (가장 가까운)두 말 거리가 최대가 되는 거리
        int lt = 1;
        int rt = arr[arr.length - 1] - arr[0];

        int maxDistance = 0;
        int answer = 0;
        while (lt <= rt) {
            maxDistance = (lt + rt) / 2;
            if (count(arr, maxDistance) >= c) {
                answer = maxDistance;
                lt = maxDistance + 1;
            } else {
                rt = maxDistance - 1;
            }
        }

        System.out.println(answer);
    }

    private static int count(int[] arr, int distance) {
        int count = 1;
        int prev = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - prev >= distance) {
                count++;
                prev = arr[i];
            }
        }
        return count;
    }
}
