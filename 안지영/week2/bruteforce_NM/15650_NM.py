# 15650 https://www.acmicpc.net/problem/15650
# 성공 - dfs, 15649에 start인자 추가

s = []

def dfs(N,M,start):
    
    if len(s) == M:
        print(' '.join(s))
        return
    
    
    for i in range(start,N+1):
        if i not in s:
            s.append(i)
            dfs(N,M,i+1)
            s.pop()


def main():
    N, M = map(int, input().split())
    dfs(N,M,1)
    
main()        