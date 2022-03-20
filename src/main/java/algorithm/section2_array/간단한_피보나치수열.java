package algorithm.section2_array;

import java.util.Scanner;

/**
 * 굳이 일반 항을 구하려고 애쓸 필요가 없다. 그냥 풀자
 * 메모리를 아끼고 싶다면 배열을 사용하지 않고 바로 출력하는 방법도 있다.
 */
public final class 간단한_피보나치수열 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(fibo[i]).append(" ");
        }

        System.out.println(sb);
    }
}
