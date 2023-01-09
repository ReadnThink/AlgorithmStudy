package week14.수들의합2;

import java.util.Scanner;

public class MainOn2 {
    public static void main(String[] args) {
        /**
         * 시간복잡도가 O(n2)이다.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                if(sum < m) sum += arr[j];
                if (sum == m) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
