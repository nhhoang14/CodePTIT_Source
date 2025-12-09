# https://code.ptit.edu.vn/student/question/PY02043
# ĐẾM SỐ TRONG XÂU

for _ in range(int(input())):
    s = input().strip()
    n = input().strip()
    cnt = 0
    range = len(n)
    i = 0
    while i < len(s):
        tmp = s[i:i+range]
        if tmp == n:
            cnt += 1
            i += range
        else:
            i += 1
    print(cnt)