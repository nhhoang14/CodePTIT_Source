# https://code.ptit.edu.vn/student/question/PY02034
# ĐẾM CÁC SỐ CÓ HAI CHỮ SỐ

s = input()
res = {}
for i in range(0, len(s), 2):
    pair = s[i:i+2]
    if len(pair) == 2:
        res[pair] = res.get(pair, 0) + 1
for key in res.keys():
    print(f"{key} {res[key]}")
