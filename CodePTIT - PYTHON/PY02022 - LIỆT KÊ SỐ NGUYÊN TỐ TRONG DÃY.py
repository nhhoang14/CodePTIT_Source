# https://code.ptit.edu.vn/student/question/PY02022
# LIỆT KÊ SỐ NGUYÊN TỐ TRONG DÃY

import math
from collections import defaultdict

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
lst = list(map(int, input().split()))[:n]
mp = defaultdict(int)

for x in lst:
    if isPrime(x):
        mp[x] += 1

for key, value in mp.items():
    print(key, value)
