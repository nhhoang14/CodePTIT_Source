# https://code.ptit.edu.vn/student/question/PY02063
# TÍCH LỚN NHẤT

input()
a = list(map(int, input().split()))
a.sort()

print(max(
    a[0] * a[1],
    a[-2] * a[-1],
    a[0] * a[1] * a[-1],
    a[-1] * a[-2] * a[-3]
))