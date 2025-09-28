# https://code.ptit.edu.vn/student/question/PY02046
# PHÂN CHIA NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2: return 0
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return 0
    return 1


n = int(input())
nums = list(map(int, input().split()))
lst = list(dict.fromkeys(nums))
total = sum(lst)
tmp = 0
pos = -1
for i in range(len(lst)):
    tmp += lst[i]
    if isPrime(tmp) and isPrime(total - tmp):
        pos = i
        break

print(pos if pos >= 0 else "NOT FOUND")
