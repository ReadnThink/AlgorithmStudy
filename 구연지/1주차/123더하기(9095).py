input_num = int(input())

count = 0;

three_que = input_num//3
three_remain = input_num%3
two_que = input_num//2
two_remain = input_num%2

count += 1
count += three_remain
count += (three_que-1)*3
count += two_que

print(count)

