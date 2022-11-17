import sys

# 왜 fucntion이 다 안먹을까...하아
class Calculate:

    def __init__(self):
        self.list = []

    def add(self, input):
        try:
            self.list.index(input)
        except ValueError:
            # 해당 값이 없을 때 Error 발생 -> error 발생할 때만 append
            self.list.append(input)

    def remove(self, input):
        try:
            self.list.remove(input)
        except ValueError:
            pass

    def check(self, input):
        try:
            self.list.index(input)
            print(1)
        except ValueError:
            print(0)

    def toggle(self, input):
        try:
            self.list.index(input)
            self.list.remove(input)
        except ValueError:
            self.list.append(input)

    def all(self):
        self.list = [x for x in range(1,21)]

    def empty(self):
        self.list = []


cal = Calculate()
test_case_number = int(input())
x_value = 0
function_dictionary = {"add":cal.add(x_value), "remove":cal.remove(x_value), "check":cal.check(x_value),
                       "toggle":cal.toggle(x_value), "all":cal.all(), "empty":cal.empty()}

for i in range(test_case_number):
    testcode = sys.stdin.readline().replace("\n", "").split(" ")
    if len(testcode) > 1:
        x_value = int(testcode[1])
        function_dictionary[testcode[0]]
    else:
        function_dictionary[testcode[0]]

print(cal.list)






