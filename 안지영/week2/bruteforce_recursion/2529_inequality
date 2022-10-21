# 2529 https://www.acmicpc.net/problem/2529
# 성공 : 하지만 min val, max val 정리 필요. 중복되는 부분 처리 필요

cases = []

def dfs(arr, idx):
    
    if len(cases) == len(arr) + 1:
        val = ''.join(map(str,cases))
       
        global max_val
        global min_val
        max_val = max(max_val,val)
        min_val = min(min_val,val)
        return
    
    if idx < 0:
        for i in range(10):          
            cases.append(i)
            dfs(arr,idx+1)
            cases.pop()
        
    elif arr[idx] == '>':
        for i in range(0,cases[-1]):                
            if i not in cases:
                cases.append(i)
                dfs(arr,idx+1)
                cases.pop()
                 
    elif arr[idx] == '<':
        for i in range(cases[-1]+1,10):
            if i not in cases:
                cases.append(i)
                dfs(arr,idx+1)
                cases.pop()
    
def main():
    m = int(input())

    global min_val, max_val 
    max_val = str(0)
    min_val = str(10**(m)-1)
    arr = input().split()
        
    dfs(arr,-1)
    print(max_val)
    print(min_val)
main()