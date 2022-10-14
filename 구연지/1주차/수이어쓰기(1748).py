# 정답
input_num = int(input())
input_len = len(str(input_num))

length = 0
for i in range(1,input_len):
     length += i * (10**i- 10**(i-1))

length += input_len * (input_num - 10**(input_len-1)+1)


print(length)