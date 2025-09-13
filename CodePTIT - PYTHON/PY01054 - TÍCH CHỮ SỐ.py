# https://code.ptit.edu.vn/student/question/PY01054
# TÍCH CHỮ SỐ

for _ in range(int(input())):
    s = input()
    mul = 1
    for c in s:
        if c != '0':
            mul *= int(c)
    print(mul)