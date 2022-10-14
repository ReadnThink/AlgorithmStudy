# 정답
# 왜 틀렸을까?? -> 문제 제대로 읽기!

# 9명 중에 2명을 선택해서 제외 -> 9c2 -> 36가지 경우의 수 발생
from itertools import combinations

num1 = int(input())
num2 = int(input())
num3 = int(input())
num4 = int(input())
num5 = int(input())
num6 = int(input())
num7 = int(input())
num8 = int(input())
num9 = int(input())

numbers_list = [num1, num2, num3, num4, num5, num6, num7, num8, num9]
numbers_combi = list(combinations(numbers_list, 7))

# 10,10,10,15,15,15,15,15,15

for numbers in numbers_combi:
    if sum(numbers) == 100:
        for num in sorted(numbers):
            print(num)

        break



