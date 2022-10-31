from itertools import combinations
import sys

lines = sys.stdin.readlines()
for line in lines:
    if line != "0":
        input_list = [int(x) for x in line().split(" ")]
        K = input_list[0]
        S = input_list[1:]

        combi = combinations(S,6)

        str = "%d "* 6
        for com in combi:
            print(str % com)

        print("\n")
        print("\n")
    else:
        break;

