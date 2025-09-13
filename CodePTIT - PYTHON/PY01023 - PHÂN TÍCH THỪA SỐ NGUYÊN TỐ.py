# https://code.ptit.edu.vn/student/question/PY01023
# PHÂN TÍCH THỪA SỐ NGUYÊN TỐ

import math

for _ in range(int(input())):
    n = int(input())
    print(1, end=' ')
    for i in range(2, math.isqrt(n) + 1):
        if n % i == 0:
            cnt = 0
            while n % i == 0:
                cnt += 1
                n //= i
            print(f"* {i}^{cnt}", end=' ')
    if n > 1:
        print(f"* {n}^1", end='')
    print()