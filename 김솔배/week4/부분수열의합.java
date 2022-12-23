package week4;

import java.util.Scanner;

public class 부분수열의합 {
    static int[] arr;
    private static int N; // 정수의 개수
    private static int S; // 정수의 합
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //배열 길이
        S = sc.nextInt(); //부분 수열의 합
        arr = new int[N]; //배열


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        dfs(0, 0); // 부분수열의 합 구하기
        if (S == 0) System.out.println(answer - 1); // S = 0일때 처리(0 하나의 조합)
        else  System.out.println(answer);

    }

    private static void dfs(int depth, int sum) {
        // arr = -7, -3, -2, 5, 8
        // S == 0
        if (depth == N) {
            if (sum == S) answer++;
            System.out.println(sum);
            return;
        }
        dfs(depth + 1, sum + arr[depth]); // 1. 해당 인덱스 더함
        dfs(depth + 1, sum); // 2. 해당 인덱스 더하지않음
    }
}
