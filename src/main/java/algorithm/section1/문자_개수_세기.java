package algorithm.section1;

import java.util.Scanner;

public class 문자_개수_세기 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();
        String m = scan.next();

        String word = n.toUpperCase();
        char c = m.toUpperCase().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                count++;
            }
        }

        System.out.println(count);
    }
}
