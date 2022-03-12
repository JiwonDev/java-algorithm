package algorithm.section1;

import static java.lang.Character.isAlphabetic;

import java.util.Scanner;

public final class 알파벳만_앞뒤_교환하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        int str = 0;
        int end = input.length() - 1;

        char[] sentence = input.toCharArray();

        while (str < end) {
            str = nextLeft(str, sentence);
            end = nextRight(end, sentence);

            if (str < end) {
                exchange(str, end, sentence);
                str++;
                end--;
            }
        }

        System.out.println(sentence);
    }

    private static int nextLeft(int str, char[] sentence) {
        while (str < sentence.length) {
            if (isAlphabetic(sentence[str])) {
                break;
            }
            str++;
        }
        return str;
    }

    private static int nextRight(int end, char[] sentence) {
        while (end > 0) {
            if (isAlphabetic(sentence[end])) {
                break;
            }
            end--;
        }
        return end;
    }

    private static void exchange(int str, int end, char[] sentence) {
        char temp;
        temp = sentence[str];
        sentence[str] = sentence[end];
        sentence[end] = temp;
    }

}
