# https://code.ptit.edu.vn/student/question/PY02030
# PHÂN CHIA NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2: return False
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

n = int(input())
tmp = set(map(int,input().split()))
a = list(tmp)
found = False
total = sum(a)
for i in range(len(a)):
    t1 = sum(a[:(i + 1)])
    if isPrime(t1) and isPrime(total - t1):
        print(i)
        found = True
        break
if not found:
    print("NOT FOUND")