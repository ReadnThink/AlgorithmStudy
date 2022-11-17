# 2(n-1) 배열에서 한 마리를 더 배치하거나(이걸 어떻게 고려 -> n-2로 하면 포함 되지 않나) 그냥 두거나
# 2x1일 때는 한 마리 넣거나(2) 안 넣거나(1)

"""
f(1) = 3
f(2) = 3 + 2x2 = 7
f(3) = 3x3 + 4x2 = 17
f(4) = 7x3 + 10x2 = 41
f(5) = 99
f(6) = 239
f(7) = 577
f(8) = 1393
...
f(n) = 2(f(n-1) - f(n-2)) + 3f(n-2) = 2f(n-1) + f(n-2)

"""



# 메모리 문제
# row_num = int(input())
# result_list = [0] * row_num
# result_list[0] = 3
# result_list[1] = 7
#
# for i in range(2, row_num):
#     result_list[i] = 2*result_list[i-1] + result_list[i-2]
#
# # print(result_list)
# print(result_list[row_num-1]%9901)


"""
9901*A + B + 9901*C + D = 9901(A+C) +D  
"""

row_num = int(input())
forward_num = 3 # n-2
backward_num = 7 # n-1

# N이 1부터 10,000 까지 -> 1일때랑 2일때 조건을 반드시 포함해주어야한다!!!!
if row_num == 1:
    print(3)
elif row_num == 2:
    print(7)
else:
    for i in range(row_num-2):
        temp = backward_num
        backward_num = 2*backward_num + forward_num
        forward_num = temp
        backward_num %= 9901
        # 9901 넘어가면 나머지가 다음으로 넘어가기 때문에 backward만 해도 되는데...


    print(backward_num%9901)
# 왜 틀렸을까? 100%에서? -> 1일때, 2일때 조건을 안 넣어줌


# import sys
# sys.setrecursionlimit(10**10)

# 파이썬의 재귀함수 -> 1000이 한계 -> recursionlimit걸어준다


# def calculate_cases(rows):
#
#     if rows == 1:
#         return 3
#     elif rows == 2:
#         return 7
#
#     if result_list[rows-1] != 0:
#         return result_list[rows-1]
#     else:
#        result_list[rows-1] = 2*calculate_cases(rows-1) + calculate_cases(rows-2)
#
#     return result_list[rows-1]
#
# print(calculate_cases(row_num)%9901)

# -> 시간초과...
# 꼬리 재귀 방식? 어떻게...?

# calculate_case(rows, total)
# calculate_case(rows-1, total+row를 넣었을 때 더해지는 수)
