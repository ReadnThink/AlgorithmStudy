package week6.동물원;

import java.util.Scanner;

public class 동물원1 {

    public void solution(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 동물원의 열 저장

//        Dp[n][0] -> 두 개의 방 중에 사자를 아예 넣지 않은 경우
//        Dp[n][1] -> 두 개의 방 중에 사자를 왼쪽 방에 넣은 경우
//        Dp[n][2] -> 두 개의 방 중에 사자를 오른쪽 방에 넣은 경우
        //행을 3까지 넣은 이유는 사자가 없을때도 체크하기 위해서.
        int[][] dp = new int[N+1][3];

        dp[0][0] = 1; // 사자가 없을경우도 1이다.
        final int MOD = 9901;
        for (int i = 1; i <= N; i++) {
            // 기저조건 = dp[1][0,1,2]는 전부 1
            // 기저조건부터 저장해가며 답을 찾아간다.
            // dp[i][0] 일때는 아무것도 없을때이다. = 본인이 위치한 자리를 카운트 하는것.
            dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % MOD;
            dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % MOD;
            System.out.printf("dp[0] = %d,   dp[1] = %d,   dp[2] = %d\n",dp[i][0], dp[i][1], dp[i][2]);
        }

        int answer = (dp[N][0] + dp[N][1] + dp[N][2]) % MOD;
        System.out.println("answer = " + answer);
    }

    public static void main(String[] args) {
        동물원1 z = new 동물원1();
        z.solution();
    }
}
