from itertools import combinations
from itertools import product

input_nums = input().split(" ")
input_letters = input().split(" ")

vowels = [] # 1번 이상
consonants = [] # 2번 이상
codes = [] # 암호 담는 리스트

for letter in input_letters:
    if letter in ['a','e','i','o','u']:
        vowels.append(letter)
    else:
        consonants.append(letter)

# (1,n-1), (2,n-2), ..., (n-2, 2)

def return_codes(vowel, consonant, vowel_num):
    code_list = []
    ddd = product(combinations(vowel, vowel_num), combinations(consonant, int(input_nums[0])-vowel_num))
    for dd in ddd:
        str = ''
        for j in dd:
            for k in j:
                str += k

        code_list.append(''.join(sorted(str))) # 문자열을 sorted 하면 list의 형태로 나옴 -> join을 해주어야 한다

    return code_list


for i in range(1, int(input_nums[0])-1):
    codes += return_codes(vowels, consonants, i)

for code in sorted(codes):
    print(code)





