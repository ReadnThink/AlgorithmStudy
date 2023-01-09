package week14.수들의합2;

import java.util.Scanner;

public class Main {
    /**
     * 투 포인터로 : 시간복잡도 최대 O(n)이다.
     * 시간복잡도 : Sum과 m을 비교하는 횟수 = start와 end가 움직이는 횟수
     * 최대로 움직여봤자 2n번 움직이므로 O(n)이 된다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        /**
         * 4 2
         * 1 1 1 1
         */

        // start : 연속구간의 시작, end : 연속구간의 끝
        int start = 0;
        int end = 0;
        int sum = 0; //연속되는 구간의 합
        int cnt = 0; //정답인 갯수
        while (true) {
            if (sum >= m) {
                sum -= arr[start++];
            } else if (end >= n) { //종료조건
                break;
            } else { //m보다 sum이 더 작으면
                sum += arr[end++];
            }
            if (sum == m) cnt++;
        }
        System.out.println(cnt);
    }
}
