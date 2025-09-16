# https://code.ptit.edu.vn/student/question/PYKT086
# CHUYỂN ĐỔI NHỊ PHÂN

with open("DATA.in", "r", encoding="utf-8") as f:
    for _ in range(int(f.readline())):
        n = int(f.readline())
        s = f.readline()
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