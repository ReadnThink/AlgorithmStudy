package week8.게임맵최단거리;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {
    //동,북,서,남 방향으로 한칸씩 이동가능
    //최단거리 찾기
    //장애물이있으면 갈 수 없다. 0 = 이동불가 1 = 이동가능
    //첫위치 1,1 도착위치 (n,m)


/*
    해결해야할것
    모든 방법을 탐색하지 않는다.
    cnt가 이동시마다 올라간다.
*/

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static int solution(int[][] maps) {
        int answer = 0;

        int[][] visited = new int[maps.length][maps[0].length];

        bfs(maps, visited);
        answer = visited[maps.length-1][maps[0].length-1];

        if(answer == 0){
            answer = -1;
        }

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited){
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] current = queue.remove();
            int cX = current[0];
            int cY = current[1];
//            System.out.println(visited[current[0]][current[1]]);

            for(int i = 0; i < 4; i++){
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                if(nX < 0 || nX > maps.length-1 || nY < 0 || nY > maps[0].length-1)
                    continue;

                if(visited[nX][nY] == 0 && maps[nX][nY] == 1){
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
        System.out.println(Arrays.deepToString(visited));
    }
    public static void main(String[] args) {

        int[][] maps = { {1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
/*
        {1,0,1,1,1},
        {1,0,1,0,1},
        {1,0,1,1,1},
        {1,1,1,0,1},
        {0,0,0,0,1}
*/
        System.out.println("answer :" + solution(maps));
    }
}
