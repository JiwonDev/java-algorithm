package algorithm.section1;

import java.util.Arrays;
import java.util.Scanner;

public final class 특정_문자와_가장_짧은거리 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        char[] word = input1.toCharArray();
        char target = input2.charAt(0);

        int[] distances = new int[word.length];
        Arrays.fill(distances, Integer.MAX_VALUE);

        updateLeftDistance(word, target, distances);
        updateRightDistance(word, target, distances);

        print(distances);
    }

    private static void print(int[] distances) {
        StringBuilder sb = new StringBuilder();
        for (int i : distances) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    private static void updateRightDistance(char[] word, char target, int[] distances) {
        int distanceFromTarget = 0;
        int start = word.length - 1;
        while (word[start] != target) {
            start--;
        }

        for (int i = start; i >= 0; i--) {
            char c = word[i];
            distanceFromTarget++;
            if (c == target) {
                distances[i] = 0;
                distanceFromTarget = 0;
            }

            if (distances[i] > distanceFromTarget) {
                distances[i] = distanceFromTarget;
            }
        }
    }

    private static void updateLeftDistance(char[] word, char target, int[] distances) {
        int distanceFromTarget = 0;
        int start = 0;
        while (word[start] != target) {
            start++;
        }

        for (int i = start; i < word.length; i++) {
            char c = word[i];
            distanceFromTarget++;
            if (c == target) {
                distances[i] = 0;
                distanceFromTarget = 0;
            }

            if (distances[i] > distanceFromTarget) {
                distances[i] = distanceFromTarget;
            }
        }
    }

}
