# https://code.ptit.edu.vn/student/question/PY01031
# ĐỔI CƠ SỐ

import string

lst = list(string.digits + string.ascii_uppercase)

def doiCoSo(s, n):
    res = []
    while s > 0:
        tmp = s % n
        res.insert(0, lst[tmp])
        s //= n
    return "".join(res)

for _ in range(int(input())):
    s, n = map(int, input().split())
    print(doiCoSo(s, n))
