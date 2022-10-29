# 10973 https://www.acmicpc.net/problem/10973
# 성공 ! 

def main():
    
    N = int(input())
    
    arr = list(map(int,input().split()))

    left = []    
    stop = False
    
    while not stop:
        
        if len(arr) == 1:
            break
        
        left.append(arr.pop())
        
        if left[-1] < arr[-1]:
            for i in range(len(left)):
                if left[i] < arr[-1]:
                    left[i],arr[-1] = arr[-1],left[i]
                    break
            arr = arr + left
            stop = True
              
    if stop == False:
        print('-1')
    else:
        print(' '.join(map(str,arr)))
main()
