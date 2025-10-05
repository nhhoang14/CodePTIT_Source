# https://code.ptit.edu.vn/student/question/PYKT091
# TÌM TỪ THUẬN NGHỊCH DÀI NHẤT

from collections import Counter

with open("VANBAN.in", "r", encoding="utf-8") as f:
    words = f.read().split()

maxx = 0
res = []
cnt = Counter(words)
for x in words:
    if x == x[::-1]:
        if len(x) > maxx:
            maxx = len(x)
            res = [x]
        elif len(x) == maxx and x not in res:
            res.append(x)
for x in res:
    print(x, cnt[x])