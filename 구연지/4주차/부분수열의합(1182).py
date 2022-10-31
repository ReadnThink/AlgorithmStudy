
# N이 20 -> 모든 경우의 수를 다 생각하면 2^20 -> 100만 -> 할만한데?
# 2초 -> 2억번의 연산
# 재귀 함수 연산

from itertools import combinations

input_info = input().split(" ")
input_nums = [int(x) for x in input().split(" ")]

sum_list = []

def sum_cal(k):

    if (k==0): return

    combis = combinations(input_nums, k)

    for combi in combis:
        sum_list.append(sum(combi))

    return sum_cal(k-1)


sum_cal(int(input_info[0]))

boolean_list = [(x==int(input_info[1])) for x in sum_list]

print(sum(boolean_list))