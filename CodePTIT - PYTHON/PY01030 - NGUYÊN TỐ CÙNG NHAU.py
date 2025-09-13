# https://code.ptit.edu.vn/student/question/PY01030
# NGUYÊN TỐ CÙNG NHAU

import math

n, k = map(int, input().split())
cnt = 0
for i in range(10**(k-1), 10**k):
    if math.gcd(n, i) == 1:
        print(i, end=' ')
        cnt += 1
    if cnt == 10:
        print()
        cnt = 0