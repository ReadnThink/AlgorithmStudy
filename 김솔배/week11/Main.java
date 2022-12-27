package week11;

import java.util.*;
public class Main {
    //이동할 수 있는 경우
    int[] dx = {1, -1, 2};

    private int solution(int n, int k) {
        boolean[][] dp = new boolean[1][100001];
        Queue<int[]> q = new LinkedList<>();
        int answer = 0;
        q.add(new int[]{n, answer});
        dp[0][n] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int cnt = curr[1];

            if(x == k) {
                answer = cnt;
                break;
            }

            for (int i = 0; i < dx.length; i++) {
                int nX;
                if(i != 2) nX = x + dx[i];
                else nX = x * dx[i];

                if (nX < 0 || nX > 100000) continue;

                if(dp[0][nX] == false){
                    dp[0][nX] = true;
                    q.add(new int[]{nX, cnt + 1});
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Main s = new Main();
        System.out.println(s.solution(n, k));
    }
}
