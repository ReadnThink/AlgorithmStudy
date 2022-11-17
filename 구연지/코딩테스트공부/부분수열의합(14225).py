# 수열의 크기가 20 -> 이전과 마찬가지로 2^20 -> 약 100민

# 수열 전체의 합은 100,000*20 -> 200만 보다 약간 작음
# 수열 전체의 합에 대해서 iter를 돌리면...?

#

from itertools import combinations
import sys




# input_list_size = int(input())
# input_nums = [int(x) for x in input().split(" ")]
#
# sum_list = []
#
# def sum_cal(k):
#
#     if (k==0): return
#
#     combis = combinations(input_nums, k)
#
#     for combi in combis:
#         sum_list.append(sum(combi))
#
#     return sum_cal(k-1)
#
#
# sum_cal(input_list_size)
#
# sorted_list = sorted(sum_list)
#
#
# for i in range(0,len(sorted_list)-1):
#     if (sorted_list[i+1] -sorted_list[i] > 1):
#         print(sorted_list[i]+1)
#         break