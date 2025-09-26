# https://code.ptit.edu.vn/student/question/PYKT082
# TÍNH ĐIỂM THI IELTS

def getMark(n):
    intervals = [
        (39, 40, 9.0),
        (37, 38, 8.5),
        (35, 36, 8.0),
        (33, 34, 7.5),
        (30, 32, 7.0),
        (27, 29, 6.5),
        (23, 26, 6.0),
        (20, 22, 5.5),
        (16, 19, 5.0),
        (13, 15, 4.5),
        (10, 12, 4.0),
        (7, 9, 3.5),
        (5, 6, 3.0),
    ]
    for start, end, mark in intervals:
        if start <= n <= end:
            return mark
    return 2.5

def getForm(n):
    tmp = n - int(n)
    if 0.25 <= tmp < 0.5 or 0.5 < tmp < 0.75:
        return int(n) + 0.5
    elif 0.75 <= tmp < 1:
        return int(n) + 1.0
    else:
        return float(int(n))

for _ in range(int(input())):
    r, l, s, w = map(float, input().split())
    overall = (getMark(r) + getMark(l) + s + w) / 4
    print(getForm(overall))
