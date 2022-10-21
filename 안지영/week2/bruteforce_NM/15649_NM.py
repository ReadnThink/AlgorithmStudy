# 15649 https://www.acmicpc.net/problem/15649
# 성공 - dfs, 재귀

s = []

def dfs(N,M):
    
    if len(s) == M:
        print(' '.join(s))
        return
    
    
    for i in range(1,N+1):
        if i not in s:
            s.append(i)
            dfs(N,M)
            s.pop()


def main():
    N, M = map(int, input().split())
    dfs(N,M)
    
main()        