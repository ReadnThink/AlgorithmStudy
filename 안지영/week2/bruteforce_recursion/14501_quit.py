# 14501 https://www.acmicpc.net/problem/14501
# 성공

c = []
max_sum = 0

def dfs(N,T,P,day):
    
    global max_sum
    
    if day > N:
        max_sum = max(max_sum,sum(c[:-1]))
        return
    
    if day == N:
        max_sum = max(max_sum,sum(c))
        return
    
    for i in range(day,N):
        c.append(P[i])
        dfs(N,T,P,i+T[i])
        c.pop()
        
def main():
    
    global max_sum
    N = int(input())
    T = []
    P = []
    for i in range(N):
        t_val, p_val = map(int,input().split())
        T.append(t_val)
        P.append(p_val)
        
    dfs(N,T,P,0)
    
    print(max_sum)

main()