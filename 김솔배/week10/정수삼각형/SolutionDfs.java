package week10.정수삼각형;

import java.util.Stack;

public class SolutionDfs {
    // Bfs보다는 Dfs가 더 효율적일거 같다??
    // queue에 넣을때 들어갈때 curIdx, curIdx + 1 넣기
    // 도착할 곳이 이미 계산되었고, 그 결과가 자기가 될 수보다 크다면, DP에 저장된 값 반환

    //queue에는 Idx를 넣는다
    static int[][] dp;
    static int[][] sumArr;
        public int solution(int[][] triangle) {
            int answer = 0;

            int x = 0;
            int y = 0;
            Stack<int[]> stack = new Stack<>();

            stack.add(new int[]{x, y});

            sumArr[0][0] = triangle[0][0];
            while (!stack.isEmpty()) {
                int[] current = stack.pop();
                int cX = current[0];
                int cY = current[1];

                for (int i = 0; i <= 1; i++) {
                    int nX = cX + 1;
                    int nY = cY + i;

                    if(nX >= triangle.length) continue;
                    sumArr[nX][nY] = triangle[nX][nY];

                    //계산을 했는데 DP가 더 크다면 그상태로 진행
                    if (dp[nX][nY] != 0 && dp[nX][nY] >= sumArr[nX][nY] + sumArr[cX][cY]) continue;
                    //계산을 했는데 DP가 더 작다면 다시 계산
                    else if (dp[nX][nY] != 0 && dp[nX][nY] < sumArr[nX][nY] + sumArr[cX][cY]) {
                        dp[nX][nY] = sumArr[nX][nY] += sumArr[cX][cY];
                        stack.add(new int[]{nX, nY});
                     }
                    //계산 안했다면 계산하기
                    else  {
                        dp[nX][nY] = sumArr[nX][nY] += sumArr[cX][cY];
                        stack.add(new int[]{nX, nY});
                    }
                    if(answer < dp[nX][nY]) answer = dp[nX][nY];
                }
            }
            return answer;
        }

    public static void main(String[] args) {
        int[][] arr;
        arr = new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        sumArr = new int[arr.length + 1][arr[arr.length - 1].length];
        dp = new int[arr.length + 1][arr[arr.length - 1].length]; //dp의 크기는 arr의 크기만큼이다. 저장해야할 인덱스가 arr의 길이만큼이기 때문에
        SolutionDfs s = new SolutionDfs();
        System.out.println(s.solution(arr));
    }
}
