# 2*2 -> 1*2 2개 or 2*1 2개, 2*2 1개
# 2*1 -> 1개
# 홀수인지 짝수인지에 따라 다름

# 1과 2 더하기랑 같은 문제
# 2*1과 2*2는 어차피 비슷하게 움직임

from itertools import product

n = int(input())
sum1 = 0
for num in range((n+1)//2, n+1):
    numlist = product(range(1,3), repeat = num)
    for nums in numlist:
        if(sum(nums) == n):
            sum1 = sum1 + (nums.count(1)+1)//2 + nums.count(2)*2
            print(nums)

print(sum1 % 10007)


# 자리를 바꾸는 케이스...?
# 이상한데...?
