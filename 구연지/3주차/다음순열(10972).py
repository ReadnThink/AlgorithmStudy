from itertools import permutations

range_num = int(input())
inputs = tuple([int(i) for i in input().split(" ")])
permute_dictionary = {}
permute_dictionary_rev ={}

# permutation이 리스트 안에 튜플 형식으로 자리함
# 순서대로 정렬됨
# 메모리 초과 어떻게 해결하지...?

permute_nums = permutations(range(1,range_num+1), range_num)


idx = 0;
for num in permute_nums:
    permute_dictionary[idx] = num
    permute_dictionary_rev[num] = idx
    idx += 1

result = permute_dictionary[permute_dictionary_rev[inputs]+1]
str = "%d "* len(inputs)
print(str % result)





