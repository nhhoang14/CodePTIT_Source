# https://code.ptit.edu.vn/student/question/PY03005
# THỐNG KÊ TỪ KHÁC NHAU THEO NGƯỠNG K

import re

dict = {}
n, cs = map(int, input().split())
for _ in range(n):
    words =  re.split(r'[^a-z0-9]+', input().strip().lower())
    words = [w for w in words if w]
    for w in words:
        dict[w] = dict.get(w, 0) + 1
for k, v in sorted(dict.items(), key=lambda x: (-x[1], x[0])):
    if v >= cs:
        print(k, v)