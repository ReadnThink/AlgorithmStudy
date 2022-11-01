# 14889 스타트와 링크 https://www.acmicpc.net/problem/14889
# combination 사용

import itertools

def main():
    N = int(input())
    
    arr = []
    for i in range(N):
        arr.append(list(map(int,input().split())))
        
    combination = itertools.combinations(range(N),int(N/2))
    sum = []
    count = 0
    for comb in combination:
        sum.append(0)
        c = itertools.combinations(comb,2)
        for (i,j) in c:
            sum[count] += arr[i][j] + arr[j][i]
        count += 1

    min_val = 100 * N
    for i in range(int(count/2)):
        difference = abs(sum[i] - sum[count-1-i])
        min_val = min(min_val,difference)
    
    print(min_val)

main()