# 17427 https://www.acmicpc.net/problem/17427
# 시간 초과

'''문제
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다. 
예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다. 
자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. 
x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.
자연수 N이 주어졌을 때, g(N)을 구해보자.'''

'''입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.'''
 
'''출력
첫째 줄에 g(N)를 출력한다.'''

#num을 받아서 num의 모든 약수를 리스트 형태로 반환
def add_divisors(num):
    cnt = 1
    
    if num == 1:
        return cnt
    
    for div in range(2,num+1):
        if num % div == 0:
            cnt += div
            
    return cnt

def g(x):
    sum = 0
    for y in range(1,x+1):
        sum += add_divisors(y)
    return sum

def main():
    
    N = int(input())
    g_n = g(N)
    print(g_n)

main()
