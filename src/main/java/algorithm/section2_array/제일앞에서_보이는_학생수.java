package algorithm.section2_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class 제일앞에서_보이는_학생수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> heights = new ArrayList<>();

        int max = 0;
        int count = 0;
        int current = 0;
        for (int i = 0; i < n; i++) {
            current = scanner.nextInt();
            if (current > max) {
                count++;
                max = current;
            }
        }

        System.out.println(count);
    }

}
