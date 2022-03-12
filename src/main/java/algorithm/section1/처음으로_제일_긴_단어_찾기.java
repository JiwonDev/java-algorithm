package algorithm.section1;

import java.util.Scanner;

public final class 처음으로_제일_긴_단어_찾기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int max = 0;
        int i = 0;
        int maxIndex = 0;
        String[] sentence = input.split(" ");
        for (String word : sentence) {
            if (word.length() > max) {
                max = word.length();
                maxIndex = i;
            }
            i++;
        }

        System.out.println(sentence[maxIndex]);
    }

}
