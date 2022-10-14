# 정답
inputs = input().split(" ");
A = int(inputs[0]); B = int(inputs[1]); C = int(inputs[2])

print((A+B)%C)
print(((A%C) + (B%C))%C)
print((A*B)%C)
print(((A%C) * (B%C))%C)