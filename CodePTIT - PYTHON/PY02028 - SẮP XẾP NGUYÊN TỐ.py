# https://code.ptit.edu.vn/student/question/PY02028
# SẮP XẾP NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2: return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
a = list(map(int, input().split()))
prime = [x for x in a if isPrime(x)]
prime.sort()
pos = 0
for i in range(n):
    if a[i] in prime:
        a[i] = prime[pos]
        pos += 1
print(*a)
