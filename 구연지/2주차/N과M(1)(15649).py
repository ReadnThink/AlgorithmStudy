# 순열 이용하기

from itertools import permutations
from print_iter import print_iter

inputs = input().split(" ")
nums_list = permutations(list(range(1, int(inputs[0])+1)), int(inputs[1]))
#

# for nums in nums_list:
#     print_str = ""
#     for num in nums:
#         print_str += f"{num} "
#
#     print(print_str)

print_iter(nums_list)