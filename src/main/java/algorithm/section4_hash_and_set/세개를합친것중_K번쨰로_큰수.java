package algorithm.section4_hash_and_set;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * TreeSet 이라는 친구는 Set의 값을 순서대로 정렬한다.
 */
public final class 세개를합친것중_K번쨰로_큰수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int a = 0; a < (n - 2); a++) {
            for (int b = a + 1; b < (n - 1); b++) {
                for (int c = b + 1; c < n; c++) {
                    treeSet.add(arr[a] + arr[b] + arr[c]);
                }
            }
        }
        int i = 0;
        for (int sum : treeSet) {
            i++;
            if (i == k) {
                System.out.println(sum);
                break;
            }
        }
        if (i >= treeSet.size()) {
            System.out.println("-1");
        }

    }
}
