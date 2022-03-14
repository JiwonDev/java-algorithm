package algorithm.section2_array;

import java.util.Scanner;

public final class 반장뽑기_가장_같은반이었던_친구가_많은자 {

    private static int NUMBER_OF_GRADES = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] students = new int[n][5];
        for (int student = 0; student < n; student++) {
            for (int grade = 0; grade < NUMBER_OF_GRADES; grade++) {
                students[student][grade] = scanner.nextInt();
            }
        }

        System.out.println(solution(n, students));
    }

    /**
     * 다른 친구와 같은 반을 지냈던 년도가 많은 학생 번호를 반환하라. (동일한 경우 가장 작은 학생 번호)
     *
     * @param n         학생 수
     * @param classInfo 각 학생의 학년별 반번호 (단, 학생 번호는 1부터 시작한다)
     * @return 정답
     */
    private static int solution(int n, int[][] classInfo) {

        int[] sameClassCount = new int[n];

        for (int me = 0; me < n; me++) {
            for (int classMate = 0; classMate < n; classMate++) {
                if (me == classMate) {
                    continue;
                }
                for (int grade = 0; grade < NUMBER_OF_GRADES; grade++) {
                    if (classInfo[me][grade] == classInfo[classMate][grade]) {
                        sameClassCount[me]++;
                        break;
                    }
                }
            }
        }

        int maxCount = -1;
        int leader = 0;

        int me = 0;
        for (int count : sameClassCount) {
            me++;
            if (count > maxCount) {
                maxCount = count;
                leader = me;
            }
        }

        return leader;
    }

}
