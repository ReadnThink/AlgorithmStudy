# 10819 https://www.acmicpc.net/problem/10819
# 실패 : 이유를 아직 모르겠음

s = []
max_val = 0 

def difference():
  sum = 0
  for i in range(1, len(s)):
    sum += abs(s[i]-s[i-1])

  return sum

def dfs(N, arr):
 
  global max_val

  if len(s) == N:
    print(s, end = ' ')
    val = difference()
    print(val)
    max_val = max(max_val,val)
    return

  for num in arr:
    if num not in s:
      s.append(num)
      dfs(N, arr)
      s.pop()

def main():
  
  N = int(input())
  arr = list(map(int,input().split()))

  dfs(N, arr)
  print(max_val)

main()

'''
왜 인자를 dfs(N,arr[1:])로 넘기면 안되는 지 ?
→ 당연히 안되지. 첫번째 값을 썼으면 가능하겠지만
s = [15]
이런 애들은 어떡해. 그러면 인자로 어차피 15는 포함되어 넘어가는데 20은 포함되지 않는 상황이 생김.
'''