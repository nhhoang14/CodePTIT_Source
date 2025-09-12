#https://code.ptit.edu.vn/student/question/PY01060
#TÍCH CHỮ SỐ - TỔNG CHỮ SỐ

for t in range(int(input())):
    s = input()
    total = 0
    mul = 1
    found = False
    for i in range(len(s)):
        if i % 2 != 0:
            total += int(s[i])
        elif s[i] != '0':
            mul *= int(s[i])
            found = True
    if not found:
        mul = 0
    print(mul, total, end=' ')
    print()