# https://code.ptit.edu.vn/student/question/PY02032
# LIỆT KÊ CÁC SỐ CÓ HAI CHỮ SỐ TĂNG DẦN

s = input()
res = []
for i in range(0, len(s), 2):
    pair = s[i:i+2]
    if len(pair) == 2 and pair not in res:
        res.append(pair)
res.sort()
print(*res)