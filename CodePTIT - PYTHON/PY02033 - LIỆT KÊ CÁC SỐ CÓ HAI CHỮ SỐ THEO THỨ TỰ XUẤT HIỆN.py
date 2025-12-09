# https://code.ptit.edu.vn/student/question/PY02033
# LIỆT KÊ CÁC SỐ CÓ HAI CHỮ SỐ THEO THỨ TỰ XUẤT HIỆN

s = input()
res = []
for i in range(0, len(s), 2):
    pair = s[i:i+2]
    if len(pair) == 2 and pair not in res:
        res.append(pair)
print(*res)