# https://code.ptit.edu.vn/student/question/ICPC0115
# SỐ KRISH

import math

def check(n):
    total = 0
    tmp = n
    while tmp > 0:
        total += math.factorial(tmp % 10)
        tmp //= 10
    return n == total

for _ in range(int(input())):
    n = int(input())
    print("Yes" if check(n) else "No")