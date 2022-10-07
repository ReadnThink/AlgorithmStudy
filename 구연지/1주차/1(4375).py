#  왜 틀렸지...?
try :
    input_number = int(input())

    if input_number == 2 or input_number ==5:
        pass
    else:
        find_multiple = False
        multiple_number = 0


        while find_multiple == False:
            multiple_number = multiple_number*10 +1
            if multiple_number%input_number == 0:
                find_multiple = True

        print(str(multiple_number).count('1'))
except :
    pass





