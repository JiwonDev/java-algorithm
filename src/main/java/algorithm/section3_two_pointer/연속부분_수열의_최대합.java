package algorithm.section3_two_pointer;

import java.util.Scanner;

 class 연속부분_수열의_최대합 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int remain = k;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int max = 0, sum = 0;
        int lt = 0, rt = 0;
        for (int current : arr) {
            if (current == 0) {
                remain--;
            }
            while (remain < 0) {
                sum -= arr[lt];
                if (arr[lt] == 0) {
                    remain++;
                }
                lt++;
            }

            sum += arr[rt++];
            if (max < sum) {
                max = sum;
            }
        }

        System.out.println(max + k);
        N
    }
}
