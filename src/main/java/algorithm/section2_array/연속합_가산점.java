package algorithm.section2_array;

import java.util.Scanner;

public final class 연속합_가산점 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int total = 0;
        int score = 0;
        for (int i = 0; i < n; i++) {
            if (scanner.nextInt() == 1) {
                score++;
                total += score;
            } else {
                score = 0;
            }
        }
        System.out.println(total);
    }

}
