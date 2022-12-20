# 9095 https://www.acmicpc.net/problem/9095
# 성공

'''
1 + ( )
2 + ( )
3 + ( )

n = 3 일 때
 (+2)
1-1-1    = 1개
 -2      = 1개

 (+1) 
2-1      = 1개

 (+0)
3        = 1개

'''

def solution(n):
    
    if(n < 0):
        return 0
    
    if(n == 0):
        return 1
    
    return solution(n-1) + solution(n-2) + solution(n-3)

def main():
    N = int(input())
    
    for _ in range(N):
        print(solution(int(input())))
        
main()