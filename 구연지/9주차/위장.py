def solution(clothes):

    # 반드시 1개는 입어야 함
    # 한 카테고리에서 하나씩만
    # 2,1이면 3*2-1(다 안입는 경우)
    answer = 1

    category_dictionary = {}

    for i in range(len(clothes)):
        # 없으면 추가하고
        # 있으면 1

        if (clothes[i][1] in category_dictionary.keys()):
            category_dictionary[clothes[i][1]] += 1
        else:
            category_dictionary[clothes[i][1]] = 1


    values = list(category_dictionary.values())

    for i in range(len(values)):
        answer = answer * (values[i]+1)


    answer -= 1

    return answer

print(solution([["hello", "hello"], ["hello", "hello2"]]))