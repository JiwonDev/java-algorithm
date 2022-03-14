package algorithm.section2_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 유저 A,B 가위(1) 바위(2) 보(3) 이긴 사람을 출력, 비겼다면 "D"를 출력
 */
public final class 가위바위보 {

    private static final int SCISSORS = 1;
    private static final int ROCK = 2;
    private static final int PAPER = 3;
    private static String[][] rule;

    static {
        rule = new String[4][4];
        rule[SCISSORS][SCISSORS] = "D";
        rule[SCISSORS][ROCK] = "B";
        rule[SCISSORS][PAPER] = "A";
        rule[ROCK][SCISSORS] = "A";
        rule[ROCK][ROCK] = "D";
        rule[ROCK][PAPER] = "B";
        rule[PAPER][SCISSORS] = "B";
        rule[PAPER][ROCK] = "A";
        rule[PAPER][PAPER] = "D";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> playerA = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            playerA.add(scanner.nextInt());
        }

        List<Integer> playerB = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            playerB.add(scanner.nextInt());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String winner = getWinner(playerA.get(i), playerB.get(i));
            sb.append(winner).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));

    }

    private static String getWinner(Integer a, Integer b) {
        return rule[a][b];
    }

}
