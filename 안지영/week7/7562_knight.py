# 7562 https://www.acmicpc.net/problem/7562
# 
dx = [1,2,2,1,-1,-2,-2,-1]
dy = [2,1,-1,-2,-2,-1,1,2]

def solution(l,passed,to_coord,count):
    global cnt
    
    if(passed[-1] == to_coord):
        cnt.append(count-1)
        return
    
    x, y = passed[-1]
    for i in range(len(dx)):
        x_tmp = x + dx[i]
        y_tmp = y + dy[i]

        if([x_tmp,y_tmp] in passed or x_tmp < 0 or x_tmp >= l or y_tmp < 0 or y_tmp >= l):
            return
        passed.append([x_tmp,y_tmp])
        solution(l,passed,to_coord,count+1)
        passed.pop()

# cases = int(input())
# for case in range(cases):
global cnt
cnt = []
l = int(input())
from_coord = list(map(int,input().split()))
to_coord= list(map(int,input().split()))
solution(l,[from_coord],to_coord,1)
print(min(cnt))