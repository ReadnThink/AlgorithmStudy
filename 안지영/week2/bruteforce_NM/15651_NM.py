# 15651 https://www.acmicpc.net/problem/15651
# 성공 - dfs, 조건문 제거

s = []

def dfs(N,M):
    
    if len(s) == M:
        print(' '.join(s))
        return
    
    
    for i in range(1,N+1):
        s.append(i)
        dfs(N,M)
        s.pop()


def main():
    N, M = map(int, input().split())
    dfs(N,M)
    
main()        