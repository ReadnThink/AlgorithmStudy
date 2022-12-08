package week10.정수삼각형;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    // Dfs보다는 Dfs가 더 효율적일거 같다??
    // queue에 넣을때 들어갈때 curIdx, curIdx + 1 넣기
    // 도착할 곳이 이미 계산되었고, 그 결과가 자기가 될 수보다 크다면, DP에 저장된 값 반환

    //queue에는 Idx를 넣는다!!!
    static int[][] dp;
    static int[][] sumArr;
        public int solution(int[][] triangle) {
            int x = 0;
            int y = 0;
            Queue<int[]> queue = new LinkedList<>();
            int[] xY = new int[]{x, y};
            queue.add(xY);
            sumArr[x][y] = triangle[x][y];
            while (!queue.isEmpty()) {
                int[] current = queue.remove();
                int cX = current[0];
                int cY = current[1];


                for (int i = 0; i <= 1; i++) {
                    int nX = cX + 1;
                    int nY = cY + i;

                    //x가 범위를 넘어갈경우만 처리해줘도 된다. x가 넘어갈때 y도 넘어가기 때문
                    if (nX >= triangle.length) continue;

                    if(sumArr[nX][nY] == 0) sumArr[nX][nY] = triangle[nX][nY];

                    if (dp[nX][nY] != 0 && dp[nX][nY] >= triangle[nX][nY] + sumArr[cX][cY]) {
                        sumArr[nX][nY] = dp[nX][nY];
                        queue.add(new int[]{nX, nY});
                    }
                    else if(dp[nX][nY] == 0 || dp[nX][nY] < triangle[nX][nY] + sumArr[cX][cY]) {
                        sumArr[nX][nY] = triangle[nX][nY] + sumArr[cX][cY];
                        dp[nX][nY] = sumArr[nX][nY];
                        queue.add(new int[]{nX, nY});
                    }
                }
            }

            int length = triangle.length - 1;
            int answer = 0;
            for (int i = 0; i < dp[length].length-1; i++) {
                if(dp[length][i] > answer) answer = dp[length][i];
            }
            return answer;
        }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        sumArr = new int[arr.length + 1][arr[arr.length - 1].length]; //dp의 크기는 arr의 크기만큼이다. 저장해야할 인덱스가 arr의 길이만큼이기 때문에
        dp = new int[arr.length + 1][arr[arr.length - 1].length]; //dp의 크기는 arr의 크기만큼이다. 저장해야할 인덱스가 arr의 길이만큼이기 때문에
        Solution s = new Solution();
        System.out.println(s.solution(arr));
    }
}
