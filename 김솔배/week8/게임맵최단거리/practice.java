package week8.게임맵최단거리;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class practice {
    // 아래, 오른, 위, 왼


    public int solution(int[][] maps) {

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        //지나간 곳을 1로 변경
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        maps[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            //4방향 탐색
            for (int i = 0; i < dx.length; i++) {
                int nX = x + dx[i];
                int nY = y + dy[i];

                //맵 범위초과, 0일때 예외처리
                if(!(nX >= 0 && nX < maps.length)) continue;
                if(!(nY >= 0 && nY < maps[0].length)) continue;
                if(maps[nX][nY] != 1) continue;

                //방문
                maps[nX][nY] = maps[x][y] + 1;
                queue.add(new int[]{nX, nY});
            }
        }
        int finalIdx = maps[maps.length - 1][maps[0].length - 1];
        int answer = 0;
        if(finalIdx > 1)
            answer = maps[maps.length - 1][maps[0].length - 1];
        else
            answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        practice p = new practice();
        int[][] maps = new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}};
        int[][] maps1 = new int[][]{
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,1}};
        int result = p.solution(maps);
        int result1 = p.solution(maps1);
        System.out.println(Arrays.deepToString(maps));
        System.out.println(result);
        System.out.println(Arrays.deepToString(maps1));
        System.out.println(result1);
    }
}
