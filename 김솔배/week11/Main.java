package week11;

import java.util.*;
public class Solution{
    //이동할 수 있는 경우
    int[] dx = {1, -1, 2};

    private int solution(int n, int k) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{n, 0});

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int cnt = curr[1];

            if (x == k) return cnt;

            // x가 음수가 되면 안된다.
            if(x < -1) continue;
            for (int i = 0; i < dx.length; i++) {
                if(i == 2) {
                    int nX = x * dx[i];
                    q.add(new int[]{nX, cnt + 1});
                }else {
                    int nX = x + dx[i];
                    q.add(new int[]{nX, cnt + 1});
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Solution s = new Solution();
        System.out.println(s.solution(n, k));
    }

}
