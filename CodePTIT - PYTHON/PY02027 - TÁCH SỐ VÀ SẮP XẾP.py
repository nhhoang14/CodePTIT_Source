# https://code.ptit.edu.vn/student/question/PY02027
# TÁCH SỐ VÀ SẮP XẾP

ds = []
for _ in range(int(input())):
    s = input()
    num = ""
    for c in s:
        if c.isdigit():
            num += c
        elif num:
            ds.append(int(num))
            num = ""
    if num:
        ds.append(int(num))

ds.sort()
for x in ds:
    print(x)
