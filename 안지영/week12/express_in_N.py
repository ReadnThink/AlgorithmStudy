#프로그래머스 N으로 표현 https://school.programmers.co.kr/learn/courses/30/lessons/42895
# N개 : 1 + N-1, 2 + N-2, ... , N-1 + 1, N로 경우 나누어 풀이

# 1개 : 1개
# 2개 : 1개 + 1개, 2개 
# 3개 : 1개 + 2개, 2개 + 1개, 3개
# 4개 : 1개 + 3개, 2개 + 2개, 3개 + 1개, 4개
# ...
# 8개 까지 해보고 안되면 -1

def solution(N, number):
    
    if(N == number): return 1
    
    dp = [[N]]
    
    for num in range(1,8):
        value = [int('{}'.format(N)*(num+1))]
        
        for i in range(1,num+1):
            j = num+1-i
            for a in dp[i-1]:
                for b in dp[j-1]:
                    value.extend([a+b,a-b,a*b])
                    if(b!=0): value.append(a//b)
                                         
        if number in value:
            return num + 1
        
        dp.append(value)
           
    return -1

print(solution(5,12))
print(solution(2,11))