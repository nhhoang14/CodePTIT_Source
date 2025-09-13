# https://code.ptit.edu.vn/student/question/PY01016
# GIẢI MÃ

tc = int(input())
for _ in range(tc):
    s = input()
    res = ''
    for i in range(0, len(s), 2):
        res += s[i] * int(s[i + 1])
    print(res)