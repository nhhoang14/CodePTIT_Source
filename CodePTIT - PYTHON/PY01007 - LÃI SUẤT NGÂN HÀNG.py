#https://code.ptit.edu.vn/student/question/PY01007
#LÃI SUẤT NGÂN HÀNG

import math

tc = int(input())
for _ in range(tc):
    n, x, m = map(float, input().split())
    res = math.log(m / n, 1 + x / 100)
    print(math.ceil(res))