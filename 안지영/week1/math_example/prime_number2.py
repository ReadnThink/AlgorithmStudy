# 1929 https://www.acmicpc.net/problem/1929
# 성공 - 에라토스테네스의 체

'''문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.'''

'''입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.'''
 
'''출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.'''

# 0 -> undefined / 1 -> primary / 2 -> non primary
def eratos(max):
    eratos_list = [0 for i in range(max+1)]
    for idx in range(2,max+1):
        if(eratos_list[idx] == 0):
            eratos_list[idx] = 1
            for i in range(2, (max//idx + 1)):
                eratos_list[idx * i] = 2
        elif(eratos_list[idx] == 2):
            continue
        else: continue
        
    return eratos_list
                

def main():
    M, N = map(int, input().split())
    
    eratos_list = eratos(N)
    cnt = 0
    for idx in range(M,N+1):
        value = eratos_list[idx] 
        if(value == 1):
            print(idx)
        
main()