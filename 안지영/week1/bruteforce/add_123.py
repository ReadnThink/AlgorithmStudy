# 9095 https://www.acmicpc.net/problem/9095
# 성공 - 분할, 조합(combination), 팩토리얼

'''문제
정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.'''

'''입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.'''
 
'''출력
각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.'''

# n!
def factorial(n):
    if n == 0:
        return 1
    elif n == 1:
        return 1
    
    return n * factorial(n-1)

# nCr
def combination(n, r):
    return int(factorial(n)/(factorial(r)*factorial(n-r)))

def cases(num):
    count = 0
    c_max = num // 3
    for c in reversed(range(0,c_max + 1)):
        left_num = num - 3 * c
        b_max = left_num // 2
        for b in reversed(range(0,b_max+1)):
            left_num2 = left_num - 2 * b
            a = left_num2
            count += combination(a+b+c,a) * combination(b+c,b)
    print(count)

def main():
    T = int(input())
    
    for i in range(T):
        num = int(input())
        cases(num)
        
main()