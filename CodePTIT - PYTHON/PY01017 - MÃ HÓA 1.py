# https://code.ptit.edu.vn/student/question/PY01017
# MÃ HÓA 1

tc = int(input())
for _ in range(tc):
    s = input()
    res = ''
    cnt = 0
    ch = s[0]
    for c in s[0:]:
        if c == ch:
            cnt += 1
        else:
            res += str(cnt) + ch
            cnt = 1
            ch = c
    res += str(cnt) + ch
    print(res)