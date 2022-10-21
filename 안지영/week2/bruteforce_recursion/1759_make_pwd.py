# 1759 https://www.acmicpc.net/problem/1759
# 성공 - dfs(브루트포스 N과 M 문제의 char 버젼), 모음 count하는 함수



pwd = []

def count_vowel(arr):
    cnt = 0
    vowel = ['a','e','i','o','u']

    for i in arr:
        if i in vowel:
            cnt+=1
    
    return cnt

def possible_pwd(arr,L):
    
    if len(pwd) == L:
        cnt_vowel = count_vowel(pwd)
        if cnt_vowel >= 1 and L-cnt_vowel >= 2:
            print(''.join(pwd))
        return
    
    for idx, i in enumerate(arr):
        if i not in pwd:
            pwd.append(i)
            possible_pwd(arr[idx+1:],L)
            pwd.pop()

def main():
    L,C = map(int, input().split())

    arr = list(input().split())
    arr.sort()
    possible_pwd(arr,L)

main()