# 1182 부분수열의 합 https://www.acmicpc.net/problem/1182
# permutation 사용

import itertools

def main():
    N, S = map(int,input().split())
    
    arr = list(map(int,input().split()))
    
    count = 0
    
    for num in range(1,N+1):
        num_cases = itertools.combinations(arr,num)
        for case in num_cases:
            if sum(case) == S:
                count += 1
    
    print(count)

main()