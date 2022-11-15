from itertools import combinations_with_replacement

# 시간 초과 어떻게 해결할까?

card_num = int(input())
card_price = [int(x) for x in input().split(" ")]


def num_lists(x):
    result = []
    # 리스트로 append 하면 메모리 에러가 발생하지 않나...?
    for k in range(1,x+1):
        combi = combinations_with_replacement(range(1,x+1), k)
        for com in combi:
            if(sum(com) == x):
                result.append(com)

    return result


list1 = num_lists(card_num)
find_max_price = [0 for x in range(len(list1))]



for i in range(len(list1)):
    sum=0

    for num in list1[i]: sum += card_price[num-1]

    find_max_price[i] += sum

print(max(find_max_price))










