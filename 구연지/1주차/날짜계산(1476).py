# 정답

inputs = input().split(' ')
E = int(inputs[0]) % 15
S = int(inputs[1]) % 28
M = int(inputs[2]) % 19
# E는 15까지, S는 28까지, M은 19까지

number_range = [range(1, 15*28*19+1)]

final_num = 0



for num in range(1,15*28*19+1):
    if E == num%15:
        if S == num%28:
            if M == num%19:
                final_num += num
                break


print(final_num)