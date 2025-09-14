# https://code.ptit.edu.vn/student/question/ICPC0106
# ĐỔI CƠ SỐ - 2

for _ in range(int(input())):
    n = int(input())
    s = input()
    dec = int(s, 2)
    if n == 2:
        print(s)
    elif n == 8:
        print(oct(dec)[2:])
    elif n == 16:
        print(hex(dec)[2:].upper())
    else:
        res = ""
        while dec > 0:
            res = str(dec % 4) + res
            dec //= 4
        print(res)