# 정답

inputs = input().split(" ");
num1 = int(inputs[0]); num2 = int(inputs[1])

# 시간 초과
# for nn in range(min(num1, num2)+1, 0, -1):
#     if (num1 % nn ==0) and (num2 % nn ==0):
#         print(nn)
#         break
#
#
# for mm in range(max(num1, num2), num1*num2+1):
#     if (mm % num1 ==0) and (mm % num2 ==0):
#         print(mm)
#         break

# 유클리드 호제법을 통해서 진행
# 재귀 함수 이용

def gcd(a, b):
    if (b==0): return a
    else: return gcd(b, a%b)

def lcm(a, b):
    return int(a*b/gcd(a,b))


print(gcd(max(num1, num2), min(num1, num2)))
print(lcm(max(num1, num2), min(num1, num2)))