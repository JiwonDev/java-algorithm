package algorithm.section2_array;

import java.util.Scanner;

/**
 * 입력을 꼭 적혀있는데로 받을 필요는 없다.
 * 필요에 따라 변형해서 저장하자.
 */
public final class 멘토_멘티_정하기_단_모든시험에서_멘토가높은등수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] ranks = new int[m][n];

        int student = 0;
        for (int test = 0; test < m; test++) {
            for (int rank = 0; rank < n; rank++) {
                student = scanner.nextInt() -1;
                ranks[test][student] = rank;
            }
        }

        int count = 0;
        boolean canBeMento = true;
        for (int me = 0; me < n; me++) {
            for (int mate = 0; mate < n; mate++) {
                if (me == mate) {
                    continue;
                }

                canBeMento = true;
                for (int test = 0; test < m; test++) {
                    if (ranks[test][me] < ranks[test][mate]) {
                        canBeMento = false;
                        break;
                    }
                }
                if (canBeMento) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
