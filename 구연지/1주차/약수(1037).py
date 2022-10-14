# 정답
size = int(input())
nums = input().split(" ")
nums_list = []
for i in range(size):
    nums_list.append(int(nums[i]))

nums_list = sorted(nums_list)

print(nums_list[0]*nums_list[-1])