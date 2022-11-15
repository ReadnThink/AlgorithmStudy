import sys

array_nums = int(input())

nums = sys.stdin.readline().split(" ")
test_lists = [num for num in nums]





# 배열의 길이가 1000
# O(N^2) -> iter 돌리는 것 X

# 뒤에서 부터 봤을 때
# n개 -> 1개 / n-1개 -> f(n) = f(n-1) +1 or f(n-1)


print(len(set(test_lists))) # set의 길이가 감소하는 길이의 최대일 것 -> 이거만큼만 iter?


# def decreasing_length(test_lists, count):
#
#     critical_value= max(test_lists[-(count-1):])
#
#     if count == 1:
#         return 1
#
#     if test_lists[-count] > critical_value:
#             return decreasing_length(test_lists, count-1) + 1
#     else: return decreasing_length(test_lists, count-1)

#
# print(decreasing_length(test_lists, len(test_lists)))

# 10 50 40 50 60 30 30 20 10
# 10 30 10 20 20 10
# 10 50 60 40 50 50 40 60 30 40 30 10