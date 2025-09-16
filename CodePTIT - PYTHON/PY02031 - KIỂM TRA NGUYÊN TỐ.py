# https://code.ptit.edu.vn/student/question/PY02031PY02031
# KIỂM TRA NGUYÊN TỐ

import math

def isPrime(n):
    if n < 2: return 0
    for i in range(2, int(math.isqrt(n)) + 1):
        if n % i == 0:
            return 0
    return 1

n, m = map(int, input().split())
tmp = []
for i in range(n):
    tmp.append([int(j) for j in input().split()])

for i in range(n):
    for j in range(m):
        print(isPrime(tmp[i][j]), end=' ')
    print()