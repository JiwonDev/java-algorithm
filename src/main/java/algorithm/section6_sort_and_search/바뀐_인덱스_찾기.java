package algorithm.section6_sort_and_search;

import java.util.Arrays;
import java.util.Scanner;

public final class 바뀐_인덱스_찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 학생 수
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        // 작은 순으로 정렬된 리스트에서, 단 한개가 바뀌었다. 바뀐 두 인덱스를 찾아라
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = heights[i];
        }

        Arrays.sort(copy);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == 2) {break;}
            if (copy[i] != heights[i]) {
                count++;
                sb.append(i + 1).append(" ");
            }
        }

        System.out.println(sb);
    }
}
