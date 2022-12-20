# 프로그래머스-게임 맵 최단거리 https://school.programmers.co.kr/learn/courses/30/lessons/1844

from collections import deque

# 북 동 남 서(시계방향)
dx = [-1,0,1,0]
dy = [0,1,0,-1]


def bfs(maps):
    n = len(maps)
    m = len(maps[0])
    visited = [[0] * m for i in range(n)]
    
    queue = deque()
    queue.append([0,0])
    
    while(queue):
        x,y = queue.popleft()
                
        for i in range(len(dx)):
            x_tmp = x + dx[i]
            y_tmp = y + dy[i]
            
            if(x_tmp < 0  or x_tmp >= n or y_tmp < 0 or y_tmp >= m):
                continue
            
            if(visited[x_tmp][y_tmp]!=0 or maps[x_tmp][y_tmp]==0):
                continue
            
            visited[x_tmp][y_tmp] = visited[x][y]+1

            if x_tmp==n-1 and y_tmp==m-1:
                break
            
            queue.append([x_tmp,y_tmp])

    if(visited[n-1][m-1]==0):
        return -1
    else:
        return visited[n-1][m-1] + 1
    

game_map = [[1,0,1,1,1],[1,0,1,0,1],[1,0,1,1,1],[1,1,1,0,1],[0,0,0,0,1]]
print(bfs(game_map))
