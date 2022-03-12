package algorithm.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class 한칸앞이_큰수만_출력하기 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        StringBuilder sb = new StringBuilder();
        sb.append(numbers.get(0)).append(" ");

        int i = 1;
        for (Integer num : numbers.subList(1, numbers.size())) {
            Integer previous = numbers.get(i - 1);
            if (previous < numbers.get(i)) {
                sb.append(numbers.get(i)).append(" ");
            }
            i++;
        }

        System.out.println(sb);

    }

}
