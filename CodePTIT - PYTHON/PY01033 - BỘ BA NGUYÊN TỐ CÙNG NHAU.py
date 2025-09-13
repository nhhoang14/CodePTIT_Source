# https://code.ptit.edu.vn/student/question/PY01033
# BỘ BA NGUYÊN TỐ CÙNG NHAU

import math

l, r = map(int, input().split())
for i in range(l, r - 1):
    for j in range(i + 1, r):
        for k in range(j + 1, r + 1):
            if math.gcd(i, j) == math.gcd(j, k) == math.gcd(i, k) == 1:
                print(f"({i}, {j}, {k})")