package algorithm.section1_string;

import java.util.Scanner;

public final class 문자열에서_숫자만_추출 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        String digits = input.replaceAll("[^0-9]", "");
        Integer number = Integer.parseInt(digits);
        System.out.println(number);

    }
}
