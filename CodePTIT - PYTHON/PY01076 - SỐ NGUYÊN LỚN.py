# https://code.ptit.edu.vn/student/question/PY01076
# SỐ NGUYÊN LỚN

def UCLN(a, b):
    while b:
        a, b = b, a % b
    return a

for _ in range(int(input())):
    a = int(input())
    b = int(input())
    gcd = UCLN(a, b)
    print(gcd)
