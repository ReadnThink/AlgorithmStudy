# 프로그래머스 - 위장 https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=python3

def solution(clothes):
    combi = dict()
    for cloth in clothes:
        combi.setdefault(cloth[1],0)
        combi[cloth[1]] += 1
    
    values = list(combi.values())
    multiply = 1
    for value in values:
        multiply *= (value+1)
    
    return multiply -1

clothes = [["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]
print(solution(clothes))
