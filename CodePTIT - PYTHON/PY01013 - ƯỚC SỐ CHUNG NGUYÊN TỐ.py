# https://code.ptit.edu.vn/student/question/PY01013
# ƯỚC SỐ CHUNG NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

for _ in range(int(input())):
    a, b = map(int, input().split())
    ucln = math.gcd(a, b)
    total = 0
    while ucln > 0:
        total += ucln % 10
        ucln //= 10
    if isPrime(total):
        print("YES")
    else:
        print("NO")