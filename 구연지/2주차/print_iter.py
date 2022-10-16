import itertools
from itertools import *


def print_iter(nums_list):
    # 메소드를 바로 넣을 수 있는 방법이...? ㅜㅜ
    # inputs = input().split(" ")
    # if method == itertools.product:
    #     nums_list = list(method(range(1, int(inputs[0])+1), repeat=int(inputs[1])))
    # elif method in [itertools.permutations, itertools.combinations, itertools.combinations_with_replacement]:
    #     nums_list = list(method(range(1, int(inputs[0])+1), int(inputs[1])))
    #     print(nums_list)
    # else:
    #     raise Exception("You got wrong method. Please write iter methods in itertools library. Thank you")

 # 전역변수 선언

    for nums in nums_list:
        print(nums)
        print_str = ""
        for num in nums:
            print(num)
            print_str += f"{num} "

        print(print_str)
