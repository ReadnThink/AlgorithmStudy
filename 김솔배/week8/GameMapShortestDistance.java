package week8;

import java.util.LinkedList;
import java.util.Queue;

public class GameMapShortestDistance {
    //동,서,남,북 방향으로 한칸씩 이동가능
    //최단거리 찾기
    //장애물이있으면 갈 수 없다. 0 = 이동불가 1 = 이동가능
    //첫위치 1,1 도착위치 (n,m)

    static class Start{
        int x;
        int y;

        public Start(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int cnt;
    static int n;
    static int m;
    public static void main(String[] args) {

        int[][] maps = { {1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
        n = maps[0].length - 1; // 가로길이
        m = maps.length - 1; // 세로길이
        bfs(maps);
    }

    private static void bfs(int[][] maps) {
        //지나간 곳은 0으로 바꾼다.
        Start xy = new Start(0, 0);
        Queue<Start> queue = new LinkedList<>();
        queue.add(xy);
        maps[xy.x][xy.y] = 0; //처음 위치 0으로 변경
        while(!queue.isEmpty() && cnt < 100){
            //종료조건
            if(xy.x == n && xy.y == m) {
                System.out.println(cnt + 1); //시작위치도 + 1로 취급한다.
                return;
            }

            queue.remove(xy);

            //4방향 탐색 알고리즘???
            //배열 초과를 어떻게 잡을까??
            if(xy.y >= 0 && xy.y < n && maps[xy.x][xy.y + 1] == 1){
                cnt++;
                maps[xy.x][xy.y] = 0;
                xy.y++;
//                System.out.println("y++"+cnt);
                queue.add(xy);
            }else if(xy.y > 0 && xy.y < n && maps[xy.x][xy.y - 1] == 1){
                cnt++;
                maps[xy.x][xy.y] = 0;
                xy.y--;
//                System.out.println("y--"+cnt);
                queue.add(xy);
            }else if(xy.x >= 0 && xy.x < m && maps[xy.x + 1][xy.y] == 1){
                cnt++;
                maps[xy.x][xy.y] = 0;
                xy.x++;
//                System.out.println("x++"+cnt);
                queue.add(xy);
            }else if(xy.x > 0 && xy.x < m && maps[xy.x - 1][xy.y] == 1){
                cnt++;
                maps[xy.x][xy.y] = 0;
                xy.x--;
//                System.out.println("x--"+cnt);
                queue.add(xy);
            }
        }
    }
}
