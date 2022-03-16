package algorithm.section3_two_pointer;

import java.util.Scanner;

public final class 특정숫자를_만드는_연속된_자연수합_경우의수 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 7 <= n < 1000
        int n = scanner.nextInt();
//        int count = twoPointer(target);
        int count = dp(n);
        System.out.println(count);
    }

    private static int dp(int n) {

        int target = n;
        int answer = 0;
        int numberOfElements = 1;

        int i = 1;
        while (target > 0) {
            // 전체합(n)에 기본값(1+2+3)을 뺀 수는 개수(3개)로 나누어 떨어져야한다.
            // 1 + 2 + 3
            // dx  dx  dx = 3dx (개수 3)
            target -= i; // 한개씩 빼본다 1 -> 1,2 -> 1,2,3 -> 1,2,3,4...

            if (target % numberOfElements == 0) {answer++;}

            numberOfElements++;
            i++;
        }

        // n를 만드는 원소가 1개(15 = {15}) 경우는 제외 한다.
        return answer - 1;

    }

    private static int twoPointer(int target) {
        int lastCase = target / 2 + 1;
        int[] arr = new int[lastCase];
        for (int i = 0; i < lastCase; i++) {
            arr[i] = i + 1;
        }

        int count = 0;
        int lt = 0, rt = 0;
        int sum = 0;
        while (lt < lastCase && rt < lastCase) {
            sum += arr[rt++];
            if (sum == target) {
                count++;
            }
            while (sum >= target) {
                sum -= arr[lt++];
                if (sum == target) {
                    count++;
                }
            }
        }
        return count;
    }

}
