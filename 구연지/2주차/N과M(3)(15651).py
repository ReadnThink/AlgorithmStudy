# 1) 중복 순열 -> product: cartesian product(내적)
# 2) itertool에서 순서쌍 구할 수 있는 메소드 -> zip

from itertools import product
from print_iter import print_iter
#
#
inputs = input().split(" ")
nums_list = list(product(range(1, int(inputs[0])+1), repeat = int(inputs[1])))

print_iter(nums_list)


# for nums in nums_list:
#     print_str = ""
#     for num in nums:
#         print_str += f"{num} "
#
#     print(print_str)