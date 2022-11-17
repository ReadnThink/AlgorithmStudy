# 왜 다른 값이 나올까?
import math

input_num = int(input())

def out_fa(num):
    result = 0
    range_num = int(math.floor(math.sqrt(num)))
    # 약수는 루트값을 기준으로 양쪽으로 나타남

    for divisor in range(1,range_num +1):
    # 루트값일 때
        if (divisor ** 2 == num):
            result += divisor
        elif(num % divisor ==0):
            result += divisor + num//divisor
            # 작은쪽 더하기 큰쪽

        return result

sum = 0
for num in range(1, input_num+1):
    sum += out_fa(num)

print(sum)