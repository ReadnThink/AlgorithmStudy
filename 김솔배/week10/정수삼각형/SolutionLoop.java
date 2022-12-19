package week10.정수삼각형;

import java.util.Arrays;

public class SolutionLoop {
    private static int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle[triangle.length - 1].length];
        dp[0][0] = triangle[0][0];
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j > 0)
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] + triangle[i][j]);
            }
        }

//        System.out.println(Arrays.deepToString(dp));

        int r = dp[triangle.length - 1][0];
        for (int i = 1; i < triangle[triangle.length -1].length; ++i) {
            r = Math.max(r, dp[triangle.length - 1][i]);
        }
        System.out.println(Arrays.deepToString(dp));
        return r;
    }
    public static void main(String[] args) {
        /*
        * 7
        * 3, 8
        * 8, 1, 0
        * 2, 7, 4, 4
        * 4, 5, 2 ,6, 5
        * */
        int[][] triangle = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int result = solution(triangle);
        System.out.println(result);
    }
}