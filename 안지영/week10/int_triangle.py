# 프로그래머스 정수 삼각형 https://school.programmers.co.kr/learn/courses/30/lessons/43105?language=python3
# 다이내믹 프로그래밍. 위에 단위까지 최댓값 기록하기


def solution(triangle):
        
    for i in range(1,len(triangle)):
        for j in range(len(triangle[i])):
             left = triangle[i-1][j-1] if j-1 >= 0 else 0
             right = triangle[i-1][j] if j < len(triangle[i-1]) else 0
             triangle[i][j] += max(left,right)
    
    return max(triangle[-1])

triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))

