package week5;

import java.util.Arrays;
import java.util.Scanner;

public class 더하기123 {
    /*
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

    1+1+1+1
    1+1+2
    1+2+1
    2+1+1
    2+2
    1+3
    3+1
    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
     */

    //n이 11보다 작은 양수이기때문에 backtracking으로도 풀리지만, DP연습이기에 DP로 푼다.


    /*
    1 = 1

    2 = 1,1 || 2

    3 = 1,1,1 || 1,2 || 2, 1

    4 = 1,1,1,1 || 1,2,1 || 2,1,1 ||
        1,1,2 || 2,2 ||
        1,3

    5 = 1,1,1,1,1 || 1,2,1,1 || 2,1,1,1 || 1,1,2,1 || 2,2,1 || 1,3,1
        1,1,1,2 || 1,2,2 || 2,1,2
        1,1,3 || 2,3

     */

    static int[] dp = new int[12];
    public static int f(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

 //        int result = dp[n];
//        if(result != 0) return result;
        if(dp[n] != 0) return dp[n];
        return dp[n] = f(n - 1) + f(n - 2) + f(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            System.out.println(f(N));
        }
    }
}
