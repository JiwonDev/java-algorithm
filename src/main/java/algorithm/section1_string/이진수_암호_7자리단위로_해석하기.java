package algorithm.section1_string;

import static java.lang.Character.toChars;
import static java.lang.Integer.parseInt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Integer 에는 10진수, 2진수 변환 기능이 있다.
 */
public final class 이진수_암호_7자리단위로_해석하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();

        // 이진수 7자리 암호, # == 1, * == 0
        String binary = toBinary(input2);
        List<String> tokens = splitByLength(binary, 7);

        System.out.println(decode(tokens));
    }

    private static String decode(List<String> tokens) {
        StringBuilder sb = new StringBuilder();
        for (String token : tokens) {
            sb.append(toChars(parseInt(token, 2)));
        }
        return sb.toString();
    }

    private static List<String> splitByLength(String string, int length) {
        List<String> tokens = new ArrayList<>();
        for (int i = 0; i < string.length(); i += length) {
            tokens.add(string.substring(i, Math.min(i + length, string.length())));
        }
        return tokens;
    }

    private static String toBinary(String input) {
        return input.replace("#", "1")
            .replace("*", "0");
    }

}
