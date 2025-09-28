# https://code.ptit.edu.vn/student/question/PY03006
# THỐNG KÊ TỪ KHÁC NHAU KHÔNG CHỨA CHỮ SỐ

import re

dict = {}
for _ in range(int(input())):
    words =  re.split(r'[^a-z]+', input().strip().lower())
    words = [w for w in words if w]
    for w in words:
        dict[w] = dict.get(w, 0) + 1
for k, v in sorted(dict.items(), key=lambda x: (-x[1], x[0])):
    print(k, v)